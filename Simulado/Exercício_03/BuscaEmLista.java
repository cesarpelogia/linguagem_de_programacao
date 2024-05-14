import java.util.Scanner;

public class BuscaEmLista {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int[] lista = new int[10];

            int i;
            int item;
            int achou;

            // Preenche a lista
            for (i = 0; i < 10; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                lista[i] = scanner.nextInt();
            }

            System.out.print("Digite o item a ser procurado: ");
            item = scanner.nextInt();

            i = 0;
            achou = 0;

            // Procura na lista
            while (i < 10 && achou == 0) {
                if (lista[i] == item) {
                    achou = 1;
                }
                i++;
            }

            // Saída
            if (achou == 1) {
                System.out.println(item + " encontrado na posição " + (i - 1));
            } else {
                System.out.println(item + " não encontrado na lista");
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
