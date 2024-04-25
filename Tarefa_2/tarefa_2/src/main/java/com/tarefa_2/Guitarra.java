package com.tarefa_2;

public class Guitarra {

    // Atributos
    private String marca;
    private String modelo;
    private String cor;
    private int corda;

    int volMin = 0;
    int volMax = 100;

    int volAtual = 0;

    int tonMin = 0;
    int tonAtual = 50;
    int tonMax = 100;

    boolean plug = false;

    // Métodos

    public void aumentarVolumeG(int aumentandoVolumeG) {
        int novoVol = volAtual + aumentandoVolumeG;

        // Verifica se o novo volume não ultrapassa o máximo.
        if (novoVol >= volMin && novoVol <= volMax) {
            volAtual = novoVol;
            System.out.println("Volume aumentado para: " + volAtual);
        } else {
            System.out.println("Já está no volume máximo.");
        }
    }

    public void abaixarVolumeG(int abaixandoVolumeG) {
        int novoVol = volAtual - abaixandoVolumeG;

        // Verifica se o novo volume não ultrapassa o mínimo.
        if (novoVol >= volMin && novoVol <= volMax) {
            volAtual = novoVol;
            System.out.println("Volume abaixando para: " + volAtual);
        } else {
            System.out.println("Já está no volume mínimo.");
        }
    }

    // Aumentando tonalidade
    public void aumentarTonG(int aumentandoTonG) {
        int novoTon = tonAtual + aumentandoTonG;

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
    public void diminuirTonG(int diminuindoTonG) {
        int novoTon = tonAtual - diminuindoTonG;

        // Verifica se o novo volume não ultrapassa o mínimo.
        if (novoTon >= tonMin && novoTon <= tonMax) {
            tonAtual = novoTon;
            System.out.println("Volume alterando para: " + tonAtual);
        } else {
            System.out.println("Você está na tonalidade mais grave agora.");
        }
    }

    // Verificando se guitarra está plugada
    public void plugarGuitarra(boolean plugandoGuitarra) {
        if (plugandoGuitarra == plug) {
            System.out.println("Plugue a guitarra!");
        } else {
            System.out.println("A guitarra está plugada!");
        }
    }

    // Verificando se a guitarra está desplugada
    public void desplugarGuitarra(boolean desplugandoGuitarra) {
        if (desplugandoGuitarra == plug) {
            System.out.println("A guitarra já está desplugada");
        } else {
            System.out.println("Plugue a guitarra");
        }
    }

    public void qntdCordaG(int qtsCordas) {
        if (qtsCordas == 6) {
            System.out.println("Seja bem-vindo! Logo um vendedor te atenderá!");
        } else if (qtsCordas > 6) {
            System.out.println("Não possuímos guitarras com mais de 6 cordas na loja");
        } else {
            System.out.println("Não existe guitarra com menos de 6 cordas");
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

    public int setCorda(int corda) {
        return corda = this.corda;
    }

    // Metodos de Acesso Get

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public int getCorda() {
        return this.corda;
    }

}