// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão
// também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que 
// leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe
//  por carro vendido. Calcule e escreva o salário final do vendedor.

import java.util.Scanner;

public class Tarefa2_LP1_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do salário fixo: R$");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Insira a quantidade de carros vendidos: ");
        int qntdVendida = scanner.nextInt();

        System.out.println("Insira o valor total das vendas do funcionário: R$");
        double totalVendas = scanner.nextDouble();

        System.out.println("Insira o valor unitário da comissão: R$");
        double comissao = scanner.nextInt();

        double totalComissao = qntdVendida * comissao;
        double porcentagemVenda = totalVendas * 0.05;

        double salarioFinal = salarioFixo + totalComissao + porcentagemVenda;

        String salarioFinalFomatado = String.format("%.2f", salarioFinal);
        System.out.println("O salário final do funcionário será de: R$" + salarioFinal);

        scanner.close();
    }
}
