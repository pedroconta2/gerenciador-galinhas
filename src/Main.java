import entities.GalinhaDaAngola;
import entities.GalinhaMacho;
import entities.GalinhaRobusta;
import entities.GalinhaShiny;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String controle = "";
        Celeiro celeiro = new Celeiro();

        Scanner scan = new Scanner(System.in);

        System.out.printf("Bem vindo ao celeiro\n");
        System.out.printf("Gerencie o celeiro\n");

        while (controle != "9") {

            System.out.println("1 - Adicionar Galinha");
            System.out.println("2 - Listar galinhas");
            System.out.println("3 - Cacarejar");
            System.out.println("4 - Botar ovos");
            System.out.println("5 - Listar ovos");
            System.out.println("6 - Descubra o Ranking de beleza das galinhas");
            System.out.println("9 - Sair");

            controle = scan.nextLine();

            switch (controle) {
                case "1":

                    System.out.println("Escreva o nome da galinha");
                    String nomeGalinha = scan.nextLine();

                    System.out.println("Escreva a idade da galinha");
                    int idadeGalinha = Integer.parseInt(scan.nextLine());

                    System.out.println("Escolha o tipo de galinha");
                    System.out.println("1 - Galinha Robusta");
                    System.out.println("2 - Galinha Shiny");
                    System.out.println("3 - Galinha Da Angola");
                    System.out.println("4 - Galinha Macho");
                    String tipoGalinha = scan.nextLine();

                    System.out.println("Escreva o nível de beleza da galinha");
                    Integer nivelDeBeleza = Integer.parseInt(scan.nextLine());

                    if (tipoGalinha.equals("1")) {
                        celeiro.adicionarGalinha(new GalinhaRobusta(nomeGalinha, idadeGalinha, nivelDeBeleza));
                    } else if (tipoGalinha.equals("2")) {
                        celeiro.adicionarGalinha(new GalinhaShiny(nomeGalinha, idadeGalinha, nivelDeBeleza));
                    } else if (tipoGalinha.equals("3")) {
                        celeiro.adicionarGalinha(new GalinhaDaAngola(nomeGalinha, idadeGalinha, nivelDeBeleza));
                    } else if (tipoGalinha.equals("4")) {
                        celeiro.adicionarGalinha(new GalinhaMacho(nomeGalinha, idadeGalinha, nivelDeBeleza));
                    } else {
                        System.out.println("Opção inválida");
                    }
                    System.out.printf("Galinha adicionada com sucesso!\n");
                    break;
                case "2":
                    celeiro.listarGalinhas();
                    break;
                case "3":
                    celeiro.cacarejar();
                    break;
                case "4":
                    celeiro.botarOvos();
                    break;
                case "5":
                    celeiro.listarOvos();
                    break;
                case "6":
                    celeiro.rankingBeleza();
                    break;
                case "9":
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }
    }
}