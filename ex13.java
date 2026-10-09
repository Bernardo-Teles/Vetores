import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int N = scanner.nextInt();

        for (int numero = 2; numero <= N; numero++) {
            int divisores = 0;

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println(numero);
            }
        }
        scanner.close();
    }
}