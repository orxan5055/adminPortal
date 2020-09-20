package com.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.adminportal.domain.tehlukesizlik.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{
 Role findByname(String name);
}
