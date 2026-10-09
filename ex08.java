public class ex08 {
    public static void main(String[] args) {
        int[] A = new int[15];
        int[] B = new int[15];

        for (int i = 0; i < 15; i++) {
            A[i] = (int)(Math.random() * 100) + 1;
        }

        for (int i = 0; i < 15; i++) {
            B[i] = A[14 - i];
        }

        System.out.println("Vetor A:");
        for (int i = 0; i < 15; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nVetor B invertido:");
        for (int i = 0; i < 15; i++) {
            System.out.print(B[i] + " ");
        }
    }
}