package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal{
    List<Mamifero> listMamifero = new ArrayList<>();
    public Mamifero(){
        super("mamifero");
    }
    public void adicionarMamifero(Mamifero mamifero){
        listMamifero.add(mamifero);
    }
    public void listarMamifero(){
        for (Mamifero mamifero : listMamifero){
            System.out.println("ID: " + mamifero.idAnimal);
            System.out.println("Nome: " + mamifero.nome);
            System.out.println("Idade: " + mamifero.idade);
            System.out.println("---------------------------");
        }
    }
}
