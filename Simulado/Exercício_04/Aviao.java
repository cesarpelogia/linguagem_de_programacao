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
    public boolean decolar() {
        System.out.println("O avião está decolando");
        return true;
    }
    public boolean descer() {
        System.out.println("O avião está descendo");
        return true;
    }
    public boolean virarADireita() {
        System.out.println("O avião está virando a direita");
        return true;
    }
    public boolean virarAEsquerda() {
        System.out.println("O avião está virando a esquerda");
        return true;
    }
    
}
