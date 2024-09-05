public class GalinhaRobusta extends Galinha{
    public GalinhaRobusta(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void cacarejar() {
        System.out.println("Cacarejando como uma galinha robusta");
    }
}
