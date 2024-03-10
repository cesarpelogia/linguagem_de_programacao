package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Guitarra c1 = new Guitarra();

        // Definindo valores usando set
        c1.setMarca("Gibson");
        c1.setModelo("Les Paul");
        c1.setCor("Sunbusrt");
        c1.setCorda(6);

        // Obtendo valores usando get
        String marcaC1 = c1.getMarca();
        String modeloC1 = c1.getModelo();
        String corC1 = c1.getCor();
        int cordaC1 = c1.getCorda();

        System.out.println("Essa guitarra é uma " + marcaC1 + " " + modeloC1 + ", na cor " + corC1 + " de " + cordaC1 + " cordas.");


        c1.aumentarVolume(70);
        c1.abaixarVolume(30);
        c1.aumentarTon(20);
        c1.diminuirTon(40);
        c1.plugarGuitarra(false);
        c1.desplugarGuitarra(false);
        c1.qntdCorda(6);

    }
}


