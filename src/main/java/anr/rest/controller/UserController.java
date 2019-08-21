package anr.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import anr.rest.domain.Person;
import anr.rest.repository.PersonRepository;

@RestController
@RequestMapping(value = "user")
public class UserController {
	
	@Autowired
	private PersonRepository repo;

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String testApi() {
		return "welcome user service";
	}
	
	@RequestMapping(value = "/getallpersons",method = RequestMethod.GET)
	public List<Person> getAllPersons(){
		return repo.findAll();
	}
	
	@RequestMapping(value = "/getPersonById",method = RequestMethod.GET)
	public Optional<Person> getPersonById(Integer id){
		return repo.findById(id);
	}
	
	@RequestMapping(value = "/savePerson",method = RequestMethod.POST)
	public Person savePerson(Person person){
		return repo.save(person);
	}
	
	
	
}
