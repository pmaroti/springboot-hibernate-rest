package org.maro.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
    private PersonRepository personRepository;

 
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		Person p1 = new Person();
		p1.setName("Maro");
		p1.setAddress("Budapest");
		personRepository.save(p1);
		
	}
	

}
