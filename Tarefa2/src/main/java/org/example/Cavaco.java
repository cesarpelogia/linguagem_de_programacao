package org.example;

public class Cavaco {

    // Atributo

    private String marcaC;
    private String modeloC;
    private String corC;
    private int cordaC;



    // Metodos

    public void chorarCavaco(boolean chorandoCavaco) {
        System.out.println("Ting tiling ting");
    }
    public void afinarCavaco(boolean afinandoCavaco){
        System.out.println("Afinado!");
    }
    public void plugarCavaco(boolean plugandoCavaco){
        System.out.println("Cavaco plugado!");
    }


    // Metodos de Acesso Set

    public String setMarcaC (String marcaC){
        return marcaC = this.marcaC;
    }
    public void setModeloC (String modeloC){
        marcaC = this.modeloC;
    }
    public void setCorC (String CorC){
        marcaC = this.corC;
    }
    public void setCordaC (int cordaC){
        cordaC = this.cordaC;
    }

    // Metodos de Acesso Get

    public String getMarcaC (){
        return marcaC = this.marcaC;
    }
    public String getModeloC(){
        return modeloC = this.modeloC;
    }
    public String getCorC(){
        return corC = this.corC;
    }
    public int getCordaC(){
        return cordaC = this.cordaC;
    }




}