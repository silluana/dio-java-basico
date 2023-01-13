import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int numero = 0; 
        int maiorNumero = 0;
        int soma = 0;
        int count = 0;

        while (count < 5) {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            
            if (numero > maiorNumero) maiorNumero = numero;

            soma = soma + numero;

            count++;
        }

        System.out.println("Maior número: "+maiorNumero);
        System.out.println("Média dos números: "+ (soma/5));
    }
}
