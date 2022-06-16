package io.project.springboot.Vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ComponentScan(basePackages = { "io.project.springboot.Repository", "io.project.springboot.Service",
//		"com.outraBiblioteca.projeto" })
@RestController
public class VendasApplication {

	@Autowired
	@Qualifier("applicationName")
	private String applicationName;

	@GetMapping("/hello")
	public String helloWord() {
		return "Hello Word";
	}

	@GetMapping("/applicationName")
	public String BeanConfigurationTest() {
		return applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
