

package com.rushikesh.apis.example.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity//.authorizeRequests().antMatchers("/greeting/***").permitAll().and()
                .authorizeRequests().antMatchers("/authenticate","/actuator/**", "/h2-console/**").permitAll()
                .anyRequest().authenticated();
        //httpSecurity.formLogin();        
       // httpSecurity.httpBasic();        
        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();
    }
}