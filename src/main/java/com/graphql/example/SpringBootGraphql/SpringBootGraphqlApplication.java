package com.graphql.example.SpringBootGraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class SpringBootGraphqlApplication {

	public static void main(String[] args) {
		// Cargar variables de entorno
		Dotenv dotenv = Dotenv.configure()
				.directory("./") // Directorio donde está el archivo .env
				.load();

		// Variables se cargan automáticamente en el sistema
		System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
		System.setProperty("DATABASE_USERNAME", dotenv.get("DATABASE_USERNAME"));
		System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));

		SpringApplication.run(SpringBootGraphqlApplication.class, args);
	}

}
