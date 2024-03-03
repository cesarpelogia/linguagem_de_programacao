// Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que 
// diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada. 

import java.util.Arrays;
import java.util.Scanner;

public class Tarefa2_LP1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double primNota = scanner.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double segNota = scanner.nextDouble();

        double mediaArit = (primNota + segNota) / 2;

        if (mediaArit >= 6){
            System.out.println("Aprovado! A média foi de: " + mediaArit + ".");
        } else {
            System.out.println("Reprovado! A média foi inferior a 6.");
        }
        scanner.close();
    }
}
