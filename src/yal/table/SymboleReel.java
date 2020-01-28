package yal.table;

public class SymboleReel extends Symbole {
    private String type;
    public SymboleReel(int decal) {
        super(decal);
        type="reel";
    }

    public String getType() {
        return type;
    }
}
