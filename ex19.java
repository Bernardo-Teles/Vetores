import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] codigos = {101, 205, 310, 415, 520};

        System.out.println("Digite o codigo do produto:");
        int codigo = scanner.nextInt();

        boolean existe = false;

        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                existe = true;
            }
        }

        if (existe) {
            System.out.println("Codigo encontrado.");
        } else {
            System.out.println("Codigo nao encontrado.");
        }
        scanner.close();
    }
}