package com.journaldev.repository;

import java.util.List;

import com.journaldev.model.Question;

public interface QuestionDAO {
	public long createQuestion(Question question);

	public Question getQuestionById(long id);

	public List<Question> getQuestionByTest(int testId );
	
	public List<Question> getAllQuestions( );
}
