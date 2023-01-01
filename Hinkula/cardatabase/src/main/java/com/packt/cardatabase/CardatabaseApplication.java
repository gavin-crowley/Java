package com.packt.cardatabase;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

//	private static final Logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	@Autowired
	private CarRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Application started", null, args, args, args, args, args, args, args, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Add owner objects and save these to db
//				Owner owner1 = new Owner("John" , "Johnson");
//				Owner owner2 = new  Owner("Mary" , "Robinson");
//				orepository.saveAll(Arrays.asList(owner1, owner2));

		// Add car object and link to owners and save these to db
		repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000));
//		repository.save(new Car(2, "Nissan", "Leaf", "White", "SSJ-3002", 2019, 29000));
//		repository.save(new Car(3, "Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000));
//				repository.saveAll(Arrays.asList(car1, car2, car3));

		for (Car car : repository.findAll()) {
			logger.info(car.getBrand() + " " + car.getModel());
		}
	}

}
