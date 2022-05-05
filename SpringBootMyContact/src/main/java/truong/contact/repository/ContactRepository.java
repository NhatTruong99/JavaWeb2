package truong.contact.repository;

import truong.contact.model.Contact;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
	//Custom query
	 @Query(value = "select * from contact s where s.contact_name like %:keyword%", nativeQuery = true)
	 List<Contact> findByKeyword(@Param("keyword") String keyword);
}
