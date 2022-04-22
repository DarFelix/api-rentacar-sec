package com.iudigital.rentacar.controller.converter;

import org.springframework.stereotype.Component;

import com.iudigital.rentacar.controller.dto.RolDTO;
import com.iudigital.rentacar.domain.Rol;

@Component
public class RolConverter {

	public Rol convertRolDTOToRol(RolDTO rolDTO) {
		
		Rol rol = new Rol();
		
		rol.setIdRol(rolDTO.getIdRol());
		rol.setNombreRol(rolDTO.getNombreRol());
		
		return rol;
	}
	
	public RolDTO convertRolToRolDTO(Rol rol) {
		
		RolDTO rolDTO = new RolDTO();
		
		rolDTO.setIdRol(rol.getIdRol());
		rolDTO.setNombreRol(rol.getNombreRol());
		
		return rolDTO;
	}
	
}
