package com.journaldev.service;

import java.util.List;

import com.journaldev.model.Question;


public interface QuestionManager {

	Question getQuestionById(long questionId);
	
	List<Question> getAllQuestions();
	
	List<Question> getQuestionsByTest(int testId);
	
	void addQuestion(Question question);
	
	long updateQuestion(Question question);
	
	void deleteQuestion(long questionId);
}
