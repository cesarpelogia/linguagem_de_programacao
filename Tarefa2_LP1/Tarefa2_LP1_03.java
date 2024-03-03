// Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Scanner;

public class Tarefa2_LP1_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de novo salário:");
        System.out.println("Insira o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Insira o percentural de reajuste: ");
        double pecentualDeAumento = scanner.nextDouble();

        double novoSalario = salarioAtual + (salarioAtual * (pecentualDeAumento * 0.01));

        System.out.println("O salário reajustado é de: R$" + novoSalario);

        scanner.close();
    }
}
