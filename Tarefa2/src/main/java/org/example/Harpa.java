package org.example;

public class Harpa {

    private String marcaH;
    private String modeloH;
    private String corH;
    private int cordaH;

    boolean plug = false;

    // Métodos

    // Dedilhando Harpa
    public void dedilharHarpa(boolean dedilhandoHarpa) {
        System.out.println("ti li lim");
    }

    // Soando Harpa
    public void soarHarpa(boolean soandoHarpa) {
        System.out.println("tiiiliiinnnnnnn");
    }

    // Verificando se harpa está plugada
    public void plugarHarpa(boolean plugandoHarpa) {
        if (plugandoHarpa == plug) {
            System.out.println("Plugue a Harpa!");
        } else {
            System.out.println("A harpa está plugada!");
        }
    }

    // Verificando se a harpa está desplugada
    public void desplugarHarpa(boolean desplugandoHarpa) {
        if (desplugandoHarpa == plug) {
            System.out.println("A harpa já está desplugada");
        } else {
            System.out.println("Plugue a harpa");
        }
    }

    // Verificando quantidade de cordas
    public void qntdCordaH(int qtsCordas) {
        if (qtsCordas == 47) {
            System.out.println("Seja bem-vindo! Logo um vendedor te atenderá!");
        } else if (qtsCordas > 47) {
            System.out.println("Não possuímos harpas com mais de 47 cordas na loja");
        } else {
            System.out.println("Esse não temos.");
        }
    }

    // Métodos de Acesso Set:

    public String setMarcaH(String marcaH) {
        return marcaH = this.marcaH;
    }

    public String setModeloH(String modeloH) {
        return modeloH = this.modeloH;
    }

    public String setCorH(String corH) {
        return corH = this.corH;
    }

    public int setCordaH(int cordaH) {
        return cordaH = this.cordaH;
    }



    // Métodos de Acesso Get

    public String getMarcaH() {
        return this.marcaH;
    }

    public String getModeloH() {
        return this.modeloH;
    }

    public String getCorH() {
        return this.corH;
    }

    public int getCordaH() {
        return this.cordaH;
    }
}
