package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme favorito = new Filme("The Matrix", 1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(7);

        System.out.println("Média de avaliação do filme: " +favorito.pegaMedia());
        System.out.println("Total de avaliações: " + favorito.getTotalDeAvaliacoes());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(06);
        lost.setEpisodiosPorTemporada(22);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmeDoPaulo);
        listaDeFilme.add(favorito);
        System.out.println("Tamanho da lista " + listaDeFilme.size());
        System.out.println("Primeiro filme é " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);
        System.out.println("toString do filme " + listaDeFilme.get(0).toString());
    }
}
