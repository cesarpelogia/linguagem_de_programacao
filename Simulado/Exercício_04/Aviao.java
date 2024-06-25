package Exercício_04;

public class Aviao {
    
    // Atributos
    private String Tipo;
    private String Modelo;
    private int Ano;

    // Metodos de acesso Tipo
    public void setTipo(String Tipo) { this.Tipo = Tipo; }
    public String getTipo() {return Tipo;}

    // Metodos de acesso Modelo
    public void setModelo(String Modelo) {this.Modelo = Modelo;}
    public String getModelo() {return Modelo;}

    // Metodos de acesso Ano
    public void setAno(int Ano) {this.Ano = Ano;}
    public int getAno() {return Ano;}

    // Metodos
    public boolean planar() {
        System.out.println("O avião está planando");
        return true;
    }
    public boolean pousar() {
        System.out.println("O avião está pousando");
        return true;
    }
    public boolean voar() {
        System.out.println("O avião está voando");
        return true;
    }
    public boolean girar() {
        System.out.println("O avião está girando");
        return true;
    }
}
