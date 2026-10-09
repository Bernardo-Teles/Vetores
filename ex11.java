import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a temperatura:");
            double temperatura = scanner.nextDouble();
            soma = soma + temperatura;
        }

        double media = soma / 10;

        System.out.println("Temperatura media: " + media);
        scanner.close();
    }
}