package com.journaldev.repository;

import java.util.List;

import com.journaldev.model.Answer;;

public interface AnswerDAO {
	public long createTest(Answer answer);

	public Answer getAnswerById(long id);

	public List<Answer> getAnswersByQuestion(int questionId );
	
	public List<Answer> getAllAnswers( );

}
