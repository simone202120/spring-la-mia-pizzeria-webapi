package org.generation.italy.demo;

import java.util.List;

import org.generation.italy.Pojo.Pizza;
import org.generation.italy.demo.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LaMiaPIizzeriaApiApplication implements CommandLineRunner{
	
	@Autowired
	private PizzaService pS;
	
	public static void main(String[] args) {
		SpringApplication.run(LaMiaPIizzeriaApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pizza p1 = new Pizza("Diavola", "pomodoro, mozzarella e salame piccante");
		Pizza p2 = new Pizza("4 Formaggi", "mozzarella, gorgonzola, taleggio, brie");
		
		
		pS.save(p1);
		pS.save(p2);
		
		
		List<Pizza> pizzas = pS.findAll();
		
		System.err.println(pizzas);
	}

}