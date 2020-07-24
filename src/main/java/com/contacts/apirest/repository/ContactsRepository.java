package com.contacts.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contacts.apirest.models.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {
	Contacts findById(long id);
}
