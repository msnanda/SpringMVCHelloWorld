package com.srccodes.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateConnection {
 public Session returnConnection() {
	 SessionFactory sf = null;
	 Session session = null;
	 try {
			//SessionFactory sf = new Configuration().configure().buildSessionFactory();
			sf = new AnnotationConfiguration().configure().buildSessionFactory();
			System.out.println("configuration and hbm files loaded successfully........");
			session =sf.openSession();
			//session.beginTransaction();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	 return session;
 }
}
