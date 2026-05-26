package com.itb.inf2gm.anteikupizzaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnteikupizzariaApplication {

	public static void main(String[] args) {


        SpringApplication.run(AnteikupizzariaApplication.class, args);

        System.out.println("Pizzaria Anteiku rodando na porta 8080");
    }
}
