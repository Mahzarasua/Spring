package com.mycode.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
	
	@Bean
	public Persona persona(){
		return new Persona();
	}

}
