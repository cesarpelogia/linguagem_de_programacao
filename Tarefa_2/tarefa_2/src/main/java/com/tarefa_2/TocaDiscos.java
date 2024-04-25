package com.tarefa_2;

public class TocaDiscos {

    private String marcaTD;
    private String modeloTD;
    private String corTD;
    private int discosTD;

    int volMin = 0;
    int volMax = 100;

    int volAtual = 0;

    boolean ligado = true;

    // Métodos

    // Aumentando Volume
    public void aumentarVolumeTD(int aumentandoVolumeTD) {
        int novoVol = volAtual + aumentandoVolumeTD;

        // Verifica se o novo volume não ultrapassa o máximo.
        if (novoVol >= volMin && novoVol <= volMax) {
            volAtual = novoVol;
            System.out.println("Volume aumentado para: " + volAtual);
        } else {
            System.out.println("Já está no volume máximo.");
        }
    }

    // Diminuindo Volume
    public void diminuirVolumeTD(int diminuindoVolumeTD) {
        int novoVol = volAtual - diminuindoVolumeTD;

        // Verifica se o novo volume não ultrapassa o mínimo.
        if (novoVol >= volMin && novoVol <= volMax) {
            volAtual = novoVol;
            System.out.println("Volume diminuído para: " + volAtual);
        } else {
            System.out.println("Já está no volume mínimo.");
        }
    }

    // Arranhando Toca Discos
    public void arranharTocaDiscos(boolean arranhndoTocaDiscos) {
        if (arranhndoTocaDiscos == ligado) {
            System.out.println("O Toca Discos já está ligado!");
        } else {
            ligado = true;
            System.out.println("O Toca Discos está ligado!");
        }
    }

    // Desligando Toca Discos
    public void desligarTocaDiscos(boolean desligandoTocaDiscos) {
        if (desligandoTocaDiscos == ligado) {
            System.out.println("O Toca Discos está desligado.");
        } else {
            System.out.println("O Toca Discos já está desligado.");
        }
    }

    // Conferindo quantidade de Discos
    public void trocarDisco(int novosDiscos) {
        discosTD = novosDiscos;
        System.out.println("Agora temos " + discosTD + " discos no Toca Discos.");
    }

    // Métodos de Acesso Set:

    public String setMarcaTD(String marcaTD) {
        return this.marcaTD = marcaTD;
    }

    public String setModeloTD(String modeloTD) {
        return this.modeloTD = modeloTD;
    }

    public String setCorTD(String corTD) {
        return this.corTD = corTD;
    }

    public int setDiscosTD(int discosTD) {
        return this.discosTD = discosTD;
    }

    // Métodos de Acesso Get

    public String getMarcaTD() {
        return this.marcaTD;
    }

    public String getModeloTD() {
        return this.modeloTD;
    }

    public String getCorTD() {
        return this.corTD;
    }

    public int getDiscosTD() {
        return this.discosTD;
    }
}
