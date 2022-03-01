package com.journaldev.model;


public class TestForm {
	


	private String name;
	
	private String description;
	private int categoryId;
	private int passingScore;
	private int timeLimitMins;
	private int questionsLimit;
	
	public TestForm(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
