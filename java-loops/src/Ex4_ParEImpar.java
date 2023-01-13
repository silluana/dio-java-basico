import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class  Ex4_ParEImpar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de repetições: ");
        int quantRepeticoes = scanner.nextInt();
        
        int numero = 0, quantPares = 0, quantImpares = 0;
        int count = 0;

        do {
            System.out.println("Digite o número: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                quantPares++;
            } else {
                quantImpares++;
            }

            count++;
        } while (count < quantRepeticoes);

        System.out.println("Total de números pares: " + quantPares);
        System.out.println("Total de números ímpares: " + quantImpares);
    }
}
