import ru.ifmo.se.pokemon.*;

public class SwordDance extends StatusMove {
    public SwordDance(){
        super(Type.NORMAL,0,0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect eff = new Effect().stat(Stat.ATTACK, +2);
        p.addEffect(eff);
    }
    @Override
    protected String describe(){
        return "Used SwordDance";
    }
}
