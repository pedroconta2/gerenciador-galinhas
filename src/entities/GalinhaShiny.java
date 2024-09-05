package entities;

public class GalinhaShiny extends Galinha{
    public GalinhaShiny(String nome, Integer idade, Integer beleza) {
        super(nome, idade, beleza);
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
