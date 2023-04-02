package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Gavin");
//		employee.setLastName("Crowley");
//		employee.setEmailId("gavincrowley@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Dan");
//		employee1.setLastName("Abramov");
//		employee1.setEmailId("danabramov@meta.social");
//		employeeRepository.save(employee1);
//
//		Employee employee2 = new Employee();
//		employee1.setFirstName("Jordan");
//		employee1.setLastName("Walke");
//		employee1.setEmailId("jordanwalke@meta.social");
//		employeeRepository.save(employee1);
	}
}
