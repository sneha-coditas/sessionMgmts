package com.sessions.sample.sessionSample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RunWith(JUnit4.class)
public class SessionSampleApplicationTests {

	Logger logger = LoggerFactory.getLogger(SessionSampleApplicationTests.class);

     private String password="admin";

		@Test
		public  void encrytePassword() {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			String encodedPassword= encoder.encode(password);
            logger.info("Password is:{}",encodedPassword);
		}






}
