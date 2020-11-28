package com.org;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Employee> {
	
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee es = new Employee();
		es.setId(rs.getInt("id"));
		es.setName(rs.getString("name"));
		es.setSalary(rs.getDouble("salary"));
		return es;
	}

}
