// Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). 

import java.util.Scanner;

public class Tarefa2_LP1_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos verificar o seu número!");
        System.out.println("Insira o seu número: ");
        int verifNumero = scanner.nextInt();

        if (verifNumero >= 0){
            System.out.println("Seu número é positivo");
        } else {
            System.out.println("Seu número é negativo");
        }

        scanner.close();
    }
}
