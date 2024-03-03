<<<<<<< HEAD
// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos 
// (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever 
// um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor. 

import java.util.Scanner;

public class Tarefa2_LP1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double percentualImposto = 45 * 0.01;
        double percentualDistribuidor = 28 * 0.01;

        System.out.println("Calculo de preço de veículo.");
        System.out.println("Insira o preço de custo do veículo em R$: ");
        double precoFabrica = scanner.nextDouble();

        double imposto = precoFabrica * percentualImposto;
        double distribuidor = precoFabrica * percentualDistribuidor;
        double precoFinal = precoFabrica + imposto + distribuidor;

        String impostoFormatado = String.format("%.2f", imposto);
        String distribuidorFormatado = String.format("%.2f", distribuidor);
        String precoFinalFormatado = String.format("%.2f", precoFinal);


        System.out.println("O preço final do veículo é de: R$" + precoFinalFormatado);
        System.out.println("Imposto: R$" + impostoFormatado);
        System.out.println("Distribuição: R$" + distribuidorFormatado);

        scanner.close();
    }
}
=======
// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos 
// (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever 
// um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor. 

import java.util.Scanner;

public class Tarefa2_LP1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double percentualImposto = 45 * 0.01;
        double percentualDistribuidor = 28 * 0.01;

        System.out.println("Calculo de preço de veículo.");
        System.out.println("Insira o preço de custo do veículo em R$: ");
        double precoFabrica = scanner.nextDouble();

        double imposto = precoFabrica * percentualImposto;
        double distribuidor = precoFabrica * percentualDistribuidor;
        double precoFinal = precoFabrica + imposto + distribuidor;

        String impostoFormatado = String.format("%.2f", imposto);
        String distribuidorFormatado = String.format("%.2f", distribuidor);
        String precoFinalFormatado = String.format("%.2f", precoFinal);


        System.out.println("O preço final do veículo é de: R$" + precoFinalFormatado);
        System.out.println("Imposto: R$" + impostoFormatado);
        System.out.println("Distribuição: R$" + distribuidorFormatado);

        scanner.close();
    }
}
>>>>>>> c416a95f5c6fc40119344510b62e990e4c2549a8
