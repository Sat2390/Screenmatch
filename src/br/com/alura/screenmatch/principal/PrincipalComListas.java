package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.Modelos.Filme;
import br.com.alura.screenmatch.Modelos.Serie;
import br.com.alura.screenmatch.Modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args){
        Filme meuFilme = new Filme("O Poderoso Chefão",1970);
        meuFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        Serie lost = new Serie("Lost", 2000);




        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item  instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificão " + filme.getClassificacao());
            }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
            buscaPorArtista.add("Adam Sandler");
            buscaPorArtista.add("Paulo");
            buscaPorArtista.add("Jacqueline");
            System.out.println(buscaPorArtista);

            Collections.sort(buscaPorArtista);
            System.out.println("Depois da ordenação");
            System.out.println(buscaPorArtista);


        }
        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano");
        System.out.println(lista);
    }
}
