package com.sooncode.api.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sooncode.api.entity.Interfac;
import com.sooncode.api.entity.Module;
import com.sooncode.api.entity.Parameter;
import com.sooncode.api.entity.ParameterRetur;
import com.sooncode.api.model.AddInterfacModel;
import com.sooncode.api.model.GetAllInterfacesModel;
import com.sooncode.api.model.GetAllModulesModel;
import com.sooncode.api.model.response.GetAllInterfacesResponseModel;
import com.sooncode.api.util.MyUUID;
import com.sooncode.soonjdbc.ModelTransform;
import com.sooncode.soonjdbc.page.One2Many;
import com.sooncode.soonjdbc.page.Page;
import com.sooncode.soonjdbc.service.JdbcService;
import com.sooncode.soonjdbc.sql.condition.Conditions;

@Controller
@RequestMapping("/interfacController")
public class InterfacController {

	@Autowired
	private JdbcService jdbcService;

	@RequestMapping(value = "addInterfac", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addInterfac(@RequestBody AddInterfacModel aim) {
		Interfac i = ModelTransform.to(aim, Interfac.class);
		 
		String interfacId = MyUUID.getUUID();
		i.setInterfacId(interfacId);
		i.setCreatDate(new Date());
		i.setParameterFormat("JSON");
		i.setRequestType("POST");
		i.setReturnDataType("JSON");
		i.setStyle("GENERAL");
		i.setWeight(1);
		long n = jdbcService.save(i);
		Map<String, Object> map = new HashMap<String, Object>();
		boolean isAdd = (n == 1L) ;
		map.put("interfacId", isAdd ? interfacId : null);
		return map;

	}
	
	
	
	
	@RequestMapping(value = "getAllInterfaces", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getAllInterfaces(@RequestBody GetAllInterfacesModel gaim) {
		Interfac i = new Interfac();
		i.setModuleId(gaim.getModuleId());
		List<Interfac> interfaces = jdbcService.gets(i);
		List<GetAllInterfacesResponseModel> gairms = new LinkedList<>();
		
		for (Interfac interfac : interfaces) {
			
			Parameter p = new Parameter();
			p.setInterfacId(interfac.getInterfacId());
			List<Parameter> parameters = jdbcService.gets(p);
			ParameterRetur pr = new ParameterRetur();
			pr.setInterfacId(interfac.getInterfacId());
			List<ParameterRetur> parameterReturs = jdbcService.gets(pr);
			
			GetAllInterfacesResponseModel garm = new GetAllInterfacesResponseModel();
			garm.setInterfac(interfac);
			garm.setParameters(parameters);
			garm.setParameterReturns(parameterReturs);
			gairms.add(garm);
		}
		
		 
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("interfacesResponseModels", gairms);
		 
		return map;
		
	}
	 
	
	
	
	@RequestMapping(value = "getAllModules", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getAllModules(@RequestBody GetAllModulesModel gamm) {
		 
		Module m = new Module();
		m.setProjectId(gamm.getProjectId());
		
		List<Module> list = jdbcService.gets(m);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("modules", list);
		
		return map;
		
	}
}
