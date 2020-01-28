package yal.table;

public class SymboleFonction extends Symbole {
    private String type;
    public SymboleFonction(int decal) {
        super(decal);
        type="fonction";
    }
    public String getType(){
        return type;
    }

}
