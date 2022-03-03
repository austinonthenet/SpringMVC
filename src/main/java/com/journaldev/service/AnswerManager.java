package com.journaldev.service;

import java.util.List;

import com.journaldev.model.Answer;

public interface AnswerManager {
	
Answer getAnswerById(long answerId);
	
	List<Answer> getAllAnswer();
	
	List<Answer> getAnswersByQuestion(int questionId);
	
	void addAnswer(Answer answer);
	
	long updateAnswer(Answer answer);
	
	void deleteAnswer(long answerId);

}
