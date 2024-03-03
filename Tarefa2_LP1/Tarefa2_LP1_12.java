<<<<<<< HEAD
// Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. 

import java.util.Scanner;
public class Tarefa2_LP1_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Descobrir qual valor é maior.");
        System.out.println("Insira o primeiro valor: ");
        double primValor = scanner.nextDouble();

        System.out.println("Insira o segundo valor: ");
        double segValor = scanner.nextDouble();

        if (primValor > segValor){
            System.out.println(" O valor " + primValor + " é maior!");
        } else{
            System.out.println("O valor " + segValor + " é maior!");
        }
        scanner.close();
    }
}