package org.maro.test;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/person")
public class FirstController {

	@Autowired
    private PersonRepository personRepository;

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Person> list() {
		Iterable<Person> persons = personRepository.findAll();
		return persons;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Person addnew(@RequestBody Person in) {
		return(personRepository.save(in));
	}	
}