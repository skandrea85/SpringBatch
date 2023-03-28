package com.example.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.second.Manager;
import com.example.second.ManagerRepository;

@Component
public class MyCustomWriter implements ItemWriter<Manager> {
	
	@Autowired
	ManagerRepository managerRepository ;
	
	@Override
	public void write(List<? extends Manager> list) throws Exception {
		for (Manager data : list) {
			System.out.println("MyCustomWriter    : Writing data    : " + data.getId()+" : "+data.getName()+" : "+data.getSalary());
			managerRepository.save(data);
		}
	}

}
