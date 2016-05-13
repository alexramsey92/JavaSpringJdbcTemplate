package com.ibm;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoFunctions {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	   
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void createUser(String email, String password, String activeFlag, String userRole) {
		String sql = "INSERT INTO TA_USERS (EMAIL_ADDRESS, PASSWORD, ACTIVE_FLAG, USER_ROLE) VALUES (?, ?, ?, ?)";
		jdbcTemplateObject.update(sql, email, password, activeFlag, userRole);
		System.out.println("Created a new USER record in TA_USERS with values: " + email + " " + password + " " + activeFlag + " " + userRole);
		return;
	}

	public User getUserByEmail(String email) {
		String sql = "SELECT * FROM TA_USERS WHERE EMAIL_ADDRESS = ?";
		User user = jdbcTemplateObject.queryForObject(sql, new Object[]{email}, new UserRowMapper());
		return user;
	}

	public List<User> listUsers() {
		String sql = "SELECT * FROM TA_USERS";
		List <User> users = jdbcTemplateObject.query(sql, new UserRowMapper());
		return users;
	}

	public void deleteUserByEmail(String email) {
		String sql = "DELETE FROM TA_USERS WHERE EMAIL_ADDRESS = ?";
	    jdbcTemplateObject.update(sql, email);
	    System.out.println("DELETE from TA_USERS with EMAIL_ADDRESS: " + email);
	    return;
	}

	public void updateUserByEmail(String email, String password) {
		String sql = "UPDATE TA_USERS SET PASSWORD = ? WHERE EMAIL_ADDRESS = ?";
		jdbcTemplateObject.update(sql, password, email);
	    System.out.println("UPDATE PASSWORD for user record = " + password + " TA_USERS by EMAIL_ADDRESS: " + email);
	    return;

	}

}
