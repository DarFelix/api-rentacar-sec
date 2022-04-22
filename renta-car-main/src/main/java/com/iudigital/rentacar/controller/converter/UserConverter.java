package com.iudigital.rentacar.controller.converter;

import org.springframework.stereotype.Component;

import com.iudigital.rentacar.controller.dto.RolDTO;
import com.iudigital.rentacar.controller.dto.UserDTO;
import com.iudigital.rentacar.domain.Rol;
import com.iudigital.rentacar.domain.User;

@Component
public class UserConverter {

	public User convertUserDTOToUser (UserDTO userDTO) {
		
		User user= new User();
		
		user.setIdUser(userDTO.getIdUser());
		user.setCedula(userDTO.getCedula());
		user.setNombre(userDTO.getNombre());
		user.setApellido(userDTO.getApellido());
		user.setAge(userDTO.getAge());
		user.setTelefono(userDTO.getTelefono());
		user.setDireccion(userDTO.getDireccion());
		user.setBarrio(userDTO.getBarrio());
		user.setCiudad(userDTO.getCiudad());
		user.setFoto(userDTO.getFoto());
		user.setReporte(userDTO.isReporte());	
		user.setPass(userDTO.getPass());
		Rol rol = new Rol();
		rol.setIdRol(userDTO.getRol().getIdRol());
		rol.setNombreRol(userDTO.getRol().getNombreRol());
		user.setRol(rol);
		return user;
	}
	
	
	public UserDTO convertUserToUserDTO (User user) {
		
		UserDTO userDTO = new UserDTO();
		
		userDTO.setIdUser(user.getIdUser());
		userDTO.setCedula(user.getCedula());
		userDTO.setNombre(user.getNombre());
		userDTO.setApellido(user.getApellido());
		userDTO.setAge(user.getAge());
		userDTO.setTelefono(user.getTelefono());
		userDTO.setDireccion(user.getDireccion());
		userDTO.setBarrio(user.getBarrio());
		userDTO.setCiudad(user.getCiudad());
		userDTO.setFoto(user.getFoto());
		userDTO.setReporte(user.isReporte());
		userDTO.setPass(user.getPass());
		
		RolDTO rolDTO = new RolDTO();
		rolDTO.setIdRol(user.getRol().getIdRol());
		rolDTO.setNombreRol(user.getRol().getNombreRol());
		
		userDTO.setRol(rolDTO);
		
		return userDTO;
		
		
	}
	
	
}
