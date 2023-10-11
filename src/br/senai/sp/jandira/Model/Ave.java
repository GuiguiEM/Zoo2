package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal{
    List<Ave> listAve = new ArrayList<>();
    public Ave(){
        super("ave");
    }
    public void adicionarAve(Ave ave){
        listAve.add(ave);
    }
    public void listarAve(){
        for (Ave ave : listAve){
            System.out.println("ID: " + ave.idAnimal);
            System.out.println("Nome: " + ave.nome);
            System.out.println("Idade: " + ave.idade);
            System.out.println("---------------------------");
        }
    }
    public void adicionarAve(Ave ave){
        listAve.add(ave);
    }
}
