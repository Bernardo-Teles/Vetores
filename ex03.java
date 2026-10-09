public class ex03 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            numeros[i] = (int)(Math.random() * 100) + 1;
            System.out.println(numeros[i]);
            soma = soma + numeros[i];
        }

        double media = soma / 10.0;

        System.out.println("Media: " + media);
    }
}