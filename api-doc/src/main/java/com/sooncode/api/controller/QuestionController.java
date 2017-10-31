package com.sooncode.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sooncode.soonjdbc.page.Page;
import com.sooncode.soonjdbc.service.JdbcService;
import com.sooncode.soonjdbc.sql.condition.Conditions;
import com.sooncode.soonjdbc.sql.condition.ConditionsBuilderProcess;
import com.sooncode.soonjdbc.sql.condition.sign.InSign;

@Controller
@RequestMapping("questionController")
public class QuestionController {

	@Autowired
	private JdbcService jdbcService2;

	@RequestMapping(value = "getQuestion", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getQuestion(@RequestBody Question que) {

		MathQuestion q = new MathQuestion();

		Conditions c = ConditionsBuilderProcess.getConditions(q);
		String[] ids = new String[] { "017a99ec795048ad83dc1313f5e7902a", "f5baa4d648814f168b604c6f43b15759", "00011b02998f403e9c5dca53e03138a1", "0005a19de47842a5807530003a48b35b", "002433464b6a4f25ba79aac5c2fd56fe", "00246b596ea2432182c7c2d608cd173b", "002746ce72f6408291a1e7872295a8d0", "002ab6e7c36d46589f1406d2d8ceca5e", "003d4e5c401c4e37ac1674939d17a5ae", "00436473b1904c218b0f3de44f08e764", "004d5c4dc8fb4e5cac23201430324b58", "005461f56a524d69ad83adb4191a16d7", "017b643119d94fae93395de80197725f", "0182f1d5a93b4daf9629b369809a242b", "0186432e58da41f8ae81158028107d7d", "0186acef434048dbaa5893bc6f9ac891", "01904dfb96ee4f41b8b51793b4e66214", "019123e7fd304c58a7e6bd250dcbd40a",
				"0194c0c84a15429e8f352465541f56bd", "01988faca16d448e847c8be881f5a435" };
		c.setCondition("id", InSign.IN, ids);

		Map<String, Object> map = new HashMap<>();
		map.put("questions", jdbcService2.gets(c));

		return map;
	}
	
	private int n = 1;
	@RequestMapping(value = "getQuestion2", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getQuestion2(@RequestBody Question que) {
		
		MathQuestion q = new MathQuestion();
		q.setType("1");
		q.setSubjectName("数学");
		Page page = jdbcService2.getPage(n, 20, q);
		Map<String, Object> map = new HashMap<>();
		map.put("questions", page.getOnes());
		if(page.getOnes().size() < 20){
			 n = 1;
		}
		n ++ ;
		return map;
	}
}
