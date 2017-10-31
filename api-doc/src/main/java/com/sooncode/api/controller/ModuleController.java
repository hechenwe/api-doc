package com.sooncode.api.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sooncode.api.entity.Module;
import com.sooncode.api.model.AddModuleModel;
import com.sooncode.api.util.MyUUID;
import com.sooncode.soonjdbc.ModelTransform;
import com.sooncode.soonjdbc.service.JdbcService;

@Controller
@RequestMapping("/moduleController")
public class ModuleController {

	@Autowired
	private JdbcService jdbcService;

	@RequestMapping(value = "addModule", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addModule(@RequestBody AddModuleModel amm) {
		Module m = ModelTransform.to(amm, Module.class);
		String moduleId = MyUUID.getUUID();
		m.setModuleId(moduleId);
		m.setCreatDate(new Date());
		m.setWeight(1);
		long n = jdbcService.save(m);
		Map<String, Object> map = new HashMap<String, Object>();
		boolean isAdd = (n == 1L) ;
		map.put("moduleId", isAdd ? moduleId : null);
		return map;

	}
}
