import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int divisores = 0;

            for (int j = 1; j <= numeros[i]; j++) {
                if (numeros[i] % j == 0) {
                    divisores++;
                }
            }

            if (numeros[i] > 1 && divisores == 2) {
                System.out.println("Primo: " + numeros[i] + " - Posicao: " + i);
            }
        }
        scanner.close();
    }
}