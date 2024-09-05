package entities;

public class GalinhaDaAngola extends Galinha{
    public GalinhaDaAngola(String nome, Integer idade, Integer beleza) {
        super(nome, idade, beleza);
    }

    @Override
    public void cacarejar() {
        System.out.println("popo popo");
    }
}
