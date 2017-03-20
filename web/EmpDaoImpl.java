package com.bku.inautix.dao.impl;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.bku.inautix.dao.EmpRowMapper;
import com.bku.inautix.model.Employee;

public class EmployeeDAOImpl {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void setEmployee(int id,String name,long phn,int age,String gender,String pass) {
		try {
			
			jdbcTemplate.update("insert into employee values(?,?,?,?,?,?)",new Object[]{id,name,phn,gender,age,pass});
		} 
		catch (Throwable fault) {
			System.out.println("Got error.  Returning null (404)");
			fault.printStackTrace();
			
		}
			
		
	}
	
	public Employee validateEmployee(int id, String pass){
		Employee obj = null;
		try {
			obj = jdbcTemplate.queryForObject(
					"select * from employee where empid = ?",
		        new Object[]{id}, //in parameter
		        new EmpRowMapper());
		} catch (Throwable fault) {
			System.out.println("Got error.  Returning null (404)");
			fault.printStackTrace();
			
		}
		return obj;
	 }
	
	public List<Employee> getEmployees() {
    	System.out.println("I am here1");
		List<Employee> list = null;
		try {
			list = jdbcTemplate.query("select * from employee",
		        new Object[]{}, //in parameters
		        new EmpRowMapper());
		} catch (Throwable fault) {
			System.out.println("Got error.  Returning null (404)");
			fault.printStackTrace();
			
		}
		
      return list;
	 }	

	 public Employee getEmployee(int id){
		Employee obj = null;
		try {
			obj = jdbcTemplate.queryForObject(
					"select * from employee where empid = ?",
		        new Object[]{id}, //in parameter
		        new EmpRowMapper());
		} catch (Throwable fault) {
			System.out.println("Got error.  Returning null (404)");
			fault.printStackTrace();
			
		}
		return obj;
	 }
	
	
}

