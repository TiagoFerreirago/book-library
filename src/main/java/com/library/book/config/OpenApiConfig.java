package com.library.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	@Bean
	OpenAPI customOpenAPI() {
		return new OpenAPI()
			.info(new Info()
				.title("REST API's RESTful with Java 18,  Spring Boot 3.2.0 and Docker")
				.version("v1")
				.description("Some description about your API")
				.termsOfService("https://www.librarymaxi.com/services")
				.license(
					new License()
						.name("Apache 2.0")
						.url("https://www.librarymaxi.com/licenses")
					)
				);
	}

}
