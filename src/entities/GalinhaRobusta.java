package entities;

public class GalinhaRobusta extends Galinha{
    public GalinhaRobusta(String nome, Integer idade, Integer beleza) {
        super(nome, idade, beleza);
    }

    @Override
    public void botarOvo() {
        ovosPostos+= 4;
    }
    @Override
    public void cacarejar() {
        System.out.println("POOO POOOO PPPPPOOOO");
    }
}
