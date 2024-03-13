package org.example;

public class RecoReco {

    private String marcaR;
    private String modeloR;
    private int pesoR;
    private String estadoR;


    // Métodos

    // Produzir som do reco-reco

    public void produzirSom() {
        System.out.println("Reco Reco Reco");
    }

    // Verificar modelo

    public void verificarModelo( String verificandoModelo) {
        if (verificandoModelo == this.modeloR) {
            System.out.println("É esse mesmo modelo!");
        } else {
            System.out.println("Infelizmente é outro modelo");
        }
    }

    // Conferindo peso

    public void verificarPeso(int verificandoPeso) {
        if (verificandoPeso >= this.pesoR) {
            System.out.println("Está muito pesado!");
        } else {
            System.out.println("Esse mesmo!");
        }
    }

    // Obter nome do conjunto

    public String getMarcaR() {
        return this.marcaR;
    }
    public String getModeloR() {
        return this.modeloR;
    }
    public int getPesoR() {
        return this.pesoR;
    }
    public String getEstadoR() {
        return this.estadoR;
    }


    // Métodos de Acesso Set:

    public String setMarcaR(String marcaR) {
        return marcaR = this.marcaR;
    }
    public String setModeloR (String modeloR) { return modeloR = this.modeloR; }
    public int setPesoR(int pesoR) { return pesoR = this.pesoR; }
    public String setEstadoR (String estadoR){ return estadoR = this.estadoR; }
}

