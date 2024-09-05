package entities;

public class GalinhaShiny extends Galinha{
    public GalinhaShiny(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void botarOvo() {
        ovosPostos+= 19;
    }

    @Override
    public void cacarejar() {
        System.out.println("poporopo ");
    }
}
