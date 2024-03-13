package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Criando Baixo
        Baixo b1 = new Baixo();

        // Definindo valores usando set
        b1.setMarca("Fender");
        b1.setModelo("Jazz Bass");
        b1.setCor("Sunburst");
        b1.setCorda(4);


        b1.aumentarVolumeB(80);
        b1.abaixarVolumeB(30);
        b1.aumentarTonB(20);
        b1.diminuirTonB(30);
        b1.plugarBaixo(false);
        b1.desplugarBaixo(false);
        b1.qntdCordaB(4);


        // Obtendo valores usando get
        String marcaB1 = b1.getMarca();
        String modeloB1 = b1.getModelo();
        String corB1 = b1.getCor();
        int cordaB1 = b1.getCorda();



       //Criando Guitarra
        Guitarra g1 = new Guitarra();

        // Definindo valores usando set

        g1.setMarca("Gibson");
        g1.setModelo("Les Paul");
        g1.setCor("Sunburst");
        g1.setCorda(6);


        g1.aumentarVolumeG(70);
        g1.abaixarVolumeG(30);
        g1.aumentarTonG(20);
        g1.diminuirTonG(40);
        g1.plugarGuitarra(false);
        g1.desplugarGuitarra(false);
        g1.qntdCordaG(6);


        // Obtendo valores usando get

        String marcaG1 = g1.getMarca();
        String modeloG1 = g1.getModelo();
        String corG1 = g1.getCor();
        int cordaG1 = g1.getCorda();



        // Criando Bateria
        Bateria d1 = new Bateria();

        // Definindo valores usando set

        d1.setMarca("Tama");
        d1.setCor("Preta");
        d1.setPrato(6);
        d1.setBumbo(true);
        d1.setCaixa(true);


        d1.testarBumbo(true);
        d1.testarCaixa(true);
        d1.qntdPratos(6);


        // Obtendo valores usando get

        String marcaD1 = d1.getMarca();
        String corD1 = d1.getCor();
        int pratoC1 = d1.getPrato();

        // Criando Teclado

        Teclado t1 = new Teclado();

        t1.setMarcaT("Roland");
        t1.setCorT("Preto");
        t1.setTecla(64);

        t1.ligarTeclado(true);
        t1.desligarTeclado(false);
        t1.tocarTeclado("Sim");




        //Criando Violao

        Violao v1 = new Violao();

        // Definindo valores usando set

        v1.setMarcaV("Fender");
        v1.setModeloV("Classic");
        v1.setCorV("Natural");
        v1.setCordaV(6);


        v1.aumentarVolumeV(62);
        v1.abaixarVolumeV(26);
        v1.aumentarTonV(58);
        v1.diminuirTonV(60);
        v1.plugarViolao(false);
        v1.desplugarViolao(false);
        v1.qntdCordaV(6);


        // Obtendo valores usando get

        String marcaV1 = v1.getMarca();
        String modeloV1 = v1.getModelo();
        String corV1 = v1.getCor();
        int cordaV1 = v1.getCorda();



        // Criaco Cavao

        Cavaco c1 = new Cavaco();

        c1.setMarcaC("Gianini");
        c1.setModeloC("Carioca");
        c1.setCorC("Envernizado");
        c1.setCordaC(5);

        c1.chorarCavaco(true);
        c1.afinarCavaco(true);
        c1.plugarCavaco(true);

        c1.getMarcaC();
        c1.getModeloC();
        c1.getCorC();
        c1.getCordaC();


        // Criando Harpa

        Harpa h1 = new Harpa();

         // Definindo valores usando set
        h1.setMarcaH("Yamaha");
        h1.setModeloH("Clássica");
        h1.setCorH("Marrom");
        h1.setCordaH(47);

        h1.dedilharHarpa(true);
        h1.soarHarpa(true);
        h1.plugarHarpa(true);
        h1.desplugarHarpa(false);
        h1.qntdCordaH(47);

        // Obtendo valores usando get
        String marcaH1 = h1.getMarcaH();
        String modeloH1 = h1.getModeloH();
        String corH1 = h1.getCorH();
        int cordaH1 = h1.getCordaH();



        // Criando Toca Discos

        TocaDiscos td1 = new TocaDiscos();


        // Definindo valores usando set

        td1.setMarcaTD("Sony");
        td1.setModeloTD("Clássico");
        td1.setCorTD("Preto");
        td1.setDiscosTD(2);

        td1.aumentarVolumeTD(20);
        td1.diminuirVolumeTD(10);
        td1.arranharTocaDiscos(true);
        td1.desligarTocaDiscos(false);

         // Obtendo valores usando get

        String marcaTD1 = td1.getMarcaTD();
        String modeloTD1 = td1.getModeloTD();
        String corTD1 = td1.getCorTD();
        int discosTD1 = td1.getDiscosTD();



        // Criando Percussão

        Percussao p1 = new Percussao();


        // Definindo valores usando set

        p1.setSurdo(true);
        p1.setChimbal(true);
        p1.setTotalPecas(8);
        p1.setModeloP("Premium");

        p1.testarSurdo(true);
        p1.testarChimbal(true);
        p1.girarPrato();
        p1.baterBaqueta();

        String modeloP1 = p1.getModelo();
        int totalPecasP1 = p1.getTotalPecas();

    }
}



