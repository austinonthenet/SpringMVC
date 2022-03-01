package com.journaldev.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*question_id SERIAL PRIMARY KEY,
	test_id int,
	question_text TEXT,
	question_type int,
	difficulty_level int*/
@Entity
@Table(name = "questions")
public class Question {
	@Id
	@Column(name = "question_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionId;
	
	@Column(name = "test_id")
	private int testId;
	
	@Column(name = "question_type")
	private int questionType;
	
	@Column(name = "difficulty_level")
	private int difficultyLevel;
	
	@Column(name = "question_text")
	private String questionText;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public int getQuestionType() {
		return questionType;
	}
	public void setQuestionType(int questionType) {
		this.questionType = questionType;
	}
	public int getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(int difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	
	public Question(){
		
	}
	
	public Question(int questionId, int testId, int questionType, int difficultyLevel, String questionText) {
		this.questionId = questionId;
		this.testId = testId;
		this.questionType = questionType;
		this.difficultyLevel = difficultyLevel;
		this.questionText = questionText;
		
	}
	

}
