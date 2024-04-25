package com.e1.Model;

public class Violao {

    public String marcaV;
    public String modeloV;
    public String corV;
    public String cordaV;

    public Violao(String marcaV, String modeloV, String corV, String cordaV) {
        this.marcaV = marcaV;
        this.modeloV = modeloV;
        this.corV = corV;
        this.cordaV = cordaV;
    }
    @Override
    public String toString() {
        return "Violao{" +
                "marca='" + marcaV + '\'' +
                ", modelo='" + modeloV + '\'' +
                ", cor='" + corV + '\'' +
                ", corda='" + cordaV + '\'' +
                '}';
    }
    // Metodos de acesso Get
    public String getMarcaV() {

        return this.marcaV;
    }

    public String getModeloV() {

        return this.modeloV;
    }

    public String getCorV() {
        return this.corV;
    }

    public String getCordaV() {

        return this.cordaV;
    }

    public String setMarcaV(String marcaV) {
        return marcaV = this.marcaV;
    }

    public String setModeloV(String modeloV) {
        return modeloV = this.modeloV;
    }

    public String setCorV(String corV) {
        return corV = this.corV;
    }

    public String setCordaV(String cordaV) {
        return cordaV = this.cordaV;
    }
}

