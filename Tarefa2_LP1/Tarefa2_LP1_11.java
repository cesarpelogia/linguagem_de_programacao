// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá
// ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

import java.util.Scanner;

public class Tarefa2_LP1_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificação de idade mínima para voto.");
        System.out.println("Insira o seu ano do seu nascimento: ");
        int anoNasc = scanner.nextInt();

        System.out.println("Insira em que ano estamos: ");
        int anoAtual = scanner.nextInt();

        if ((anoAtual - anoNasc) < 16){
            System.out.println("Você ainda não está apto a votar.");
        }else{
            System.out.println("Você está apto a votar! Procurei a Justiça Eleitoral e tire seu título!");
        }
    }
}
