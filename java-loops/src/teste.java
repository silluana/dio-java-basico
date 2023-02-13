import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Velocidade: ");
        int velocidadeAtual = leitor.nextInt();
        int velocidadePermitida = 60;

        if (velocidadeAtual > velocidadePermitida) {
            System.out.println("Foi multado");
        } else {
            System.out.println("Nao foi multado");
        }

    } 
}
