package com.practicasp.demo.services;

import java.util.List;

import com.practicasp.demo.modelo.Users;

public interface UserService {
	/**
	 * Guarda un usuario.
	 * @param user
	 * @return el usuario guardado
	 */
	Users save(Users user);
	
	/**
	 * Retorna lista de usuarios.
	 * @return lista de usuarios
	 */
	List<Users> findAll();

	/**
	 * Elimina un usuario con el Id recibido
	 * @param id
	 */
	void delete(Long id);

}
