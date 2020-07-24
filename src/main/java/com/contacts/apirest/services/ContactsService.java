package com.contacts.apirest.services;

import java.util.List;

import com.contacts.apirest.models.Contacts;

public interface ContactsService {
	List<Contacts> getAll();
	Contacts getById(long id);
	Contacts save(Contacts contacts);
	void delete(Contacts contacts);
	Contacts update(Contacts contacts);
}
