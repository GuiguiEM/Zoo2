package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;

public class Felino extends Animal{
    List<Felino> listFelino = new ArrayList<>();
    public Felino(){
        super("felino");
    }
    public void adicionarFelino(Felino felino){
        listFelino.add(felino);
    }
    public void listarFelino(){
        for (Felino felino : listFelino){
            System.out.println("ID: " + felino.idAnimal);
            System.out.println("Nome: " + felino.nome);
            System.out.println("Idade: " + felino.idade);
            System.out.println("---------------------------");
        }
    }
}
