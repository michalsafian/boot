package it.coderunner.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import it.coderunner.cars.Cars;
import it.coderunner.dao.CarsDAO;

public class CarsDAOImpl implements CarsDAO {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Cars car) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.persist(car);
		trans.commit();
		session.close();
	}

	@Override
	public List<Cars> carList() {
		Session session = this.sessionFactory.openSession();
		List<Cars> carList = session.createQuery("from Cars").list();
		session.close();
		return carList;
	}
}
