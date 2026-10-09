public class ex05 {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        int indice = -1;

        for (int i = 0; i < 15; i++) {
            numeros[i] = (int)(Math.random() * 50) + 1;
            System.out.print(numeros[i] + " ");

            if (numeros[i] == 20 && indice == -1) {
                indice = i;
            }
        }

        if (indice != -1) {
            System.out.println("\nO numero 20 esta no indice: " + indice);
        } else {
            System.out.println("\nO numero 20 nao existe no vetor.");
        }
    }
}