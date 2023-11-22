package com.example.demo;

import com.example.demo.dao.PersonneRepository;
import com.example.demo.entity.Personne;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

}
