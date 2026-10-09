import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de etapas:");
        int etapas = scanner.nextInt();

        int tempoPorEtapa = 1;
        int tempoTotal = etapas * tempoPorEtapa;

        System.out.println("Tempo total de producao: " + tempoTotal);
        scanner.close();
    }
}