package org.example;

public class Baixo {

    private String marca;
    private String modelo;
    private String cor;
    private int cordaB;

    int volMin = 0;
    int volMax = 100;

    int volAtual = 0;

    int tonMin = 0;
    int tonAtual = 50;
    int tonMax = 100;

    boolean plug = false;

    // Métodos

    public void aumentarVolumeB(int aumentandoVolumeB) {

        int novoVol = volAtual + aumentandoVolumeB;

        // Verifica se o novo volume não ultrapassa o máximo.
        if (novoVol >= volMin && novoVol <= volMax) {
            volAtual = novoVol;
            System.out.println("Volume aumentado para: " + volAtual);
        } else {
            System.out.println("Já está no volume máximo.");
        }
    }

    public void abaixarVolumeB(int abaixandoVolumeB) {
        int novoVol = volAtual - abaixandoVolumeB;

        // Verifica se o novo volume não ultrapassa o mínimo.
        if (novoVol >= volMin && novoVol <= volMax) {
            volAtual = novoVol;
            System.out.println("Volume abaixando para: " + volAtual);
        } else {
            System.out.println("Já está no volume mínimo.");
        }
    }

    // Aumentando tonalidade
    public void aumentarTonB(int aumentandoTonB) {
        int novoTon = tonAtual + aumentandoTonB;

        // Verifica se o novo volume não ultrapassa o máximo.
        if (novoTon >= tonMin && novoTon <= tonMax) {
            tonAtual = novoTon;
            System.out.println("Volume alterando para: " + tonAtual);
        } else {
            tonMax = novoTon;
            System.out.println("Você está na tonalidade mais aguda agora.");
        }
    }

    // Diminuindo tonalidade
    public void diminuirTonB(int diminuindoTonB) {
        int novoTon = tonAtual - diminuindoTonB;

        // Verifica se o novo volume não ultrapassa o mínimo.
        if (novoTon >= tonMin && novoTon <= tonMax) {
            tonAtual = novoTon;
            System.out.println("Volume alterando para: " + tonAtual);
        } else {
            System.out.println("Você está na tonalidade mais grave agora.");
        }
    }

    // Verificando se guitarra está plugada
    public void plugarBaixo(boolean plugandoBaixo) {
        if (plugandoBaixo == plug) {
            System.out.println("Plugue a guitarra!");
        } else {
            System.out.println("A guitarra está plugada!");
        }
    }

    // Verificando se a guitarra está desplugada
    public void desplugarBaixo(boolean desplugandoBaixo) {
        if (desplugandoBaixo == plug) {
            System.out.println("A guitarra já está desplugada");
        } else {
            System.out.println("Plugue a guitarra");
        }
    }

    public void qntdCordaB(int qtsCordasB) {
        if (qtsCordasB == cordaB) {
            System.out.println("O clássico 4 cordas!");
        } else if (qtsCordasB == 5) {
            System.out.println("Entendi! Você gostaria de um 5 cordas");
        } else {
            System.out.println("Olhá só! Um 6 cordas");
        }
    }


    // Metodos de Acesso Set:
    public String setMarca(String marca) {

        return marca = this.marca;
    }
    public String setModelo(String modelo) {

        return modelo = this.modelo;
    }
    public String setCor(String cor) {

        return cor = this.cor;
    }
    public int setCorda(int corda){

        return corda = this.cordaB;
    }


    // Metodos de acesso Get
    public String getMarca(){

        return this.marca;
    }
    public String getModelo(){

        return this.modelo;
    }
    public String getCor(){

        return this.cor;
    }
    public int getCorda(){

        return this.cordaB;
    }
}
