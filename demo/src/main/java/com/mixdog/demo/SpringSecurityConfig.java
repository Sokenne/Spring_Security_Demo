package com.mixdog.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableAutoConfiguration
public class SpringSecurityConfig  extends WebSecurityConfigurerAdapter {
protected void configure(HttpSecurity http) throws Exception{
    http.authorizeRequests()
            .antMatchers("/").permitAll()
            .anyRequest().authenticated()
            .and().logout().permitAll()

}

}
