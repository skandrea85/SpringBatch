package com.example.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.example.second.Manager;

@Component
public class MyCustomProcessor implements ItemProcessor<Employee,Manager>{

	@Override
	public Manager process(Employee item) throws Exception {
		System.out.println("MyBatchProcessor : Processing data : "+item);
		Manager manager = new Manager();
		//manager.setId(emp.getId());
		manager.setName(item.getName().toUpperCase());
		manager.setSalary(item.getSalary());
		return manager;
	}

}
