package com.journaldev.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import com.journaldev.model.TestTemp;
import com.journaldev.model.Test;
import com.journaldev.model.TestForm;
import com.journaldev.service.TestManager;

@Controller
public class TestsController {

	// TODO uncomment after implementing a concrete TestManager
	@Autowired
	private TestManager testManager;
	
	@RequestMapping(value = "/tests/add", method = RequestMethod.GET)
	public ModelAndView getTests(Model model) {
		return new ModelAndView("tests/addTest", "testForm", new Test());
	}
	
	@RequestMapping(value = "/tests/list", method = RequestMethod.GET)
	public String listTests(Model model) {
		// TODO: replace following code with call to testManager.getTests();
        List<Test> testList = testManager.getAllTests();
        //System.out.println("Inside ListTests");
        model.addAttribute("Tests", testList);
      //  System.out.println("List Size = "+testList.size());
        return "tests/listTests";
	}
	
	

	@RequestMapping(value = "/tests/submit", method = RequestMethod.POST)
	public String createTest(@ModelAttribute("testForm") Test test, Model model) {
		System.out.println("Name : " + test.getTestName());
        System.out.println("Description : " + test.getDescription());
        System.out.println("CategoryId : "+ test.getCategoryId());
        
        testManager.addTest(test);
        
       // return listTests(model);
        List<Test> allTests = testManager.getTests(test.getCategoryId());
       // System.out.println("Inside ListTests");
        model.addAttribute("Tests", allTests);
        
        return "tests/listTests";
	}
	
	private List<Test> buildDummyList() {
		List<Test> testList = new ArrayList<Test>();
		testList.add(new Test(1001l, "Advanced Java", "Java Test for experienced professionals", 1, 120, 60, new Date(), 65));
		testList.add(new Test(1002l, "Java Fundamentals", "Java Test for experienced professionals", 1, 60, 40, new Date(), 65));
		testList.add(new Test(1003l, "Database Concepts", "Concepts on databases", 1, 60, 60, new Date(), 65));
		testList.add(new Test(1004l, "MySQL Database Fundamentals", "Java Test for experienced professionals", 1, 120, 60, new Date(), 65));
		testList.add(new Test(1005l, "PostgreSQL Database Fundamentals", "Java Test for experienced professionals", 1, 120, 60, new Date(), 65));
		testList.add(new Test(1006l, "MySQL Database Administration", "MySQL Administration Test for experienced DBA professionals", 1, 150, 60, new Date(), 65));
		return testList;
	}
}
