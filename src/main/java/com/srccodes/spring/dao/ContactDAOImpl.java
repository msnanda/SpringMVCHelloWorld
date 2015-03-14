package com.srccodes.spring.dao;

import java.util.List;

import org.hibernate.HibernateException;
//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.srccodes.spring.model.Contacts;


@Repository
public class ContactDAOImpl implements ContactDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addContact(Contacts contact) {
		try {
		//getConnection();	
		System.out.println("From ContactDAOImpl.......addContact called");
		this.sessionFactory.getCurrentSession().beginTransaction();
		this.sessionFactory.getCurrentSession().save(contact);
		System.out.println("From ContactDAOImpl.......saving data");
		this.sessionFactory.getCurrentSession().getTransaction().commit();
		System.out.println("From ContactDAOImpl.......addContact has saved the data after commit");
		//sessionFactory.getCurrentSession().save(contact);
		} catch(HibernateException e) {
			e.printStackTrace();
		}
	}

	public List<Contacts> listContact() {
		return this.sessionFactory.getCurrentSession().createQuery("from Contacts").list();
	}

	 public void removeContact(Integer id) {
		Contacts contact = (Contacts) this.sessionFactory.getCurrentSession().load(
				Contacts.class, id);
		if (null != contact) {
			this.sessionFactory.getCurrentSession().delete(contact);
		}

	}
}
