package truong.contact.controller;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import truong.contact.model.Contact;
import truong.contact.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	
	// Hiển thị danh sách employee
    // display list of employees
	 // display list of employees
	
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listContacts", contactService.getAllContacts());
        return "index";
    }
    
    
	@GetMapping("/showNewContactForm")
	public String showNewContactForm(Model model) {
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		return "new_contact";
	}
	
	@PostMapping("/saveContact")
	public String saveEmployee(@ModelAttribute("employee") Contact contact) {
		 //thêm employee vào database
		contactService.saveContact(contact);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable( value= "id") long id, Model model) {
		// Lấy thông tin employee
		Contact contact = contactService.getContactById(id);
		
		model.addAttribute("contact", contact);
		return "update_contact";
	}
	
	@GetMapping("/deleteContact/{id}")
	public String deleteContact(@PathVariable( value= "id") long id, Model model) {
		//Gọi phương thức delete
		this.contactService.deleteContactById(id);
		return "redirect:/";
		
	}
	
	@GetMapping("/search")
	 public String home(Contact contact, Model model, String keyword) {
	  if(keyword!=null) {
	   List<Contact> list = contactService.getByKeyword(keyword);
	   model.addAttribute("listContacts", list);
	  }else {
	  List<Contact> list = contactService.getAllContacts();
	  model.addAttribute("listContacts", list);}
	  return "index";
	 }
	
}
