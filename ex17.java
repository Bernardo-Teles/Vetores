import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a nota do aluno:");
            notas[i] = scanner.nextDouble();
            soma = soma + notas[i];
        }

        double media = soma / 10;

        System.out.println("Media das notas: " + media);
        scanner.close();
    }
}