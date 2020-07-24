package com.contacts.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contacts.apirest.models.Contacts;
import com.contacts.apirest.repository.ContactsRepository;

@Service
public class ContactsServiceImpl implements ContactsService{
	@Autowired
	ContactsRepository contactsRepository;

	@Override
	public List<Contacts> getAll() {
		// TODO Auto-generated method stub
		return contactsRepository.findAll();
	}

	@Override
	public Contacts getById(long id) {
		// TODO Auto-generated method stub
		return contactsRepository.findById(id);
	}

	@Override
	public Contacts save(Contacts contacts) {
		// TODO Auto-generated method stub
		return contactsRepository.save(contacts);
	}

	@Override
	public void delete(Contacts contacts) {
		// TODO Auto-generated method stub
		contactsRepository.delete(contacts);
	}
	
	@Override
	public Contacts update(Contacts contacts) {
		// TODO Auto-generated method stub
		return contactsRepository.save(contacts);
	}
	
}
