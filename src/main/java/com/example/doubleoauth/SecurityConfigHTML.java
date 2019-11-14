package com.example.doubleoauth;

import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity(debug = true)
@Order(10)
public class SecurityConfigHTML extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
		http
			.authorizeRequests().antMatchers("/index.html").authenticated()
		.and()
			.oauth2Login().loginPage("/oauth2/authorization/gitlab");
		// @formatter:on
    }
}
