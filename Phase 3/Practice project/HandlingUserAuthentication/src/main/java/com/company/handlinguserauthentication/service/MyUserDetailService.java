package com.company.handlinguserauthentication.service;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.company.handlinguserauthentication.entity.User;


@Repository
public class MyUserDetailService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public User getUser(String useremail, String  userpassword) {

		@SuppressWarnings("deprecation")
		User userDetail = jdbcTemplate.queryForObject("select * from users where useremail=? AND userpassword=?", new Object[] { useremail,  userpassword} , new RowMapper<User> () {
			
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setUseremail(rs.getString(2));
				user.setUserpassword(rs.getString(3));
				
				return user;
			}	
		});
		
		return userDetail;
	}

}
