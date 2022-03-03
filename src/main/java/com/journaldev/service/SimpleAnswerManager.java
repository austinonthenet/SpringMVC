package com.journaldev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.journaldev.model.Answer;
import com.journaldev.repository.AnswerDAO;

public class SimpleAnswerManager implements AnswerManager{
	
	@Autowired
	private AnswerDAO answerDAO;

	@Override
	public Answer getAnswerById(long answerId) {
		return answerDAO.getAnswerById(answerId);
	}

	@Override
	public List<Answer> getAllAnswer() {
		return answerDAO.getAllAnswers();
	}

	@Override
	public List<Answer> getAnswersByQuestion(int questionId) {
		return answerDAO.getAnswersByQuestion(questionId);
	}

	@Override
	public void addAnswer(Answer answer) {
		answerDAO.createAnswer(answer);
		
	}

	@Override
	public long updateAnswer(Answer answer) {
		return answerDAO.updateAnswer(answer);
	}

	@Override
	public void deleteAnswer(long answerId) {
		answerDAO.deleteAnswer(answerId);
		
	}

}
