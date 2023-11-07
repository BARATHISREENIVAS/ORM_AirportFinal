package com.tap.airport;

import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import com.tap.airpoet.entity.AirportEntity;
import com.tap.airport.dao.AirportDAO;
import com.tap.airport.service.AirportService;

public class AirportTester {

	public static void main(String[] args) {
		//System.out.println("Invoked main()...");
		String configLocation="beanConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		System.out.println(context);
		
		AirportDAO airportDAO = context.getBean(AirportDAO.class);
		AirportEntity entity = new AirportEntity(8,"Delhi","Delhi_InternationalAirport",0,65);
		AirportService service = context.getBean(AirportService.class);
		boolean isValid= service.validateAirportEntity(entity);
		if(isValid) {
			airportDAO.saveAirportEntity(entity);
		}else {
			System.out.println("Try Again.. data is not valid");
		}
		
		ClassPathXmlApplicationContext ioc =(ClassPathXmlApplicationContext) context;
		ioc.close();
		System.out.println("End of Spring application.....");
		
		
		
		
	}

}
