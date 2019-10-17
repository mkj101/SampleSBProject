package com.manish.sampleproject1.config;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
 
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
 
	//@Autowired 
	//private BasicAuthenticationPoint basicAuthenticationPoint; 
	
	   @Override
	    protected void configure(HttpSecurity httpSecurity) throws Exception {
	        
		   httpSecurity.authorizeRequests()
	                .antMatchers("/","/api/**","/v2/api-docs", "/configuration/ui",
	                		"/swagger-resources/**", "/configuration/**", "/swagger-ui.html", "/webjars/**").permitAll()
	                .anyRequest().authenticated()
	                .and()
	                .formLogin().loginPage("/login").permitAll();
	                //.and()
	                //.logout().permitAll();
	 
	       httpSecurity.csrf().disable();
	       httpSecurity.headers().frameOptions().disable();
	       //httpSecurity.httpBasic().authenticationEntryPoint(basicAuthenticationPoint);
	   }
	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	        auth
	                .inMemoryAuthentication()
	                .withUser("admin").password("admin").roles("ADMIN")
	                .and().withUser("manish").password("manish1").roles("USER");;
	    }
 
}