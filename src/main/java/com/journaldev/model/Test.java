package com.journaldev.model;

import java.util.Date;

/*
 * test_id SERIAL PRIMARY KEY,
    name VARCHAR(50) not null,
    deccription VARCHAR(200),
    category_id int,
    date_created TIMESTAMP,
    passing_score int,
    time_limit_mins int,
    questions_limit int*/

public class Test {
	private long testId;
	private String testName;
	private String description;
	private int categoryId;
	private Date dateCreated;
	private int passingScore;
	private int timeLimitMins;
	private int questionsLimit;
	
	public Test(long id, String name, String description, int category, int timeLimit, int questionsCount, Date createdOn, int passingScore) {
		this.testId = id;
		this.testName = name;
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
