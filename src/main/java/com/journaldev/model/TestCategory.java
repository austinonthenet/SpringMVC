package com.journaldev.model;

public enum TestCategory {
	JAVA(1),
	PYTHON(2),
	SYSTEM_ADMINISTRATION(3),
	NETWORKING(4),
	DATABASES(5);
	
		private int categoryId;
		
		private TestCategory(int id){
			this.categoryId = id;
		}

}
