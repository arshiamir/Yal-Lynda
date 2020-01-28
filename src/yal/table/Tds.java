package yal.table;

import yal.exceptions.AnalyseLexicaleException;
import yal.exceptions.DoubleDeclarationException;
import yal.exceptions.NotDeclaredException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Tds {
    private HashMap<Entree,Symbole> table;
    private int taille;
    public Tds(){
        taille=0;
    }
    public static Tds getInstance(){
        return new Tds();
    }
    public void ajouter(Entree e,Symbole s) throws DoubleDeclarationException {
        table.put(e,s);
        taille=taille-4;
    }
    public Symbole identifier(Entree entree) throws NotDeclaredException {
        return table.get(entree);
    }
    public int getTailleZoneVariable(){
        return taille;
    }

}
