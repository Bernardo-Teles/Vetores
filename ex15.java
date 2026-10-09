import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos termos deseja mostrar?");
        int N = scanner.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
        }
        scanner.close();
    }
}