package com.journaldev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.journaldev.model.Test;
import com.journaldev.model.TestCategory;
import com.journaldev.repository.TestDAO;

@Component 
public class SimpleTestManager implements TestManager {
	
	@Autowired 
	private TestDAO testDAO;

	@Override
	public Test getTestById(long testId) {
		// TODO Auto-generated method stub
		return testDAO.getTestById(testId);
	}
	

	@Override
	public List<Test> getTests(int categoryId) {
		// TODO Auto-generated method stub
		return testDAO.getTestsByCategory(categoryId);
	}
	
	@Override
	public List<Test> getAllTests(){
		
		return testDAO.getAllTests();
	}

	@Override
	public void addTest(Test test) {
		long testId = testDAO.createTest(test);
		System.out.println("Newly added test Id = "+testId);
	}

	@Override
	public Test updateTest(Test test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTest(long id) {
		// TODO Auto-generated method stub
		
	}
	

}
