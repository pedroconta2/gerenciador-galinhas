public class GalinhaMacho extends Galinha implements Galo{
    public GalinhaMacho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void cacarejar() {
        System.out.println("Cacarejando como um galo");
    }

    @Override
    public void cantar() {
        System.out.println("Cantando como um galo");
    }
}
