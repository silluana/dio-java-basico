package dio.collection.set;

import java.util.Comparator;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.getNome().compareTo(o.getNome());
    } 
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIde().compareTo(lf2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int ano = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return lf1.getNome().compareTo(lf2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.getNome().compareTo(lf2.getNome());
        if (nome != 0) return nome;

        int ano = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return lf1.getIde().compareTo(lf2.getIde());
    }
}