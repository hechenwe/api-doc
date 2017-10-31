package com.sooncode.api.controller;

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sooncode.api.entity.ParameterRetur;
import com.sooncode.api.model.AddParameterReturnsModel;
import com.sooncode.api.util.MyUUID;
import com.sooncode.soonjdbc.ModelTransform;
import com.sooncode.soonjdbc.service.JdbcService;

@Controller
@RequestMapping("/parameterReturnController")
public class ParameterReturnController {

	@Autowired
	private JdbcService jdbcService;

	@RequestMapping(value = "addParameterReturns", method = RequestMethod.POST)
	@ResponseBody
	public void addParameterReturns(@RequestBody List<AddParameterReturnsModel> aprms) {
		List<ParameterRetur> prs = ModelTransform.tos(aprms, ParameterRetur.class);
		for (ParameterRetur pr : prs) {
			pr.setParameterId(MyUUID.getUUID());
		}
		jdbcService.saves(prs);

	}
}
