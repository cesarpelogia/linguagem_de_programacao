package com.e1.Model;

public class Guitarra {

    public String marcaG;
    public String modeloG;
    public String corG;
    public String cordaG;

    public Guitarra(String marcaG, String modeloG, String corG, String cordaG) {
        this.marcaG = marcaG;
        this.modeloG = modeloG;
        this.corG = corG;
        this.cordaG = cordaG;
    }
    

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

    @Override
    public String toString() {
        return "Guitarra{" +
               "marca='" + marcaG + '\'' +
               ", modelo='" + modeloG + '\'' +
               ", cor='" + corG + '\'' +
               ", cordas=" + cordaG +
               '}';
    }

    // Metodos de Acesso Set:

    public String setMarcaG(String marca) {
        return marca = this.marcaG;
    }

    public String setModeloG(String modelo) {
        return modelo = this.modeloG;
    }

    public String setCorG(String cor) {
        return cor = this.corG;
    }

    public String setCordaG(String corda) {
        return corda = this.cordaG;
    }

    // Metodos de Acesso Get

    public String getMarcaG() {
        return this.marcaG;
    }

    public String getModeloG() {
        return this.modeloG;
    }

    public String getCorG() {
        return this.corG;
    }

    public String getCordaG() {
        return this.cordaG;
    }

}
