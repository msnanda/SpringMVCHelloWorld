package com.srccodes.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Transactional;



import com.srccodes.spring.dao.ContactDAO;
//import com.srccodes.spring.dao.ContactDAOImpl;
import com.srccodes.spring.model.Contacts;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	public ContactDAO contactDAO;
	
	@Transactional
	public void addContact(Contacts contact) {
//		if(contactDAO == null)
//		{
//			contactDAO = new ContactDAOImpl();
//			System.out.println("contactDAO is null");
//		}
		contactDAO.addContact(contact);
	}

	@Transactional
	public List<Contacts> listContact() {

		return contactDAO.listContact();
	}

	@Transactional
	public void removeContact(Integer id) {
		contactDAO.removeContact(id);
	}
}
