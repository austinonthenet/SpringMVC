package com.journaldev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.journaldev.model.Question;
import com.journaldev.repository.QuestionDAO;

public class SimpleQuestionManager implements QuestionManager{
	
	@Autowired
	private QuestionDAO questionDAO;

	@Override
	public Question getQuestionById(long questionId) {
		
		return questionDAO.getQuestionById(questionId);
	}

	@Override
	public List<Question> getAllQuestions() {
		return questionDAO.getAllQuestions();
	}

	@Override
	public List<Question> getQuestionsByTest(int testId) {
		return questionDAO.getQuestionByTest(testId);
	}

	@Override
	public void addQuestion(Question question) {
		questionDAO.createQuestion(question);
		
	}

	@Override
	public long updateQuestion(Question question) {
		return questionDAO.updateQuestion(question);
	}

	@Override
	public void deleteQuestion(long questionId) {
		questionDAO.deleteQuestion(questionId);
		
	}
	

}
