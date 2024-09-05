public abstract class Galinha {
    private String nome;
    private int idade;
    private int ovosPostos;

    public Galinha(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.ovosPostos = 0;
    }

    public void botarOvo() {
        this.ovosPostos++;
    }

    public int getOvosPostos() {
        return this.ovosPostos;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public abstract void cacarejar();
}
