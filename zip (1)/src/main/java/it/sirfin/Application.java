package it.sirfin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"it.sirfin.it.sirfin"})
@EnableJpaRepositories(basePackages= {"it.sirfin.it.sirfin.repository"})
@EntityScan(basePackages= {"it.sirfin.it.sirfin.model"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
