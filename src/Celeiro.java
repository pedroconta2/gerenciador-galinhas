import entities.Galinha;

import java.util.ArrayList;
import java.util.List;

public class Celeiro {


    private List<Galinha> galinhas = new ArrayList<>();

    public void adicionarGalinha(Galinha galinha){
        galinhas.add(galinha);
    }

    public void removerGalinha(Galinha galinha){
        galinhas.remove(galinha);
    }

    public void listarGalinhas(){
        for(Galinha galinha : galinhas){
            System.out.println(galinha.getNome() + " - " + galinha.getIdade() + " anos" + " - tipo: " + galinha.getClass().getSimpleName());
        }
    }

    public void cacarejar(){
        for(Galinha galinha : galinhas){
            galinha.cacarejar();
        }
    }

    public void botarOvos(){
        for(Galinha galinha : galinhas){
            galinha.botarOvo();
        }
    }

    public void listarOvos(){
        for(Galinha galinha : galinhas){
            System.out.println(galinha.getNome() + " botou " + galinha.getOvosPostos() + " ovos do tipo:" + galinha.getClass().getSimpleName());
        }
    }
}
