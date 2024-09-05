package entities;

public abstract class Galinha {
    private String nome;
    private Integer idade;
    protected Integer ovosPostos;
    private Integer beleza;

    public Galinha(String nome, Integer idade, Integer beleza) {
        this.nome = nome;
        this.idade = idade;
        this.beleza = beleza;
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

    public Integer getBeleza() {
        return this.beleza;
    }

    public void setBeleza(Integer beleza) {
        this.beleza = beleza;
    }

    public abstract void cacarejar();
}
