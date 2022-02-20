package com.journaldev.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.journaldev.model.TestForm;
import com.journaldev.service.TestManager;

@Controller
public class TestsController {

	// TODO uncomment after implementing a concrete TestManager
//	@Autowired
//	private TestManager testManager;
	
	@RequestMapping(value = "/tests/add", method = RequestMethod.GET)
	public ModelAndView getTests(Model model) {
		return new ModelAndView("tests/addTest", "testForm", new TestForm());
	}
	
	@RequestMapping(value = "/tests/submit", method = RequestMethod.POST)
	public String createTest(@ModelAttribute("testForm") TestForm testForm, Model model) {
		System.out.println("Name : " + testForm.getName());
        System.out.println("Description : " + testForm.getDescription());
        
        return "tests/listTest";
	}
}
