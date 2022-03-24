package com.th.controllers;

import java.util.ArrayList;
import java.util.List;
import com.th.classes.Person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	private static List<Person> persons = new ArrayList<Person>();
	static { // static {} signifie l'auto initialisation
	persons.add(new Person("Bill", "Gates")); // ajout dans la liste
	persons.add(new Person("Steve", "Jobs"));
	}
	@GetMapping("")
	public String getPersons(Model m)
	{
		Person p=new Person();
		m.addAttribute("personslist", persons);
		m.addAttribute("person",p);
		return  "Persons";
	}
	@PostMapping("add")
	public String addPerson(@ModelAttribute(name = "person") Person p,Model m)
	{
		persons.add(p);
		
		
		return "redirect:/"; // redirection vers le url ""=> localhost:8080/
	}
	
	
}
