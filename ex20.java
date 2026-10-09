import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precos = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o preco do produto:");
            precos[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (precos[j] > precos[j + 1]) {
                    double auxiliar = precos[j];
                    precos[j] = precos[j + 1];
                    precos[j + 1] = auxiliar;
                }
            }
        }

        System.out.println("Precos em ordem crescente:");

        for (int i = 0; i < 10; i++) {
            System.out.println(precos[i]);
        }
        scanner.close();
    }
}