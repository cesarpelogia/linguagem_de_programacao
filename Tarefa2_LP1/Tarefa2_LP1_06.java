// Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius.
// Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F


import java.util.Scanner;

public class Tarefa2_LP1_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversão de temperaturas");
        System.out.println("Insira a temperatura em Fahrenheit: ");
        double tempF = scanner.nextDouble();

        double tempC = (tempF - 32) / 1.8;

        System.out.println("A temperatura " + tempF + "° Fahrenheit equivale a " + tempC + "° Celsius");

        scanner.close();
    }
    
}
