package com.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbatch.model.User;
import com.springbatch.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User>{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void write(List<? extends User> users) throws Exception {
		
		System.out.println("Data saved for users "+users);
		userRepository.saveAll(users);
	}

}
