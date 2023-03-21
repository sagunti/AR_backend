package com.portfolio.sam.Dto;

import javax.validation.constraints.NotBlank;




public class dtoExperiencia {
        
    @NotBlank
    private String nombreE;
    @NotBlank
    private String gitHub;
    @NotBlank
    private String url;
    @NotBlank
    private String imagen;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String gitHub, String url, String imagen) {
        this.nombreE = nombreE;
        this.gitHub = gitHub;
        this.url = url;
        this.imagen = imagen;
    }
    //Getters & Se

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
}
