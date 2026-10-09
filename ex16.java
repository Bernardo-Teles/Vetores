import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] respostas = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma resposta:");
            respostas[i] = scanner.nextInt();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.println(respostas[i]);
        }
        scanner.close();
    }
}