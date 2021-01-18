package com.administrador.criador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DashboardApplication {

	public static void main(String[] args) {
		//System.out.println(new BCryptPasswordEncoder().encode("1234567"));
		SpringApplication.run(DashboardApplication.class, args);
	}

}
