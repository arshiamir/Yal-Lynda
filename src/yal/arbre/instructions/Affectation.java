package yal.arbre.instructions;

import yal.arbre.expressions.Expression;
import yal.arbre.expressions.Idf;
import yal.table.Tds;

public class Affectation extends Instruction{
    private Idf var;
    private Expression exp;
    protected Affectation(int n) {
        super(n);
    }

    @Override
    public void verifier() {
        var.verifier();
        exp.verifier();

    }

    @Override
    public String toMIPS() {
        String mips="sw $v0,"+ Tds.getInstance().getTailleZoneVariable()+"($sp)";
        return null;
    }
}
