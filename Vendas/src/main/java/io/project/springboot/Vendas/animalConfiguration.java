package io.project.springboot.Vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class animalConfiguration {

	@Bean(name = "leao")
	public Animal leao() {
		return new Animal() {
			@Override
			public void uivo() {
				System.out.println("Uivo de leão");
			}
		};
	}

	@Bean(name = "elefante")
	public Animal elefante() {
		return new Animal() {
			@Override
			public void uivo() {
				System.out.println("Uivo de elefante");
			}
		};
	}
}
