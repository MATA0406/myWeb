package com.j.myapp;

import java.util.List;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class test {
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Autowired
	private SqlSessionTemplate session;
	
	public SqlSessionTemplate getSession() {
		return session;
	}

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}


	@RequestMapping(value = "/job.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<ModelVO> a = session.selectList("com.spring.test.list");
		
		System.out.println(a);
		
		for(ModelVO b : a) {
			System.out.println(b.toString());
		}
		
	/*	for(a.iterator().hasNext()) {
			model.setId("JOB_ID");
			model.setTitle("JOB_TITLE");
			model.setMax("MIN_SALARY");
			model.setMin("MAX_SALARY");
		}*/
		
		model.addAttribute("model", a );
		
		return "test";
	}
	
}