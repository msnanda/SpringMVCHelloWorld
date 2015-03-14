package com.srccodes.spring.dao;

import java.util.List;
import com.srccodes.spring.model.Contacts;

public interface ContactDAO {
	
	public void addContact(Contacts contact);
	public List<Contacts> listContact();
	public void removeContact(Integer id);
}
