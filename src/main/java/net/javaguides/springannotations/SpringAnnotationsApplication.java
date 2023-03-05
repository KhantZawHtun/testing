package net.javaguides.springannotations;

import net.javaguides.springannotations.controller.PizzaController;
import net.javaguides.springannotations.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.SocketOption;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {

		 var context =SpringApplication.run(SpringAnnotationsApplication.class, args);
		PizzaController pizzaController= (PizzaController) context.getBean("eatController");
		System.out.println(pizzaController.getPizza());

	//	VegPizza vegPizza= (VegPizza) context.getBean("vegPizza");
	//	System.out.println(vegPizza.getPizza());

	}

}
