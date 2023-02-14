package dio.collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ExercicioProposto01 {

    public static void main(String[] args) {
        
        //Crie uma conjunto contendo as cores do arco-íris
        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("vermelho");
        arcoIris.add("laranja");
        arcoIris.add("amarelo");
        arcoIris.add("verde");
        arcoIris.add("azul");
        arcoIris.add("azul-escuro");
        arcoIris.add("violeta");

        //a) Exiba todas as cores o arco-íris uma abaixo da outra;
        System.out.println("Cores do Arco-íris: ");
        arcoIris.stream().forEach(cor -> System.out.println(cor));

        //b) A quantidade de cores que o arco-íris tem;
        System.out.println("\nA quantidade de cores do arco-íris: " + arcoIris.size());

        //c) Exiba as cores em ordem alfabética;
        System.out.println("\nCores do arco-íris na ordem alfabética: ");
        Set<String> arcoIrisOrdemAlfabetica = new TreeSet<>(arcoIris);
        arcoIrisOrdemAlfabetica.stream().forEach(cor -> System.out.println(cor));
        
        //d) Exiba as cores na ordem inversa da que foi informada;
        System.out.println("\nExiba as cores do arco-íris na ordem inversa que foram informadas: "); 
        Set<String> arcoIrisOrdemAInversa = new LinkedHashSet<>(
            Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "azul-escuro", "violeta"));

        List<String> arcoIrisOrdemAInversaList = new ArrayList<>(arcoIrisOrdemAInversa);
        Collections.reverse(arcoIrisOrdemAInversaList);
        System.out.println(arcoIrisOrdemAInversaList);

        //e) Exiba todas as cores que começam com a letra ”v”;
        System.out.println("\nCores do arco-íris que começam com a letra 'v': "); 
        for (String cor : arcoIrisOrdemAlfabetica) {
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }
        }

        //f) Remova todas as cores que não começam com a letra “v”;
        System.out.println("\nRemovida todas as cores do arco-íris que não começam com a letra 'v': "); 
        Iterator iterator1 = arcoIrisOrdemAlfabetica.iterator();
        while(iterator1.hasNext()) {
            String cor = (String) iterator1.next();
            //if (!cor.subSequence(0, 1).equals("v")) {
            if (!cor.startsWith("v")) {    
                iterator1.remove();
            }            
        }
        System.out.println(arcoIrisOrdemAlfabetica);

        //g) Limpe o conjunto;
        arcoIrisOrdemAlfabetica.clear();

        //h) Confira se o conjunto está vazio;
        System.out.println("\nO conjunto de Cores do Arco-íris está vazio: " + arcoIrisOrdemAlfabetica.isEmpty());
    }
    
}
