<<<<<<< HEAD
// As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze.
//  Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. 

import java.util.Scanner;

public class Tarefa2_LP1_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a loja de maçãs!");
        System.out.println("Insira quantas você gostaria de comprar: ");
        int qntdMaca = scanner.nextInt();

        if (qntdMaca >= 12){
            double maisDuzia = qntdMaca;
            String maisDuziaFormatado = String.format("%.2f", maisDuzia);
            System.out.println("Você pagará R$" + maisDuziaFormatado + " por " + qntdMaca + " maçãs.");
        } else{
            double menosDuzia = qntdMaca * 1.3;
            String menosDuziaFormatado = String.format("%.2f", menosDuzia);
            System.out.println("Você pagará R$" + menosDuziaFormatado + " por " + qntdMaca + " maçãs.");
        }
        scanner.close();
    }
}
=======
// As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze.
//  Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. 

import java.util.Scanner;

public class Tarefa2_LP1_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a loja de maçãs!");
        System.out.println("Insira quantas você gostaria de comprar: ");
        int qntdMaca = scanner.nextInt();

        if (qntdMaca >= 12){
            double maisDuzia = qntdMaca;
            String maisDuziaFormatado = String.format("%.2f", maisDuzia);
            System.out.println("Você pagará R$" + maisDuziaFormatado + " por " + qntdMaca + " maçãs.");
        } else{
            double menosDuzia = qntdMaca * 1.3;
            String menosDuziaFormatado = String.format("%.2f", menosDuzia);
            System.out.println("Você pagará R$" + menosDuziaFormatado + " por " + qntdMaca + " maçãs.");
        }
        scanner.close();
    }
}
>>>>>>> c416a95f5c6fc40119344510b62e990e4c2549a8
