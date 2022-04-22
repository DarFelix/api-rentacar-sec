package com.iudigital.rentacar.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.iudigital.rentacar.domain.Rol;


@Repository
public interface RolRepository extends CrudRepository<Rol, String> {

}
