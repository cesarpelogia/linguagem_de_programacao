package com.e1;

public class Violao {

    public String marca;
    public String modelo;
    public String cor;
    public String corda;

    public Violao(String marca, String modelo, String cor, String corda) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.corda = corda;
    }

    // Metodos de acesso Get
    public String getMarca() {

        return this.marca;
    }

    public String getModelo() {

        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public String getCorda() {

        return this.corda;
    }

    public String setMarca(String marca) {
        return marca = this.marca;
    }

    public String setModelo(String modelo) {
        return modelo = this.modelo;
    }

    public String setCor(String cor) {
        return cor = this.cor;
    }

    public String setCorda(String corda) {
        return corda = this.corda;
    }
}
