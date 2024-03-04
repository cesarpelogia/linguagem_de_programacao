import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a nota do Exercício 1 \n");
        int exercício1 = scanner.nextInt();

        System.out.println("Insira a nota do Exercício 2 \n");
        int exercício2 = scanner.nextInt();

        System.out.println("Insira a nota da Prova 1: \n");
        int prova1 = scanner.nextInt();

        System.out.println("Insira a nota da API: \n");
        int API = scanner.nextInt();

        System.out.println("Insira a nota da Atividade Extra: \n");
        int atvext = scanner.nextInt();

        System.out.println("Insira a nota da prova substitutiva: \n");
        int subs = scanner.nextInt();
    }
}
