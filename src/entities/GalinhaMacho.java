package entities;

import interfaces.Galo;

public class GalinhaMacho extends Galinha implements Galo {
    public GalinhaMacho(String nome, int idade, int beleza) {
        super(nome, idade, beleza);
    }

    @Override
    public void botarOvo() {
        System.out.println("Galo não bota ovos");
    }

    @Override
    public void cacarejar() {
        System.out.println("Cocoricooooooooo");
    }

    @Override
    public void cantar() {
        System.out.println("Cantando como um galo");
    }
}
