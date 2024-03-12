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
        Guitarra c1 = new Guitarra();

        // Definindo valores usando set
        c1.setMarca("Gibson");
        c1.setModelo("Les Paul");
        c1.setCor("Sunburst");
        c1.setCorda(6);


        c1.aumentarVolumeG(70);
        c1.abaixarVolumeG(30);
        c1.aumentarTonG(20);
        c1.diminuirTonG(40);
        c1.plugarGuitarra(false);
        c1.desplugarGuitarra(false);
        c1.qntdCordaG(6);


        // Obtendo valores usando get
        String marcaC1 = c1.getMarca();
        String modeloC1 = c1.getModelo();
        String corC1 = c1.getCor();
        int cordaC1 = c1.getCorda();




        //Criando Bateria
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

    }

}



