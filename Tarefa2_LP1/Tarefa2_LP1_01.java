// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
// Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class Tarefa2_LP1_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Vamos calcular quantos dias você já viveu!");
        System.out.println("Insira o dia do seu nascimento: ");
        int dia = scanner.nextInt();

        System.out.println("Insira o mês do seu nascimento: ");
        int mes = scanner.nextInt();

        System.out.println(("Insira o seu ano de nascimento: "));
        int ano = scanner.nextInt();

        int anoConvertido = (2024 - ano) * 365;
        int mesConvertido = mes * 30;

        int idadeEmDias = dia + mesConvertido + anoConvertido;

        System.out.printf("Sua idade em dias é de: " + idadeEmDias + " dias!");

        scanner.close();
    }
}
