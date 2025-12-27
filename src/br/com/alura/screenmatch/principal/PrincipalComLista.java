package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class PrincipalComLista {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);

        Filme outroFilme = new Filme("Avatar",2023);

        var filmedoFabio = new Filme("Fabio no Quebec",1983);

        Serie lost = new Serie("Lost",2000);

        //Lista
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmedoFabio);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(lost);

        for (Titulo item : lista){
            if(item instanceof  Filme filme){
                System.out.println("Classificacao "+ filme.getClassificacao());
            }

        }



    }
}
