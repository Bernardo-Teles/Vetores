import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero para A:");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero para B:");
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            C[i * 2] = A[i];
            C[i * 2 + 1] = B[i];
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(C[i] + " ");
        }
        scanner.close();
    }
}