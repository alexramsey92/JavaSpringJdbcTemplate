package com.ibm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ibm.UserDaoFunctions;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
		UserDaoFunctions UserDao = (UserDaoFunctions) context.getBean("UserDaoFunctions");

		// CREATE
		// System.out.println("Creating a User...");
		// UserDao.createUser("example2@mail.com", "password", "0", "USROLE");

		// READ - SINGLE USER
		// System.out.println("Reading a Single User by email...");
		// set user object equal to the DAO call so that we can use getters with
		// the object
		// User user = UserDao.getUserByEmail("alexramsey92@gmail.com");
		// System.out.println("EMAIL = " + user.getEmailAddress());
		// System.out.println("PASSWORD = " + user.getPassword());
		// System.out.println("ACTIVE USER = " + user.getActiveFlag());
		// System.out.println("USER ROLE = " + user.getUserRole());

		// READ - ALL USERS
//		int loop = 0;
//		List<User> users = UserDao.listUsers();
//		for (User record : users) {
//			loop++;
//			System.out.println("** User Record " + loop + " **");
//			System.out.println("EMAIL = " + record.getEmailAddress());
//			System.out.println("PASSWORD = " + record.getPassword());
//			System.out.println("ACTIVE USER = " + record.getActiveFlag());
//			System.out.println("USER ROLE = " + record.getUserRole());
//		}

		// UPDATE
		// System.out.println("Updating USER password by email...");
		// UserDao.updateUserByEmail("alexramsey92@gmail.com", "gasword");

		// DELETE
		// System.out.println("Deleting a User...");
		// UserDao.deleteUserByEmail("example2@mail.com");
	}

}
