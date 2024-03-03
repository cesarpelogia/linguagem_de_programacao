// A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra,
// cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em 
//um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido 
// trabalhadas (considere que o mês possua 4 semanas exatas). 

import java.util.Scanner;

public class Tarefa2_LP1_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double jornadaSemanal = 40;
        double jornadaMensal = jornadaSemanal * 4;


        System.out.println("Cálculo de horas extras.");

        System.out.println("Insira o valor da hora do funcionário: ");
        double custoHora = scanner.nextDouble();

        System.out.println("Quantas horas o funcionário trabalhou no mês?");
        double jornadaRealizada = scanner.nextDouble();

        double horaExtra = (jornadaRealizada - jornadaMensal) * 1.5;

        if (jornadaRealizada > jornadaMensal){
            double pagamHoraExtra = (jornadaMensal * custoHora) + (custoHora * horaExtra);
            System.out.println("O funcionário receberá, com hora extras, o valor de: R$" + pagamHoraExtra + ", sendo R$" + (jornadaMensal * custoHora) + " de salário normal e R$" + (horaExtra * custoHora) + " como horas extras.");
        } else{
            double pagamNormal = jornadaMensal * custoHora;
            System.out.println("O funcionário receberá R$" + pagamNormal + ", pois não houveram hora extras");
        }

        scanner.close();
    }
}
