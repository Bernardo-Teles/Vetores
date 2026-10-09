import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[30];

        for (int i = 0; i < 30; i++) {
            numeros[i] = (int)(Math.random() * 100) + 1;
        }

        System.out.println("Digite o valor que deseja remover:");
        int valor = scanner.nextInt();

        int quantidade = 0;

        for (int i = 0; i < 30; i++) {
            if (numeros[i] == valor) {
                quantidade++;
            }
        }

        int[] novoVetor = new int[30 - quantidade];
        int j = 0;

        for (int i = 0; i < 30; i++) {
            if (numeros[i] != valor) {
                novoVetor[j] = numeros[i];
                j++;
            }
        }

        System.out.println("Vetor original:");
        for (int i = 0; i < 30; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nVetor depois da remocao:");
        for (int i = 0; i < novoVetor.length; i++) {
            System.out.print(novoVetor[i] + " ");
        }
        scanner.close();
    }
}