package com.upsjb.sesion2.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Configuraciones{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long idConfiguraciones;
    @Getter
    @Setter
    @Column
    private String Clave;
    @Getter
    @Setter
    @Column
    private String Valor;
    @Getter
    @Setter
    @Column
    private String Descripcion;
    @Getter
    @Setter
    @Column
    private String Tipo;
    @Getter
    @Setter
    @Column
    private String Fecha_creacion;
    @Getter
    @Setter
    @Column
    private String Fecha_modificacion;
    @Getter
    @Setter
    @Column
    private String Usuario_modificacion;
    @Getter
    @Setter
    @Column
    private String Activo;
    @Getter
    @Setter
    @Column
    private String Categoria;
    @Getter
    @Setter
    @Column
    private String Prioridad;
    @Getter
    @Setter
    @Column
    private String Comentario;
    @Getter
    @Setter
    @Column
    private String Valor_default;
    @Getter
    @Setter
    @Column
    private String Nombre;
    @Getter
    @Setter
    @Column
    private String Estado;






}