package org.example;

public class RecoReco {

    private String marca;
    private String modelo;
    private int peso;
    private String estado;


    // Métodos

    // Produzir som do reco-reco
    public void produzirSom() {
        System.out.println("Reco Reco Reco");
    }

    // Verificar modelo
    public void verificarModelo( String verificandoModelo) {
        if (verificandoModelo == this.modelo) {
            System.out.println("É esse mesmo modelo!");
        } else {
            System.out.println("Infelizmente é outro modelo");
        }
    }

    // Obter o peso
    public int verificarPeso(int verificandoPeso) {
        if (verificandoPeso >= this.peso) {
            System.out.println("Está muito pesado!");
        } else {
            System.out.println("Esse mesmo!");
        }

    }

    // Obter nome do conjunto
    public String getNomeConjunto() {
        return nomeConjunto;
    }

    // Métodos de Acesso Set:

    public void setQuantidadeDentes(int quantidadeDentes) {
        this.quantidadeDentes = quantidadeDentes;
    }

    public void setPossuiGolpeador(boolean possuiGolpeador) {
        this.possuiGolpeador = possuiGolpeador;
    }
}

