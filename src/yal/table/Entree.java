package yal.table;

public abstract class Entree {
    private String nomEntree;
    public Entree(String nom){
        this.nomEntree=nom;
    }

    public String getNomEntree() {
        return nomEntree;
    }
}
