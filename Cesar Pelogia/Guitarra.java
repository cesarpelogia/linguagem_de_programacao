public class Guitarra {

    // Atributos
    private String modelo;
    private String cor;
    private double peso;
    private String marca;

    // Metodos
    public void getMarca(){
        System.out.println("Essa guitarra é uma " + marca + "!");
    }
    public String setCor(){
        return cor;
    }
    public double getPeso(){
        System.out.println("Essa guitarra pesa: " + peso + "Kgs.");
    }
    public String getModelo(){
        return("Modelo" + modelo);
    }
}
