package br.com.exemplo.crud.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.exemplo.crud.rest.api")
@EntityScan(basePackages = "br.com.exemplo.crud.rest.api.model")
@EnableJpaRepositories(basePackages = "br.com.exemplo.crud.rest.api.repository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
