/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.sam.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author sam-s
 */
public class dtoPersona {
    
    
   @NotBlank
    private String nombre;   
   @NotBlank
    private String apellido;
   @NotBlank
   private String img;
   @NotBlank
    private String posicion;
    @NotBlank
    private String descripcion;
    @NotBlank    
    private String foto;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String img, String posicion, String descripcion, String foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.posicion = posicion;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}
