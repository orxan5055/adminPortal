package com.adminportal.service;

import java.util.Set;

import com.adminportal.domain.User;
import com.adminportal.domain.tehlukesizlik.UserRole;

public interface UserService {
	
    User createUser(User user,Set<UserRole> userRoles) throws Exception;

	User save(User user);
}
