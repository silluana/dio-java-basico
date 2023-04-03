package dio.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265

 - Crie um dicionário e relacione os estados e suas populações;
 - Substitua a população do estado do RN por 3.534.165;
 - Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
 - Exiba a população PE;
 - Exiba todos os estados e suas populações na ordem que foi informado;
 - Exiba os estados e suas populações em ordem alfabética;
 - Exiba o estado com o menor população e sua quantidade;
 - Exiba o estado com a maior população e sua quantidade;
 - Exiba a soma da população desses estados;
 - Exiba a média da população deste dicionário de estados;
 - Remova os estados com a população menor que 4.000.000;
 - Apague o dicionário de estados;
 - Confira se o dicionário está vazio.
 */

public class Exercicio01 {

    public static void main(String[] args) {

        //Crie um dicionário e relacione os estados e suas populações;
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados);

        //Substitua a população do estado do RN por 3.534.165;
        estados.put("RN", 3534165);

        //Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
        if(!estados.containsKey("PB")) {
            estados.put("PB", 4039277);
        } 
        System.out.println(estados);

        //Exiba a população PE;
        System.out.println("\nExiba a população de PE: " + estados.get("PE"));

        //Exiba todos os estados e suas populações na ordem que foi informado;
        Map<String, Integer> estados2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado\n" + estados2);

        //Exiba os estados e suas populações em ordem alfabética;
        Map<String, Integer> estados3 = new TreeMap<>();
        estados3.putAll(estados2);
        System.out.println("\nExiba os estados e suas populações em ordem alfabética:\n" + estados3);

        //Exiba o estado com o menor população e sua quantidade;
        //Exiba o estado com a maior população e sua quantidade;
        Collection<Integer> populacao = estados.values();
        String menorPopulacao = "";
        String maiorPopulacao = "";
        for (Map.Entry<String, Integer> entry : estados.entrySet()) {
            if (entry.getValue().equals(Collections.min(populacao))){
                menorPopulacao = entry.getKey();
            }
            if (entry.getValue().equals(Collections.max(populacao))){
                maiorPopulacao = entry.getKey();
            }
        }
        System.out.printf("\nEstado com a MENOR população: %s - %d\n", menorPopulacao, Collections.min(populacao));
        System.out.printf("\nEstado com a MAIOR população: %s - %d\n", maiorPopulacao, Collections.max(populacao));

        //Exiba a soma da população desses estados;
        Integer somaPopupacao = 0;
        for (Integer quantPopulacao : populacao) {
            somaPopupacao += quantPopulacao;
        }
        System.out.println("\nExiba a soma da população desses estados: " + somaPopupacao);

        //Exiba a média da população deste dicionário de estados;
        System.out.println("\nExiba a média da população deste dicionário de estados: " + somaPopupacao/estados.size());

        //Remova os estados com a população menor que 4.000.000;
        Iterator<Integer> iterator = estados.values().iterator();
        while(iterator.hasNext()){
            if(iterator.next().compareTo(4000000) < 0){
                iterator.remove();
            } 
        }
        System.out.println("\n"+estados);

        //- Apague o dicionário de estados;
        //- Confira se o dicionário está vazio.
        estados.clear();
        System.out.println("\nO dicionário de estado está vazio: " + estados.isEmpty());
    }
    
}
