package entities;

public class GalinhaRobusta extends Galinha{
    public GalinhaRobusta(String nome, int idade) {
        super(nome, idade);
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
