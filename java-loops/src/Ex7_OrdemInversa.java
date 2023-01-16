/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex7_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-1, -8, 10, 12, 28, 51};

        //Exibir o vetor na ordem crescente
        System.out.print("Vetor na ordem crescente: ");
        for(int i=0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        //Exibir o vetor na ordem inversa
        System.out.print("\nVetor na ordem inversa: ");
        for(int i=(vetor.length-1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
