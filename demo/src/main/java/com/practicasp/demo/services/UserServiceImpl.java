package com.practicasp.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicasp.demo.dao.UserRepository;
import com.practicasp.demo.modelo.Users;

@Service //indica que es un servisio
public class UserServiceImpl implements UserService{
	
	@Autowired //inyeccion de dependecia
	protected UserRepository  userRepository;

	@Override
	public Users save(Users user) {

		return this.userRepository.save(user); 
	}
	
}
