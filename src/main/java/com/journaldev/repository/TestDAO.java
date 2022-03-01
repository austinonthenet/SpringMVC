package com.journaldev.repository;

import java.util.List;

import com.journaldev.model.Test;

public interface TestDAO {

	public long createTest(Test test);

	public Test getTestById(long id);

	public List<Test> getTestsByCategory(int categoryId );
	
	public List<Test> getAllTests( );
	

}
