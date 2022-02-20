package com.journaldev.model;
/*
 * answer_id SERIAL PRIMARY KEY,
	question_id int,
	answer_text TEXT,
	is_correct_answer boolean,
	marks int*/
public class Answers {
	private int answerId;
	private int questionId;
	private String answerText;
	private boolean isCorrectAnswer;
	private int marks;
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public boolean isCorrectAnswer() {
		return isCorrectAnswer;
	}
	public void setCorrectAnswer(boolean isCorrectAnswer) {
		this.isCorrectAnswer = isCorrectAnswer;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
