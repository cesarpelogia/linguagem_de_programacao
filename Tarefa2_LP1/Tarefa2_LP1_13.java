<<<<<<< HEAD
// Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. 

import java.util.Scanner;

public class Tarefa2_LP1_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escrevendo valores em ordem crescente:");

        System.out.println("Escreva o primeiro valor: ");
        double priValor = scanner.nextDouble();

        System.out.println("Escreva o segundo valor: ");
        double segValor = scanner.nextDouble();

        if (priValor > segValor){
            System.out.println("A ordem crescente é: " + priValor + ", " + segValor + ".");
        } else{
            System.out.println("A ordem crescente é: " + segValor + ", " + priValor + ".");
        }
        scanner.close();
    }
}
=======
// Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. 

import java.util.Scanner;

public class Tarefa2_LP1_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escrevendo valores em ordem crescente:");

        System.out.println("Escreva o primeiro valor: ");
        double priValor = scanner.nextDouble();

        System.out.println("Escreva o segundo valor: ");
        double segValor = scanner.nextDouble();

        if (priValor > segValor){
            System.out.println("A ordem crescente é: " + priValor + ", " + segValor + ".");
        } else{
            System.out.println("A ordem crescente é: " + segValor + ", " + priValor + ".");
        }
        scanner.close();
    }
}
>>>>>>> c416a95f5c6fc40119344510b62e990e4c2549a8
