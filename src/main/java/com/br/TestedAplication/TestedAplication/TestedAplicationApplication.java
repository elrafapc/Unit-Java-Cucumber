package com.br.TestedAplication.TestedAplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.PrintWriter;

@SpringBootApplication
public class TestedAplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestedAplicationApplication.class, args);
	}

	Book book1 = new Book("Lord Of Rings", 100, "01");
	ShoppingCart cart1 = new ShoppingCart();

	//cart1.add(book1);

}
