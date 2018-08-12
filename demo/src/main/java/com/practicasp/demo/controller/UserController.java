package com.practicasp.demo.controller;

import java.io.IOException;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.practicasp.demo.modelo.Users;
import com.practicasp.demo.services.UserService;
import com.praticasp.demo.utils.RestResponse;

import antlr.StringUtils;

@RestController
public class UserController {

	@Autowired //Inyeccion de dependencia
	protected UserService userService;

	protected ObjectMapper mapper;
	
	//URL con la cual se va a enviar de tipo POST la cual guaradara la BD.
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST) 
	public RestResponse saveOrUpdate(@RequestBody String userJson) 
			throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();
		Users user = this.mapper.readValue(userJson,Users.class);
		
		if(!this.validate(user)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Los campos obligatorios no estan diligenciados");
		}
		this.userService.save(user);
		return new RestResponse(HttpStatus.OK.value(),"Operación éxitosa");
		
	}
	
	private boolean validate(Users user) {
		boolean isValid = true;
		
		if(user.getNombre1().equals("") || user.getNombre1().equals(null))
			isValid = false;
		
		if(user.getAppaterno().equals("") || user.getAppaterno().equals(null))
			isValid = false;
		
		if(user.getDireccion().equals("") || user.getDireccion().equals(null))
			isValid = false;
		
		return isValid;
	}
	
}
