package io.project.springboot.Vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("development")
public class MyConfiguration {

	@Bean(name = "applicationName")
	public String applicationName() {
		return "Sistema de vendas";
	}

}
