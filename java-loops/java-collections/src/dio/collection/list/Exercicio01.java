package dio.collection.list;

import java.util.*;

/**
* Faça um programa que receba a temperatura média dos 6
* primeiros meses do ano e armazene-as em uma lista.
* Após isto, calcule a média semestral das temperaturas e
* mostre todas as temperaturas acima desta média, e em que
* mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
* – Fevereiro e etc). 
*/

public class Exercicio01 {
    public static void main(String[] args) {

        List<MesTemperatura> temperaturasSemestral = new ArrayList<>(){{
            add(new MesTemperatura(0, 20.5));
            add(new MesTemperatura(1, 21d));
            add(new MesTemperatura(2, 21.7));
            add(new MesTemperatura(3, 21.8));
            add(new MesTemperatura(4, 21.2));
            add(new MesTemperatura(5, 20.9));
        }};

        //exibindo todas as temperaturas:
        System.out.println("Todas as temperaturas: ");
        temperaturasSemestral.forEach(t -> System.out.println(t.toString() ));

        System.out.println("-----------------");

        //calcule a média semestral das temperaturas 
        Double somaTemperatura = 0d;
        Iterator<MesTemperatura> iterator1 = temperaturasSemestral.iterator();
        while(iterator1.hasNext()){
            MesTemperatura mes = iterator1.next();
            somaTemperatura += mes.getTemperatura();
        }

        Double mediaTempSemestral = somaTemperatura/6;

        System.out.println("Média das temperaturas: " + mediaTempSemestral);

        System.out.println("-----------------");

        //mostre todas as temperaturas acima desta média
        System.out.println("Todas as temperaturas acima da média: ");
        Iterator<MesTemperatura> iterator2 = temperaturasSemestral.iterator();
        while(iterator2.hasNext()){
            MesTemperatura mes = iterator2.next();
            if (mes.getTemperatura() > mediaTempSemestral) {
                System.out.println(mes.toString());
            } 
        }

    }    
}


class MesTemperatura {
    
    private Integer mes;
    private Double temperatura;

    public MesTemperatura(Integer mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;    
    }

    public int getMes() {
        return mes;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return mesExtenso(mes) + " " + temperatura;
    }

    public String mesExtenso(Integer mes) {
        String mesExtenso = "";
        switch (mes) {
            case (0):
                mesExtenso = "1 - janeiro:";
                break;
            case (1):
                mesExtenso = "2 - fevereiro: ";
                break;
            case (2):
                mesExtenso = "3 - março: ";
                break;
            case (3):
                mesExtenso = "4 - abril: ";
                break;
            case (4):
                mesExtenso = "5 - maio: ";
                break;
            case (5):
                mesExtenso = "6 - junho: ";
                break;
            default:
                mesExtenso = "Mês não encontrado";
        }

        return mesExtenso;
    }
}
