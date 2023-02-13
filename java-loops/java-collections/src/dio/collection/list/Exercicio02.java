package dio.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/** Utilizando listas, faça um programa que faça 5 perguntas para uma
    pessoa sobre um crime. As perguntas são:
    "Telefonou para a vítima?"
    "Esteve no local do crime?"
    "Mora perto da vítima?"
    "Devia para a vítima?"
    "Já trabalhou com a vítima?"
    Se a pessoa responder positivamente a 2 questões ela deve ser
    classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
    "Assassina". Caso contrário, ela será classificado como "Inocente".
 */

public class Exercicio02 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        List<String> perguntas = new ArrayList<>(){{
            add("Telefonou para a vítima?");
            add("Esteve no local do crime?");
            add("Mora perto da vítima?");
            add("Devia para a vítima?");
            add("Já trabalhou com a vítima?");
        }};

        List<Boolean> respostas = new ArrayList<>();

        for (int i=0; i < perguntas.size(); i++) {

            System.out.println(perguntas.get(i) + " Digite S ou N");
            String resposta = scan.next();
            
            if (resposta.equalsIgnoreCase("s")) {
                respostas.add(true);
            } else {
                respostas.add(false);
            }
        } 

        int quantRespSim = 0;
        Iterator iterator1 = respostas.iterator();
        while(iterator1.hasNext()) {
            Boolean resposta = (Boolean) iterator1.next();
            if (resposta) {
                quantRespSim += 1;
            }
        }
        
        switch (quantRespSim) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
                System.out.println("Cúmplice");
                break;
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Inocente");
                break;
        }
    }
    
}
