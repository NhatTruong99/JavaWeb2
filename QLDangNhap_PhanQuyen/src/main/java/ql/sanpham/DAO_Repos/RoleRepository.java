package ql.sanpham.DAO_Repos;

import org.springframework.data.repository.CrudRepository;

import ql.sanpham.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByName(String name);

}