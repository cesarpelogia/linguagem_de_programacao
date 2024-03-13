package org.example;
public class Violao {

    private String marcaV;
    private String modeloV;
    private String corV;
    private int cordaV;

    int volMin = 0;
    int volMax = 100;

    int volAtual = 0;

    int tonMin = 0;
    int tonAtual = 50;
    int tonMax = 100;

    boolean plug = false;

    // Métodos

    public void aumentarVolumeV(int aumentandoVolumeV) {
        int novoVol = volAtual + aumentandoVolumeV;

        // Verifica se o novo volume não ultrapassa o máximo.
        if (novoVol >= volMin && novoVol <= volMax) {
            volAtual = novoVol;
            System.out.println("Volume aumentado para: " + volAtual);
        } else {
            System.out.println("Já está no volume máximo.");
        }
    }

    public void abaixarVolumeV(int abaixandoVolumeV) {
        int novoVol = volAtual - abaixandoVolumeV;

        // Verifica se o novo volume não ultrapassa o mínimo.
        if (novoVol >= volMin && novoVol <= volMax) {
            volAtual = novoVol;
            System.out.println("Volume abaixando para: " + volAtual);
        } else {
            System.out.println("Já está no volume mínimo.");
        }
    }

    // Aumentando tonalidade
    public void aumentarTonV (int aumentandoTonV) {
        int novoTon = tonAtual + aumentandoTonV;

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
    public void diminuirTonV(int diminuindoTonV) {
        int novoTon = tonAtual - diminuindoTonV;

        // Verifica se o novo volume não ultrapassa o mínimo.
        if (novoTon >= tonMin && novoTon <= tonMax) {
            tonAtual = novoTon;
            System.out.println("Volume alterando para: " + tonAtual);
        } else {
            System.out.println("Você está na tonalidade mais grave agora.");
        }
    }

    // Verificando se guitarra está plugada
    public void plugarViolao(boolean plugandoViolao) {
        if (plugandoViolao == plug) {
            System.out.println("Plugue o Violão!");
        } else {
            System.out.println("o violão está plugado!");
        }
    }

    // Verificando se a guitarra está desplugada
    public void desplugarViolao(boolean desplugandoViolao) {
        if (desplugandoViolao == plug) {
            System.out.println("O violão já está desplugado");
        } else {
            System.out.println("Plugue o violão");
        }
    }

    public void qntdCordaV(int qtsCordas) {
        if (qtsCordas == 6) {
            System.out.println("Seja bem-vindo! Logo um vendedor te atenderá!");
        } else if (qtsCordas > 6) {
            System.out.println("Não possuímos guitarras com mais de 6 cordas na loja");
        } else {
            System.out.println("Esse não temos.");
        }
    }


    // Metodos de Acesso Set:

    public String setMarcaV(String marcaV) {
        return marcaV = this.marcaV;
    }
    public String setModeloV(String modeloV) {
        return modeloV = this.modeloV;
    }
    public String setCorV(String corV) {
        return corV = this.corV;
    }
    public int setCordaV(int cordaV){
        return cordaV = this.cordaV;
    }


    // Metodos de Acesso Get

    public String getMarca(){
        return this.marcaV;
    }
    public String getModelo(){
        return this.modeloV;
    }
    public String getCor(){
        return this.corV;
    }
    public int getCorda(){
        return this.cordaV;
    }

}
