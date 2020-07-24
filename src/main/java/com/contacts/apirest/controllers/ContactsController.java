package com.contacts.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.apirest.models.Contacts;
import com.contacts.apirest.services.ContactsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Contacts")
@CrossOrigin(origins="*")
public class ContactsController {
	
	@Autowired
	ContactsService contactsService;
	
	@GetMapping("/contacts")
	@ApiOperation(value="Retorna uma lista de contatos")
	public List<Contacts> listContacts() {
		return contactsService.getAll();
	}
	
	@GetMapping("/contacts/{id}")
	@ApiOperation(value="Retorna um único contato")
	public Contacts listContactsUnique(@PathVariable(value="id") long id) {
		return contactsService.getById(id);
	}
	
	@PostMapping("/contacts")
	@ApiOperation(value="Salva um contato")
	public Contacts storeContact(@RequestBody Contacts contact) {
		return contactsService.save(contact);
	}
	
	@DeleteMapping("/contacts")
	@ApiOperation(value="Deleta um contato")
	public void deleteContact(@RequestBody Contacts contact) {
		contactsService.delete(contact);
	}
	
	@PutMapping("/contacts")
	@ApiOperation(value="Atualiza um contato")
	public Contacts updteContact(@RequestBody Contacts contact) {
		return contactsService.update(contact);
	}
}
