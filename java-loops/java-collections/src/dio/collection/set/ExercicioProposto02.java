package dio.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class ExercicioProposto02 {

    public static void main(String[] args) {

        System.out.println("-- Ordem aleatória");
        Set<LinguagemFavorita> liguagensFavoritas = new HashSet<>(){{
            add(new LinguagemFavorita("Java", 1991, "Eclipse"));
            add(new LinguagemFavorita("C#", 1999, "Visual Studio"));
            add(new LinguagemFavorita("Kotlin", 2010, "IntelliJ IDEA"));
        }};
        for (LinguagemFavorita linguagemFavorita: liguagensFavoritas) System.out.println(linguagemFavorita.getNome() + " - "
                + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde()); 
                
        //a) Ordem de inserção;
        System.out.println("\n-- Ordem inserção");
        Set<LinguagemFavorita> liguagensFavoritas1 = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Java", 1991, "Eclipse"));
            add(new LinguagemFavorita("C#", 1999, "Visual Studio"));
            add(new LinguagemFavorita("Kotlin", 2010, "IntelliJ IDEA"));
        }};
        for (LinguagemFavorita linguagemFavorita: liguagensFavoritas1) System.out.println(linguagemFavorita.getNome() + " - "
                + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde()); 

        //b) Ordem natural(nome);
        System.out.println("\n-- Ordem natural(nome)");
        Set<LinguagemFavorita> linguagemFavoritas2 = new TreeSet<>(liguagensFavoritas1);
        for (LinguagemFavorita linguagemFavorita: linguagemFavoritas2) System.out.println(linguagemFavorita.getNome() + " - "
                + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde()); 
    
        //Ordem de IDE
        System.out.println("\n-- Ordem por IDE");
        Set<LinguagemFavorita> linguagemOrderIDE = new TreeSet<>(new ComparatorIDE());
        linguagemOrderIDE.addAll(linguagemFavoritas2);
        for (LinguagemFavorita linguagemFavorita: linguagemOrderIDE) System.out.println(linguagemFavorita.getNome() + " - "
                + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde()); 

        //d) Ano de criação e nome;
        System.out.println("\n-- Ordem por ano de criação e nome");
        Set<LinguagemFavorita> linguagemOrderAnoNome = new TreeSet<>(new ComparatorAnoNome());
        linguagemOrderAnoNome.addAll(linguagemFavoritas2);
        for (LinguagemFavorita linguagemFavorita: linguagemOrderAnoNome) System.out.println(linguagemFavorita.getNome() + " - "
                + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde()); 
        
        //e) Nome, ano de criação e IDE;
        System.out.println("\n-- Ordem por nome, ano de criação e IDE");
        Set<LinguagemFavorita> linguagemOrderNomeAnoIde = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagemOrderNomeAnoIde.addAll(linguagemFavoritas2);
        for (LinguagemFavorita linguagemFavorita: linguagemOrderNomeAnoIde) System.out.println(linguagemFavorita.getNome() + " - "
                + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());    
    }

    
    
}
