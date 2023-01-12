package edu.siluana.javabasico;

import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        
        /*
         * Operadores
         * Símbolos especiais, que tem um significado próprio para a linguagem e estão associados 
         * a determinadas operações.
         */


    }

    public void operadorAtribuicao() {
        /*
          * Atribuição
          * Representado pelo símbolo de igualdade "=".
          * Exemplo abaixo:
          */

          String nome = "GLEYSON";
          int idade = 22;
          double peso = 68.5;
          char sexo = 'M';
          boolean doadorOrgao = false;
          Date dataNascimento = new Date();
    }

    public void operadoresAritmetico() {
        /*
         * Aritméticos
         * Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).
         */

         double soma = 10.5 + 15.7;
         int subtração = 113 - 25;
         int multiplicacao = 20 * 7;
         int divisao = 15 / 3;
         int modulo = 18 % 3;
         double resultado = (10 * 7) + (20/4);
    }

    public void operadorAdicaoCocatenacao() {
        /*
         * ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto,
         *  realizará a “concatenação de textos”.
         */

         String nomeCompleto = "LINGUAGEM" + "JAVA";

         System.out.println(nomeCompleto);
                
         //qual o resultado das expressoes abaixo?
         String concatenacao ="?"; 
 
         concatenacao = 1+1+1+"1";
 
         System.out.println(concatenacao); //31
 
         concatenacao = 1+"1"+1+1;
 
         System.out.println(concatenacao); //1111
 
         concatenacao = 1+"1"+1+"1";
 
         System.out.println(concatenacao); //1111
 
         concatenacao = "1"+1+1+1;
 
         System.out.println(concatenacao); //1111
 
         concatenacao = "1"+(1+1+1); 
 
         System.out.println(concatenacao); //13
    }

    public void operadorUnario() {
        /*
         * Esses operadores, são aplicados juntamente com um outro operador aritmético. 
         * Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter 
         * valores numéricos e booleanos.
         */

        int numero = 5;
    
        //Imprimindo o numero negativo
        System.out.println(- numero);
        
        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);
        
        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo
        
        System.out.println(numero);// agora sim, numero virou 7
        
        //ordem de precedencia conta aqui
        System.out.println(++ numero);
        
        boolean verdadeiro = true;
        
        System.out.println("Inverteu " + !verdadeiro);

        /*
         * Atenção
         * Muito cuidado com ordem de precedência, dos operadores unários!
         */
    }
}
