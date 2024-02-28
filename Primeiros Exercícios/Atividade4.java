public class Atividade4 {
    public static void main(String[] args) {

        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;

        int totalDespesas = gastoJaneiro + gastoFevereiro + gastoMarco;

        int mediaDespesas = (gastoJaneiro + gastoFevereiro + gastoMarco)/3;

        System.out.println("Gastos Janeiro = R$" + gastoJaneiro);
        System.out.println("Gastos Fevereiro = R$" + gastoFevereiro);
        System.out.println("Gastos Março = R$" + gastoMarco +"\n");

        
        System.out.println("Despesa total do trimestre: R$" + totalDespesas );
        System.out.println("Media de despesas do trimestre: R$" + mediaDespesas);
        
    }

}
