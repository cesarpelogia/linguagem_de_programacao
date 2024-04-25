package com.tarefa_2;

public class Bateria {

    // Atributos

    private String marca;
    private boolean bumbo;
    private boolean caixa;
    private String cor;
    private int prato;

    // Metodos

    // Testando bumbo

    public void testarBumbo(boolean testandoBumbo) {
        if (bumbo == true) {
            System.out.println("Tum Tum");
        } else {
            System.out.println("Não temos bumbo aqui!");
        }
    }

    // Testando caixa
    public void testarCaixa(boolean testandoCaixa) {
        if (caixa == true) {
            System.out.println("Tá Tá");
        } else {
            System.out.print("Não temos caixa aqui");
        }
    }

    // Quantidade de pratos.
    public int qntdPratos(int qtsPratos) {
        System.out.println("Essa bateria possui " + this.prato + " pratos.");
        return this.prato;
    }

    // Metodos de Acesso Set

    public String setMarca(String marca) {
        return marca = this.marca;
    }

    public String setCor(String cor) {
        return cor = this.cor;
    }

    public int setPrato(int prato) {
        return prato = this.prato;
    }

    public boolean setBumbo(boolean bumbo) {
        return bumbo = this.bumbo;
    }

    public boolean setCaixa(boolean caixa) {
        return caixa = this.caixa;
    }

    // Metodos de Acesso Get

    public String getMarca() {
        return this.marca;
    }

    public String getCor() {
        return this.cor;
    }

    public int getPrato() {
        return this.prato;
    }
}
