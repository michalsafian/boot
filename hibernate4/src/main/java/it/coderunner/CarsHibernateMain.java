package it.coderunner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.coderunner.cars.Cars;
import it.coderunner.dao.CarsDAO;

public class CarsHibernateMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		CarsDAO carsDao = context.getBean(CarsDAO.class);
		
		Cars car = new Cars();
		car.setBrand("Ford");
		car.setModel("Focus");
		car.setCcm3("1.8");
		
		carsDao.save(car);
		
		System.out.println("Car::" + car);
		
		carsDao.carList().forEach(System.out::println);
		
		context.close();
	}
}
