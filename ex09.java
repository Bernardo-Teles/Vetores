import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos recibos deseja imprimir?");
        int quantidade = scanner.nextInt();

        int numero = 1;

        while (numero <= quantidade) {
            System.out.println("Recibo " + numero);
            numero++;
        }
        scanner.close();
    }
}