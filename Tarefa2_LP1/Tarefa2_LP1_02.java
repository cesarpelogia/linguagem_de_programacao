<<<<<<< HEAD
// Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. 
// Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

import java.util.Scanner;

public class Tarefa2_LP1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número total de eleitores: ");
        int eleitores = scanner.nextIngit push

        System.out.println("Insira o número total votos em branco: ");
        int votoBranco = scanner.nextInt();

        System.out.println("Insira o número total de votos nulos: ");
        int votoNulo = scanner.nextInt();

        System.out.println("Insira o número total de votos válidos: ");
        int votoValido = scanner.nextInt();

        System.out.println("Total de eleitores: " + eleitores);

        double percentualVotoBranco = (votoBranco * 100) / eleitores;
        System.out.println("Percentual de votos em branco: " + percentualVotoBranco + "%");

        double percentualVotoNulo = (votoNulo * 100) / eleitores;
        System.out.println("Percentual de votos em nulo: " + percentualVotoNulo + "%");

        double percentualVotoValido = (votoValido * 100) / eleitores;
        System.out.println("Percentual de votos em válido: " + percentualVotoValido + "%");

        scanner.close();
    }
}
=======
// Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. 
// Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

import java.util.Scanner;

public class Tarefa2_LP1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número total de eleitores: ");
        int eleitores = scanner.nextInt();

        System.out.println("Insira o número total votos em branco: ");
        int votoBranco = scanner.nextInt();

        System.out.println("Insira o número total de votos nulos: ");
        int votoNulo = scanner.nextInt();

        System.out.println("Total de eleitores: " + eleitores);

        double percentualVotoBranco = (votoBranco * 100) / eleitores;
        System.out.println("Percentual de votos em branco: " + percentualVotoBranco);

        double percentualVotoNulo = (votoNulo * 100) / eleitores;
        System.out.println("Percentual de votos em nulo: " + percentualVotoNulo);

        int percentualVotoValido = eleitores - votoBranco - votoNulo;
        System.out.println("Percentual de votos em válido: " + percentualVotoValido);

        scanner.close();
    }
}
>>>>>>> c416a95f5c6fc40119344510b62e990e4c2549a8
