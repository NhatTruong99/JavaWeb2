package truong.contact.service;

import java.util.List;

import org.springframework.data.domain.Page;


import truong.contact.model.Contact;


public interface ContactService {

	List<Contact> getAllContacts();
	void saveContact(Contact contact);
	Contact getContactById(long id);
	void deleteContactById(long id);
	List<Contact> getByKeyword(String keyword);
}
