package com.crud.democrud.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class RolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idRol;
    private String rol;

    @ManyToOne(
            fetch = FetchType.LAZY,
            targetEntity = UsuarioModel.class,
            optional = false
    )
    @JoinColumn(name = "idUsuario")
    @JsonBackReference
    private UsuarioModel usuarioModel;

    public RolModel() {
    }

    public RolModel(String rol) {
        this.rol = rol;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public UsuarioModel getUsuarioModel() {
        return usuarioModel;
    }

    public void setUsuarioModel(UsuarioModel usuarioModel) {
        this.usuarioModel = usuarioModel;
    }
}
