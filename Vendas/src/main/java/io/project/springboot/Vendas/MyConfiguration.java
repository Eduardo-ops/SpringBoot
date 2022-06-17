package io.project.springboot.Vendas;

import org.springframework.context.annotation.Bean;

//@Configuration
//@Profile("development")
@Development
public class MyConfiguration {

	@Bean(name = "applicationName")
	public String applicationName() {
		return "Sistema de vendas";
	}

}
