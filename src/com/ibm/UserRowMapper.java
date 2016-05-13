package com.ibm;

import java.sql.ResultSet;
import java.sql.SQLException;
// loads the RowMapper feature of spring jdbc
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet resultSet, int rowCount) throws SQLException {
		// create a new user object to pass the values to
		User user = new User();
		// write the result set data to the object
		user.setEmailAddress(resultSet.getString("EMAIL_ADDRESS"));
		user.setPassword(resultSet.getString("PASSWORD"));
		user.setActiveFlag(resultSet.getString("ACTIVE_FLAG"));
		user.setUserRole(resultSet.getString("USER_ROLE"));
		// pass the created object back to the JdbcTemplate call for use elsewhere
		return user;
	}

}
