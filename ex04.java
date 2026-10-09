public class ex04 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        boolean existe = false;

        for (int i = 0; i < 20; i++) {
            numeros[i] = (int)(Math.random() * 30) + 1;
            System.out.print(numeros[i] + " ");

            if (numeros[i] == 25) {
                existe = true;
            }
        }

        if (existe) {
            System.out.println("\nO numero 25 existe no vetor.");
        } else {
            System.out.println("\nO numero 25 nao existe no vetor.");
        }
    }
}