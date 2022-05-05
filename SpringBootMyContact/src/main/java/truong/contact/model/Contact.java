package truong.contact.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {
	
//	public Contact(Integer id, String name, String email, String phone, String facebook, String avatar) {
//		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.phone = phone;
//		this.facebook = facebook;
//		this.avatar = avatar;
//	}

//    public Contact() {
//    }
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "contact_name")
	private String name;
	
	@Column(name = "contact_email")
	private String email;
	
	@Column(name = "contact_phone")
	private String phone;
	
	@Column(name = "contact_facebook")
	private String facebook;
	
	@Column(name = "contact_avatar")
	private String avatar;
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getFacebook() {
		return facebook;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}


	
}
