public class GalinhaDaAngola extends Galinha{
    public GalinhaDaAngola(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void cacarejar() {
        System.out.println("Cacarejando como uma galinha da Angola");
    }
}
