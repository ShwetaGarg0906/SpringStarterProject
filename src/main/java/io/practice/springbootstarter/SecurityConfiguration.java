package io.practice.springbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		  auth.inMemoryAuthentication().withUser("ram").password("ram123").roles("ADMIN");
		  auth.inMemoryAuthentication().withUser("ravan").password("ravan123").roles("USER");
		  auth.inMemoryAuthentication().withUser("kans").password("kans123").roles("USER");
	}
	
	//spring uses this method to encode the password when saving it to memory 
	@Bean
	public PasswordEncoder setPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
