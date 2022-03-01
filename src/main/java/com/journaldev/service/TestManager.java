package com.journaldev.service;

import java.util.List;

import com.journaldev.model.Test;
import com.journaldev.model.TestCategory;

public interface TestManager {

	Test getTestById(long testId);
	
	List<Test> getAllTests();
	
	List<Test> getTests(int categoryId);
	
	void addTest(Test test);
	
	Test updateTest(Test test);
	
	void deleteTest(long id);
}
