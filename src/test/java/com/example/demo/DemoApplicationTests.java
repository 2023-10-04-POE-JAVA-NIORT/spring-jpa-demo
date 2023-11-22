package com.example.demo;

import com.example.demo.dao.PersonneRepository;
import com.example.demo.entity.Personne;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	PersonneRepository personneRepository;

	@Test
	void testSavePersonne() {
		Personne personne = new Personne();
		personne.setNom("Dominguez");
		personne.setPrenom("Jean-Christophe");

		personneRepository.save(personne);
	}

	@Test
	void testFindAll(){
		List<Personne> personnes = personneRepository.findAll();
		for (Personne p : personnes)
			System.out.println(p);
	}

	@Test
	void testFindById(){

		Optional<Personne> optional = personneRepository.findById(22);
		if(optional.isPresent()){
			Personne personne = optional.get();
			System.out.println(personne);
		}
		else
			System.out.println("Personne introuvable avec cet identifiant");
	}
}
