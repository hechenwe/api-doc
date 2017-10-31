package com.sooncode.api.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sooncode.api.entity.Parameter;
import com.sooncode.api.model.AddParameterModel;
import com.sooncode.api.util.MyUUID;
import com.sooncode.soonjdbc.ModelTransform;
import com.sooncode.soonjdbc.service.JdbcService;

@Controller
@RequestMapping("/parameterController")
public class ParameterController {

	@Autowired
	private JdbcService jdbcService;

	@RequestMapping(value = "addParameter", method = RequestMethod.POST)
	@ResponseBody
	public void addParameter(@RequestBody List<AddParameterModel> apms) {
		List<Parameter> ps = ModelTransform.tos(apms, Parameter.class);
		for (Parameter p : ps) {
			String parameterId = MyUUID.getUUID();
			p.setParameterId(parameterId); 
			p.setCreatDate(new Date());
			p.setWeight(1);
		}
		jdbcService.saves(ps);
		 

	}
}
