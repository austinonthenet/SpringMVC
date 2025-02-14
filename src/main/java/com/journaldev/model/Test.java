package com.journaldev.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * test_id SERIAL PRIMARY KEY,
    name VARCHAR(50) not null,
    deccription VARCHAR(200),
    category_id int,
    date_created TIMESTAMP,
    passing_score int,
    time_limit_mins int,
    questions_limit int*/

@Entity
@Table(name = "tests")
public class Test {

	@Id
	@Column(name = "test_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long testId;

	@Column(name = "name")
	private String testName;

	@Column(name = "description")
	private String description;

	@Column(name = "category_id")
	private int categoryId;

	@Column(name = "date_created")
	private Date dateCreated;

	@Column(name = "passing_score")
	private int passingScore;

	@Column(name = "time_limit_mins")
	private int timeLimitMins;

	@Column(name = "questions_limit")
	private int questionsLimit;

	public Test() {

	}
	
	public Test(long id, String testName, String description, int category, int timeLimit, int questionsCount, Date createdOn, int passingScore) {
		this.testId = id;
		this.testName = testName;
		this.description = description;
		this.categoryId = 1;
		this.timeLimitMins = timeLimit;
		this.questionsLimit = questionsCount;
		this.passingScore = passingScore;
		this.dateCreated = createdOn;
	}
	
	public long getTestId() {
		return testId;
	}
	public void setTestId(long testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public int getPassingScore() {
		return passingScore;
	}
	public void setPassingScore(int passingScore) {
		this.passingScore = passingScore;
	}
	public int getTimeLimitMins() {
		return timeLimitMins;
	}
	public void setTimeLimitMins(int timeLimitMins) {
		this.timeLimitMins = timeLimitMins;
	}
	public int getQuestionsLimit() {
		return questionsLimit;
	}
	public void setQuestionsLimit(int questionsLimit) {
		this.questionsLimit = questionsLimit;
	}
	
	
	

}
