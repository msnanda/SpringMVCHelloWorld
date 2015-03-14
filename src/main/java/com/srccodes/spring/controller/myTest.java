package com.srccodes.spring.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.AnnotationConfiguration;
public class myTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//SessionFactory sf = new Configuration().configure().buildSessionFactory();
			SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
			System.out.println("configuration and hbm files loaded successfully........");
			Session session =sf.openSession();
			session.beginTransaction();
			System.out.println("Transaction began");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
