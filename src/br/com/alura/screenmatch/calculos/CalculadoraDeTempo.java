package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

  /* public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s){
        tempoTotal += f.getDuracaoEmMinutos();
    }*/

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
