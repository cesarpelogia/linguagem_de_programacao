package org.example;

public class Percussao {

    private boolean surdo;
    private boolean chimbal;
    private int totalPecas;
    private String modeloP;



    // Métodos

    // Testando surdo
    public void testarSurdo(boolean testandoSurdo) {
        if (testandoSurdo == this.surdo) {
            System.out.println("Bum Bum");
        } else {
            System.out.println("Não temos surdo aqui!");
        }
    }

    // Testando chimbal
    public void testarChimbal(boolean testandoChimbal) {
        if (testandoChimbal == this.chimbal) {
            System.out.println("Chim Chim");
        } else {
            System.out.println("Não temos chimbal aqui!");
        }
    }

    // Girar prato
    public void girarPrato() {
        System.out.println("Prato girando!");
    }

    // Bater baqueta
    public void baterBaqueta() {
        System.out.println("Baqueta batendo!");
    }




    // Metodos de Acesso Get
    public int getTotalPecas() { return totalPecas; }
    public String getModelo() { return modeloP; }


    // Métodos de Acesso Set:

    public boolean setSurdo(boolean surdo) { return surdo = this.surdo; }
    public boolean setChimbal(boolean chimbal) { return chimbal = this.chimbal; }
    public int setTotalPecas (int totalPecas) { return totalPecas = this.totalPecas; }
    public String setModeloP(String modelo) { return modelo = this.modeloP; }
}
