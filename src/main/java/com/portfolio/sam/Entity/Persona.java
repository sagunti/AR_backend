
package com.portfolio.sam.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size( min = 1, max= 50,message = "No cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size( min = 1, max= 50,message = "No cumple con la longitud")
    private String apellido;
    
    
    private String img;

    @Size (min =1, max=50,message = "No cumple con la longitud")
    private String posicion;
    
    @NotNull
    
    private String descripcion;
    
    
    private String foto;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String img, String posicion, String descripcion, String foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.posicion = posicion;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
