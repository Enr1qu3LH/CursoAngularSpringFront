package com.practicasp.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicasp.demo.modelo.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
	
	@SuppressWarnings("unchecked")
	Users save(Users user);

}
