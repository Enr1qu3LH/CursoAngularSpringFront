package com.practicasp.demo.services;

import java.util.List;

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

	@Override
	public List<Users> findAll() {
		return this.userRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		this.userRepository.deleteById(id);
		
	}
	
}
