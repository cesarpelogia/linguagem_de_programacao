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
        aviaoAzul.planar();
        aviaoAzul.pousar();
        aviaoAzul.voar();
        aviaoAzul.girar();

        // Instanciando Avião Verde
        Aviao aviaoVerde = new Aviao();

        // Metodos de acesso
        aviaoVerde.setTipo("Comercial");
        aviaoVerde.setModelo("Airbus A320");
        aviaoVerde.setAno(2018);

        // Chamando Metodos
        aviaoVerde.planar();
        aviaoVerde.pousar();
        aviaoVerde.voar();
        aviaoVerde.girar();

        // Instanciando Avião Branco
        Aviao aviaoBranco = new Aviao();

        // Metodos de acesso
        aviaoBranco.setTipo("Comercial");
        aviaoBranco.setModelo("Boeing 747");
        aviaoBranco.setAno(2016);

        // Chamando Metodos
        aviaoBranco.planar();
        aviaoBranco.pousar();
        aviaoBranco.voar();
        aviaoBranco.girar();
    }
}
