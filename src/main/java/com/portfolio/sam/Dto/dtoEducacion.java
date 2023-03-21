package com.portfolio.sam.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    
@NotBlank
private String nombreE;
@NotBlank
private String descripcionE;
@NotBlank
private String imagenE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String imagenE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imagenE = imagenE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescrpionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImagenE() {
        return imagenE;
    }

    public void setImagenE(String imagenE) {
        this.imagenE = imagenE;
    }
    
}
