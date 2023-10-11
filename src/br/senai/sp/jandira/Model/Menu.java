package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    Ave refAve = new Ave();
    Alojamento alojamento = new Alojamento();

    public void executarMenu() {

        boolean continuar = true;
        while (continuar) {
            System.out.println("---------- Menu ----------");
            System.out.println("1 -> Cadastrar Animal: ");
            System.out.println("2 -> Listar Animais: ");
            System.out.println("3 -> Cadastrar informações de Saude: ");
            System.out.println("4 -> Pesquisar Animal: ");
            System.out.println("5 -> Pesquisar Animal: ");
            System.out.println("---------------------------");

            System.out.println("Escolha uma opção: ");
            int optionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (optionMenu) {
                case 1:
                    System.out.println("1 - Mamifero");
                    System.out.println("2 - Ave");
                    System.out.println("3 - Felino");
                    System.out.println("Escolha qual deseja cadastrar");

                    int optionCadastro = scanner.nextInt();
                    scanner.nextLine();

                    switch (optionCadastro) {
                        case 1:
                            Mamifero mamifero = new Mamifero();
                            mamifero.cadastrarAnimal();
                            refMamifero.adicionarMamifero(mamifero);
                            alojamento.adicionarMamiferoAlojamento(mamifero);
                            break;
                        case 2:
                            Ave ave = new Ave();
                            ave.cadastrarAnimal();
                            refAve.adicionarAve(ave);
                            alojamento.adicionarAveAlojamento(ave);
                            break;
                        case 3:
                            Ave ave = new Ave();
                            ave.cadastrarAnimal();
                            refAve.adicionarAve(ave);
                            alojamento.adicionarAveAlojamento(ave);
                            break;
                        case 4:

                            break;
                        default:
                            System.out.println();
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
    }
}
