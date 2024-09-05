public class GalinhaShiny extends Galinha{
    public GalinhaShiny(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void cacarejar() {
        System.out.println("Cacarejando como uma galinha shiny");
    }
}
