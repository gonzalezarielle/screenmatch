import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
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
    }
}
