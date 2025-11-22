package com.example.H2demo;

import com.example.H2demo.entite.Adherant;
import com.example.H2demo.repository.AdherantRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}

    @Bean
    CommandLineRunner runner(AdherantRepo adherantRepo) {
        return args -> {
            adherantRepo.save(new Adherant(null, "A", "meaux", 29));
            adherantRepo.save(new Adherant(null, "A", "meaux", 29));
            adherantRepo.save(new Adherant(null, "A", "meaux", 29));
            adherantRepo.save(new Adherant(null, "A", "meaux", 29));

        };
    }
}
