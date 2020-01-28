package yal.table;

public class SymboleEntier extends Symbole {
    String type;
    public SymboleEntier(int decal) {
        super(decal);
    }

    public String getType() {
        type="entier";
        return type;
    }
}
