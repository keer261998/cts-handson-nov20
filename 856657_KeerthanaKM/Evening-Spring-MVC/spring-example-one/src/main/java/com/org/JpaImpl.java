package com.org;

public class JpaImpl implements EmployeeDao {
	
	private DBConfig db;
	
	public JpaImpl(DBConfig db) {
		this.db=db;
	}
	
	public JpaImpl() {
		
	}
	
	//@Override
	public void store() {
		System.out.println("store() implementation done via JPA");
		System.out.println("DB Config: Url ="+db.getDbUrl()+", Name="+db.getDbname());
		
	}
	public void setDbConfig(DBConfig db) {
		this.db=db;
	}

}
