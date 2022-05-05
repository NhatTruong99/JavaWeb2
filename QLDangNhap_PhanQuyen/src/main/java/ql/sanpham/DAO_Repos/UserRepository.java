package ql.sanpham.DAO_Repos;

import org.springframework.data.repository.CrudRepository;
import ql.sanpham.domain.User;
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByEmail(String email);

}