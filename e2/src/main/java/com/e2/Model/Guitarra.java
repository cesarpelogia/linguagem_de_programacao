package com.e2.Model;

public class Guitarra {

    private String id;
    private String marcaG;
    private String modeloG;
    private String corG;
    private String cordaG;

    public Guitarra(String id, String marcaG, String modeloG, String corG, String cordaG) {
        this.id = id;
        this.marcaG = marcaG;
        this.modeloG = modeloG;
        this.corG = corG;
        this.cordaG = cordaG;
    }

    public Guitarra( String marcaG, String modeloG, String corG, String cordaG) {
        this.marcaG = marcaG;
        this.modeloG = modeloG;
        this.corG = corG;
        this.cordaG = cordaG;
    }

    // Metodos de Acesso Set:

    public String setMarcaG(String marca) {
        return marca = this.marcaG;
    }

    public String setModeloG(String modelo) {
        return modelo = this.modeloG;
    }

    public String setCorG(String cor) {
        return cor = this.corG;
    }

    public String setCordaG(String corda) {
        return corda = this.cordaG;
    }

    // Metodos de Acesso Get
    
    public String getId() {
        return this.id;
    }
    public String getMarcaG() {
        return this.marcaG;
    }

    public String getModeloG() {
        return this.modeloG;
    }

    public String getCorG() {
        return this.corG;
    }

    public String getCordaG() {
        return this.cordaG;
    }

}
