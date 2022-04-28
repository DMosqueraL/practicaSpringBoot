package com.crud.democrud.repositories;

import com.crud.democrud.models.RolModel;
import com.crud.democrud.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface RolRepository extends CrudRepository<RolModel, Long> {
    public abstract ArrayList<RolModel> findAll(Long id);
}
