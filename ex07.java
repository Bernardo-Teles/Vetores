import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero decimal:");
            numeros[i] = scanner.nextDouble();
        }

        double maior = numeros[0];
        double menor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        scanner.close();
    }
}