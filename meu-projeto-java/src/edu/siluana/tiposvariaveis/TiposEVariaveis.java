package edu.siluana.tiposvariaveis;

public class TiposEVariaveis {
    public static void main(String[] args) {
        System.out.println("Tipos de Variáveis!");

        //Primitive types
        //Os oito tipos primitivos em Java são:
        //int, byte, short, long, float, double, boolean e char
        //Eles são armazenados diretamente na pilha de memória. (Memory stack)

        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;

        /*Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F 
        e alguns cenários do dia-a-dia, podem estimular uma alteração de tipos de dados convencional. */

        //Atenção - Java é fortemente "tipado".

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        /*
         * Por mais que tenhamos ciência do valor quenumeroNormal cabe é um short, 
         * o Java não permite correr o risco.
         */

        /*
         * Constantes, são valores armazenados em memória que não podem ser modificados depois de declarados. 
         * Em Java, esses valores são representados pela palavra reservada final, seguida do tipo.
         * Por convenção, Constantes são sempre escritas em CAIXA ALTA.
         */

        /*
		 * esta linha é considerada como declaração de variável iniciamos a existência
		 * variavel numero com valor 5 regra: tipo + nome + valor
		 */
		int numero = 5;

		/*
		 * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
		 * não é mais necessário, pois a variável já foi declarada anteriormente
		 */
		numero = 10;

		System.out.print(numero);
		
		/*
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo a linha 25 vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */
		final double VALOR_DE_PI = 3.14;
		
		//VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!

    }
}
