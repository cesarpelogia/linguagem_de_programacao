package com.tarefa_2;

public class Teclado {

    // Atributos

    private String marcaT;
    private String corT;
    private int tecla;
    boolean ligado = true;

    // Metodos

    // Ligando Teclado
    public void ligarTeclado(boolean ligandoTeclado) {
        if (ligandoTeclado == ligado) {
            System.out.print("Teclado está ligado");
        } else {
            System.out.print("Ligue o teclado.");
        }
    }

    // Tocando teclado
    public void tocarTeclado(String tocandoTeclado) {
        System.out.println("Dó ré mí fá!");
    }

    // Deligando teclado
    public void desligarTeclado(boolean desligandoTeclado) {
        if (desligandoTeclado != ligado) {
            System.out.println("O Teclado está delisgado");
        } else {
            System.out.print("Desligue o teclado.");
        }
    }

    // Metodos de Acesso Set

    public String setMarcaT(String marcaT) {
        return marcaT = this.marcaT;
    }

    public String setCorT(String corT) {
        return corT = this.corT;
    }

    public int setTecla(int tecla) {
        return tecla = this.tecla;
    }

    // Metodos de Acesso Get

    public String getMarcaT() {
        return this.marcaT;
    }

    public String getCorT() {
        return this.corT;
    }

    public int getTecla() {
        return this.tecla;
    }

}
