import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Digite uma temperatura:");
            temperaturas[i] = scanner.nextDouble();
        }

        double maior = temperaturas[0];

        for (int i = 1; i < 8; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }

        System.out.println("Maior temperatura: " + maior);
        scanner.close();
    }
}