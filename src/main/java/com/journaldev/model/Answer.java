package com.journaldev.model;
/*
 * answer_id SERIAL PRIMARY KEY,
	question_id int,
	answer_text TEXT,
	is_correct_answer boolean,
	marks int*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "answers")
public class Answer {
	@Id
	@Column(name = "answer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int answerId;
	
	@Column(name = "question_id")
	private int questionId;
	
	@Column(name = "answer_text")
	private String answerText;
	
	@Column(name = "is_correct_answer")
	private boolean isCorrectAnswer;
	
	@Column(name = "marks")
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
	
	
public Answer() {
	// TODO Auto-generated constructor stub
}
	
public Answer(int answerId, int questionId, String answerText, boolean isCorrectAnswer, int marks) {
		this.answerId = answerId;
		this.questionId = questionId;
		this.answerText = answerText;
		this.isCorrectAnswer = isCorrectAnswer;
		this.marks = marks;
		
	}

}
