package com.sessions.sample.sessionSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.sessions.sample.sessionSample.model",
		"com.sessions.sample.sessionSample.controller",
		"com.sessions.sample.sessionSample.services",
		"com.sessions.sample.sessionSample.config"
})
@EnableAutoConfiguration//(exclude = org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class)
@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableJpaRepositories(basePackages = {"com.sessions.sample.sessionSample.repository"})
public class SessionSampleApplication {



	public static void main(String[] args) {
		SpringApplication.run(SessionSampleApplication.class, args);
	}
}
