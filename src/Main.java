import entities.GalinhaDaAngola;
import entities.GalinhaMacho;
import entities.GalinhaRobusta;
import entities.GalinhaShiny;

public class Main {
    public static void main(String[] args) {

        String controle = "";
        Celeiro celeiro = new Celeiro();

        System.out.printf("Bem vindo ao celeiro\n");
        System.out.printf("Gerencie o celeiro\n");

        while (controle != "9") {

            System.out.println("1 - Adicionar Galinha");
            System.out.println("2 - Listar galinhas");
            System.out.println("3 - Cacarejar");
            System.out.println("4 - Botar ovos");
            System.out.println("5 - Listar ovos");
            System.out.println("9 - Sair");

            controle = System.console().readLine();

            switch (controle) {
                case "1":

                    System.out.println("Escreva o nome da galinha");
                    String nomeGalinha = System.console().readLine();

                    System.out.println("Escreva a idade da galinha");
                    int idadeGalinha = Integer.parseInt(System.console().readLine());

                    System.out.println("Escolha o tipo de galinha");
                    System.out.println("1 - Galinha Robusta");
                    System.out.println("2 - Galinha Shiny");
                    System.out.println("3 - Galinha Da Angola");
                    System.out.println("4 - Galinha Macho");
                    String tipoGalinha = System.console().readLine();

                    if (tipoGalinha.equals("1")) {
                        celeiro.adicionarGalinha(new GalinhaRobusta(nomeGalinha, idadeGalinha));
                    } else if (tipoGalinha.equals("2")) {
                        celeiro.adicionarGalinha(new GalinhaShiny(nomeGalinha, idadeGalinha));
                    } else if (tipoGalinha.equals("3")) {
                        celeiro.adicionarGalinha(new GalinhaDaAngola(nomeGalinha, idadeGalinha));
                    } else if (tipoGalinha.equals("4")) {
                        celeiro.adicionarGalinha(new GalinhaMacho(nomeGalinha, idadeGalinha));
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
                case "9":
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }
    }
}