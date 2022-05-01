package com.pueblosMagicos.ApiRestPueblosMagicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestPueblosMagicosApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(ApiRestPueblosMagicosApplication.class, args);
		} catch (Exception e) {
			System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡ERROR!!!!!!!!!!!!!!!!!!!");
			e.printStackTrace(); 
			System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡ERROR!!!!!!!!!!!!!!!!!!!");
		}
		
	}

}
