package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;

public class Alojamento {
    List<Mamifero> alojamentoMamifero = new ArrayList<>();
    List<Alojamento> alojamentoFelino = new ArrayList<>();
    List<Alojamento> alojamentoAve = new ArrayList<>();

    public void adicionarAveAlojamento(Ave ave){
        alojamentoAve.add(ave);
    }
    public void adicionarMamiferoAlojamento(Mamifero mamifero){
        alojamentoMamifero.add(mamifero);
    }
    public void adicionarFelinoAlojamento(Felino felino){
        alojamentoFelino.add(felino);
    }
}
