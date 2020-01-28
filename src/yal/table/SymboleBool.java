package yal.table;

public class SymboleBool extends Symbole{
    String type;
    public SymboleBool(int decal) {
        super(decal);
        type="booleen";
    }

    public String getType() {
        return type;
    }
}
