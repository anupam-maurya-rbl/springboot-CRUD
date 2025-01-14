package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class Config {

	
	 @Bean
	    public OpenAPI customOpenAPI() {
	        return new OpenAPI()
	        	    .info(new io.swagger.v3.oas.models.info.Info()
	                        .title("Student Management API")
	                        .version("1.0.0")
	                        .description("API for managing students"));
	    }
}
