<<<<<<< HEAD
// Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10! 

import java.util.Scanner;

public class Tarefa2_LP1_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos verificar seu número!");
        System.out.println("Insira um número: ");
        int verifNumero = scanner.nextInt();

        if (verifNumero > 10){
            System.out.println("É MAIOR QUE 10!");
        } else if (verifNumero < 10) {
            System.out.println("NÃO É MAIOR QUE 10!");
        } else {
            System.out.println("Seu número é 10!");
        }

        scanner.close();
    }
}
=======
// Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10! 

import java.util.Scanner;

public class Tarefa2_LP1_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos verificar seu número!");
        System.out.println("Insira um número: ");
        int verifNumero = scanner.nextInt();

        if (verifNumero > 10){
            System.out.println("É MAIOR QUE 10!");
        } else if (verifNumero < 10) {
            System.out.println("NÃO É MAIOR QUE 10!");
        } else {
            System.out.println("Seu número é 10!");
        }

        scanner.close();
    }
}
>>>>>>> c416a95f5c6fc40119344510b62e990e4c2549a8
