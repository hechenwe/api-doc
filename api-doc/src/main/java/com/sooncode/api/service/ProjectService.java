package com.sooncode.api.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sooncode.api.entity.Interfac;
import com.sooncode.api.entity.Module;
import com.sooncode.api.entity.Parameter;
import com.sooncode.api.entity.Project;
import com.sooncode.api.model.freemarker.InterfacModel;
import com.sooncode.api.model.freemarker.ModuleModel;
import com.sooncode.api.model.freemarker.ProjectModel;
import com.sooncode.api.util.RObject;
import com.sooncode.soonjdbc.dao.JdbcDao;
import com.sooncode.soonjdbc.page.One2Many;
import com.sooncode.soonjdbc.page.One2Many2Many;
import com.sooncode.soonjdbc.page.Page;
import com.sooncode.soonjdbc.sql.condition.Conditions;
import com.sooncode.soonjdbc.sql.condition.ConditionsBuilderProcess;

@Service
public class ProjectService {
	
	@Autowired
	private JdbcDao jdbcDao;
	
	public ProjectModel getProjectAllInfo(String projectId){
		Project p = new Project();
		p.setProjectId(projectId);
		
		Conditions conditions =  ConditionsBuilderProcess.getConditions(p, new Module(),new Interfac());
		
		Page page = jdbcDao.getPage(1L, Long.MAX_VALUE, conditions);
		
		One2Many2Many<Project,Module,Interfac> o2m2m = page.getOne2Many2Many();
		
		p = o2m2m.getOne();
		ProjectModel pm = (ProjectModel) RObject.to(p, ProjectModel.class);
		List<One2Many<Module, Interfac>> list  = o2m2m.getOne2manys(); 
		List<ModuleModel> mmes = new LinkedList<ModuleModel>();
		for (One2Many<Module, Interfac> o2m : list) {
			Module m = o2m.getOne();
			ModuleModel mm = (ModuleModel) RObject.to(m, ModuleModel.class);
			 
			List<Interfac> interfaces = o2m.getMany();
			List<InterfacModel> interfaceModels = new LinkedList<InterfacModel>();
			for (Interfac interfac : interfaces) {
				InterfacModel im =  (InterfacModel) RObject.to(interfac, InterfacModel.class);
				
				 Parameter para = new Parameter();
				 para.setInterfacId(interfac.getInterfacId());
				 List<Parameter> paras = jdbcDao.gets(para);
				im.setParameters(paras);
				interfaceModels.add(im);
			}
			mm.setInterfacs(interfaceModels);
			mmes.add(mm);
		}
		 
		pm.setModules(mmes);
		return pm;
	}
}
