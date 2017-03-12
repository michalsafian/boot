package it.coderunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.coderunner.dao.PersonDAO;
import it.coderunner.model.Person;

public class SpringHibernateMain {
	@Autowired								//
	private PersonDAO dao;
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		PersonDAO personDAO = context.getBean(PersonDAO.class);
		

		Person person = new Person();
		person.setName("Michał");
		person.setCountry("Poland");
		
		

		personDAO.save(person);

		System.out.println("Person::" + person);

		personDAO.list().forEach(System.out::println);

		context.close();

	}
}
