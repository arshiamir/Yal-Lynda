package yal.arbre.expressions;

import yal.table.Entree;
import yal.table.EntreeVar;
import yal.table.Symbole;
import yal.table.Tds;

public class Idf extends Expression {
    private String nom;
    private EntreeVar entreeVar;
    protected Idf(int n,String nom) {
        super(n);
        this.nom=nom;
        entreeVar=new EntreeVar(nom);
    }

    @Override
    public void verifier() {
        new Tds().getInstance().identifier(entreeVar);
    }

    @Override
    public String toMIPS() {
        Symbole symbole= Tds.getInstance().identifier(entreeVar);
        int indice=symbole.getDecal();
        String tomips="tlw $v0,"+indice+"($sp)\n";
        return tomips;
    }

}
