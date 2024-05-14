package Exercício_04;

public class Main {

    public static void main(String[] args) {

        // Instanciando Avião Azul
        Aviao aviaoAzul = new Aviao();

        // Metodos de acesso
        aviaoAzul.setTipo("Comercial");
        aviaoAzul.setModelo("Boeing 737");
        aviaoAzul.setAno(2020);

        // Chamando Metodos
        aviaoAzul.decolar();
        aviaoAzul.virarADireita();
        aviaoAzul.virarAEsquerda();
        aviaoAzul.descer();

        // Instanciando Avião Verde
        Aviao aviaoVerde = new Aviao();

        // Metodos de acesso
        aviaoVerde.setTipo("Comercial");
        aviaoVerde.setModelo("Airbus A320");
        aviaoVerde.setAno(2018);

        // Chamando Metodos
        aviaoVerde.decolar();
        aviaoVerde.virarADireita();
        aviaoVerde.virarAEsquerda();
        aviaoVerde.descer();

        // Instanciando Avião Branco
        Aviao aviaoBranco = new Aviao();

        // Metodos de acesso
        aviaoBranco.setTipo("Comercial");
        aviaoBranco.setModelo("Boeing 747");
        aviaoBranco.setAno(2016);

        // Chamando Metodos
        aviaoBranco.decolar();
        aviaoBranco.virarADireita();
        aviaoBranco.virarAEsquerda();
        aviaoBranco.descer();
    }
}