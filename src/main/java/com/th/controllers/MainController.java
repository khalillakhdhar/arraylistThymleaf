package com.th.controllers;

import java.util.ArrayList;
import java.util.List;
import com.th.classes.Person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
		m.addAttribute("personslist", persons);
		return  "Persons";
	}
	
	
	
}
