package com.journaldev.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.journaldev.model.Question;
import com.journaldev.service.QuestionManager;


public class QuestionController {
	@Autowired
	private QuestionManager questionManager;
	
	@RequestMapping(value = "/admin/addQuestion", method = RequestMethod.GET)
	public ModelAndView getTests(Model model) {
		return new ModelAndView("admin/addQuestion", "questionForm", new Question());
	}
	
	@RequestMapping(value = "/admin/Questionslist", method = RequestMethod.GET)
	public String listQuestions(Model model) {
		
        List<Question> questionList = questionManager.getAllQuestions();
        //System.out.println("Inside ListTests");
        model.addAttribute("Questions", questionList);
      //  System.out.println("List Size = "+questionList.size());
        return "admin/listQuestions";
	}
	
	@RequestMapping(value = "/admin/submit", method = RequestMethod.POST)
	public String createQuestion(@ModelAttribute("questionForm") Question question, Model model) {
		System.out.println("Test Name : " + question.getTestId());
        System.out.println("Question Type : " + question.getQuestionType());
        System.out.println("Difficulty Level : " + question.getQuestionType());
        System.out.println("Question : "+ question.getQuestionText());
        
        questionManager.addQuestion(question);
        
       // return listTests(model);
        List<Question> allQuestions = questionManager.getQuestionsByTest(question.getTestId());
       // System.out.println("Inside ListTests");
        model.addAttribute("Questions", allQuestions);
        
        return "admin/listQuestions";
	}

}
