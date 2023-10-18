import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {
    public Growl(){
        super(Type.NORMAL,0,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect().stat(Stat.ATTACK, -1);
        p.addEffect(eff);
    }
    @Override
    protected String describe(){
        return "Using Growl";
    }
}
