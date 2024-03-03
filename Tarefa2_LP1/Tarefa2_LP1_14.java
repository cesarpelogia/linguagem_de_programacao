// Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos)
// e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que 
// o jogo pode iniciar em um dia e terminar no dia seguinte.

import java.util.Scanner;

public class Tarefa2_LP1_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas horas durou esse jogo de Xadrez?");

        System.out.println("Insira o dia de início: ");
        int diaInicio = scanner.nextInt();

        System.out.println("Insira a hora de início: ");
        int horaInicio = scanner.nextInt();

        System.out.println("Insira o dia que foi finalizado: ");
        int diaTermino = scanner.nextInt();

        System.out.println("Insira a hora que foi finalizado: ");
        int horaTermino = scanner.nextInt();

        if (diaInicio != diaTermino){
            int totalDiaDif = (24 - horaInicio) + horaTermino;
            System.out.println("O jogo durou: " + totalDiaDif + " horas.");
        } else{
            int totalDiaIgual = horaTermino - horaInicio;
            System.out.println("O jogo durou: " + totalDiaIgual + " horas.");
        }

        scanner.close();
    }
}
