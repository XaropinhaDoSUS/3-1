import java.util.Scanner;

 class Conta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Insira 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Insira o número específico a ser contado:");
        int numeroEspecifico = scanner.nextInt();

        int contador = 0;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == numeroEspecifico) {
                contador++;
            }
        }

        System.out.println("O número" + numeroEspecifico + "aparece" + contador + "vezes");

        scanner.close();
    }
}
