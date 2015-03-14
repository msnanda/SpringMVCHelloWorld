package com.srccodes.spring.service;

import java.util.List;
import com.srccodes.spring.model.Contacts;


public interface ContactService {
	
	public void addContact(Contacts contact);
	public List<Contacts> listContact();
	public void removeContact(Integer id);
}
