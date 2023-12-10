package com.evm.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
public class SecurityConfig{
	protected void configure(HttpSecurity http) throws Exception {
	
		http.authorizeRequests().anyRequest().authenticated().and().oauth2Login();
		
		
	}

	

}
