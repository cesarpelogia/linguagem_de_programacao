package org.example;

public class Guitarra {

    // Atributos
    private String marca;
    private String modelo;
    private String cor;
    private int corda;

    int volMin = 0;
    int volAtual = 0;
    int volMax = 100;

    int tonMin = 0;
    int tonAtual = 50;
    int tonMax = 100;

    boolean plug = false;

    //Metodos de Acesso Set
    public void setMarca(String marca) {
    }

    public void setModelo(String modelo) {
    }

    public void setCorda(int corda) {
    }

    public void setCor(String cor) {
    }

    // Métodos
    public void aumentarVolume(int aumentandoVolume) {
        int novoVol = volAtual + aumentandoVolume;

        // Verifica se o novo volume não ultrapassa o máximo.
        if (novoVol >= volMin && novoVol <= volMax) {
            volAtual = novoVol;
            System.out.println("Volume aumentado para: " + volAtual);
        } else {
            System.out.println("Já está no volume máximo.");
        }
    }

    public void abaixarVolume(int abaixandoVolume) {
        int novoVol = volAtual - abaixandoVolume;

        // Verifica se o novo volume não ultrapassa o mínimo.
        if (novoVol >= volMin && novoVol <= volMax) {
            volAtual = novoVol;
            System.out.println("Volume abaixando para: " + volAtual);
        } else {
            System.out.println("Já está no volume mínimo.");
        }
    }
    // Aumentando tonalidade
    public void aumentarTon(int aumentandoTon) {
        int novoTon = tonAtual + aumentandoTon;

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
    public void diminuirTon(int diminuindoTon) {
        int novoTon = tonAtual - diminuindoTon;

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
            plug = true;
            System.out.println("A guitarra está plugada!");
        }
    }
    // Verificando se a guitarra está desplugada
    public void desplugarGuitarra(boolean desplugandoGuitarra) {
        if (desplugandoGuitarra == plug) {
            System.out.println("A guitarra já está desplugada");
        } else {
            plug = false;
            System.out.println("Silêncio, até que enfim!");
        }
    }

    public void qntdCorda(int qtsCordas) {
        if (qtsCordas == getCorda()) {
            System.out.println("Seja bem-vindo! Logo um vendedor te atenderá!");
        } else if (qtsCordas > getCorda()) {
            System.out.println("Não possuímos guitarras com menos de 6 cordas na loja");
        } else {
            System.out.println("Não existe guitarra com menos de 6 cordas");
        }
    }

    //Metodos de Acesso Set
    public String getMarca() {
        return this.marca;
    }
    public String getModelo() { return this.modelo; }
    public String getCor() {
        return this.cor;
    }
    public int getCorda(){
        return this.corda;
    }
}