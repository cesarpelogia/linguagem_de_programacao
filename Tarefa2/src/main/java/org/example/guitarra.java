package org.example;

public class Guitarra {

    //Atributos
    private String modelo;
    private String cor;
    private int cordas;

    //Metodos

    public boolean qnt_cordas(int crd) {
        boolean classica = true;
        if (crd%6!=0) {
            classica = false;
            System.out.println("Não é uma " + modelo + " clássica.");
        };
        return classica;        
    }
    
    public String setModelo() {
        return this.modelo;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
        

        }
}
