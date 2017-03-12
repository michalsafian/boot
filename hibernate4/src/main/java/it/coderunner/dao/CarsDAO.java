package it.coderunner.dao;

import java.util.List;

import it.coderunner.cars.Cars;

public interface CarsDAO {
	
	void save(Cars car);
	
	List<Cars> carList();
	
}
