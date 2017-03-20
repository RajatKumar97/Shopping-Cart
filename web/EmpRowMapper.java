package com.bku.inautix.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bku.inautix.model.Employee;

public class EmpRowMapper implements RowMapper<Employee> {
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee obj = new Employee();		
		obj.setEmpId(rs.getInt("empid"));
		obj.setName(rs.getString("name"));
		obj.setPhone(rs.getString("phn"));
		obj.setAge(rs.getInt("age"));
		obj.setPass(rs.getString("password"));
		obj.setGender(rs.getString("gender"));
		
		return obj;
	}
}
