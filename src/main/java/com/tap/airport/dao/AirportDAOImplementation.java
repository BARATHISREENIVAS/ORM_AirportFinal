package com.tap.airport.dao;

import java.util.Objects;

import javax.persistence.Entity;

import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.cj.xdevapi.SessionFactory;
import com.tap.airpoet.entity.AirportEntity;

@Component
public class AirportDAOImplementation implements AirportDAO {
	
	@Autowired
	private org.hibernate.SessionFactory sessionFactory;
	
	public AirportDAOImplementation(org.hibernate.SessionFactory sessionFactory) {
		this.sessionFactory= sessionFactory;
		System.out.println("SessionFactory is injected by ioc container");
		
	}
	
	public void saveAirportEntity(AirportEntity entity) {
		
		org.hibernate.Session session=null;
		try {
//			//step:1 start the hibernate framework
//			Configuration configuration = new Configuration();
//			
//			//step:2 configure hibernate file (or) parse the hibernate config file
//			configuration.configure("hibernate.cfg.xml");
//			
//			//step:3 register AirportEntity with hibernate
//			configuration.addAnnotatedClass(AirportEntity.class);
//			
//			//step:4 build sessionFactory
//			sessionFactory = configuration.buildSessionFactory();
			
			//step:5 Open session to perform db operation / session will internaly hold sql connection
			session= sessionFactory.openSession();
			
			//step:6 start the transaction
			//session.beginTransaction();
			session.beginTransaction();
			
			/* DB CRUD
			 * C-> save method
			 * R->Get
			 * U->Update
			 * D->Remove
			 */
			
			//step:7 create object of entity class and pass it to the save9) as an args
			session.save(entity);
			
			//step8
			session.getTransaction().commit();
			System.out.println("AirportEntity has been saved");
		}
		
		finally {
			//step9
			if(session!=null) {
				
				session.close();
				System.out.println("session is closed");
			}
//			if(sessionFactory!=null) {
//				
//				sessionFactory.close();
//			}
		}
	}
	@Override
	public AirportEntity getAirportEntityById(int id) {
		
		org.hibernate.Session session=null;
		AirportEntity entity=null;
			
			try {
			//step:5 Open session to perform db operation / session will internaly hold sql connection
			session= sessionFactory.openSession();
			
			//step:7 create object of entity class and pass it to the save9) as an args
			 entity=session.get(AirportEntity.class,id);
		
			if(Objects.nonNull(entity)) {
				return entity;
			}else {
				System.out.println("Airport not found. please provid valid id");
			}
		}
		
		finally {
			//step9
			if(session!=null) {
				
				session.close();
				System.out.println("session is closed");
			}

		}
			return entity;

		
	}
	public void updateAirportEntity() {
		
	}
}
