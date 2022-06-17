package io.project.springboot.Vendas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ComponentScan(basePackages = { "io.project.springboot.Repository", "io.project.springboot.Service",
//		"com.outraBiblioteca.projeto" })
@RestController
public class VendasApplication {

//	@Autowired
//	@Qualifier("applicationName")
//	private String applicationName;

	@Elefante
	private Animal animal;

	@Value("${application.name}")
	private String applicationName;

	@GetMapping("/hello")
	public String helloWord() {
		return "Hello Word";
	}

	@GetMapping("/applicationName")
	public String BeanConfigurationTest() {
		return applicationName;
	}

	@Bean
	public CommandLineRunner executar() {
		return args -> {
			this.animal.uivo();
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
