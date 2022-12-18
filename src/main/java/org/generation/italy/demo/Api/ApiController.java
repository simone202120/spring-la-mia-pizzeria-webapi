package org.generation.italy.demo.Api;

import java.util.List;

import org.generation.italy.Pojo.Pizza;
import org.generation.italy.demo.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class ApiController {
	@Autowired
	private PizzaService pS;
	
	@GetMapping("/allPizzas")
	public List<Pizza> getAll() {
		return pS.findAll();
	}

}
