package com.api.security;

import com.api.security.models.User;
import com.api.security.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ApiAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAuthServiceApplication.class, args);
	}


}
