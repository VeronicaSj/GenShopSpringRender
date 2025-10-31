package main.java.com.example.genShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import main.java.com.example.genShop.entities.Product;

@SpringBootApplication
public class GenShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenShopApplication.class, args);
		new Product();
	}
}
