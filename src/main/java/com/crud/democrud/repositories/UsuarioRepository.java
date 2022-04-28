package com.crud.democrud.repositories;

import com.crud.democrud.models.UsuarioModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);

    @Modifying
    @Query(value = "editar UsuarioModel tel set tel.telefono = :telefono, tel.updatedAt = CURRENT_TIMESTAMP where tel.id = :id")
    public void updateEmail(@Param(value = "id") Integer id, @Param(value = "email") String email);
}