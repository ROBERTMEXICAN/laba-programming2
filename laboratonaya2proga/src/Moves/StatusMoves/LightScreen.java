import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Stat.ATTACK;
import static ru.ifmo.se.pokemon.Stat.SPECIAL_ATTACK;

public class LightScreen extends StatusMove {
    public LightScreen(){
        super(Type.PSYCHIC,0,0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected void applyOppEffect(Pokemon p){
        Effect eff = new Effect().chance(0.5).condition(Status.PARALYZE).turns(3);
    }
    public void applySelfEffects(Pokemon p){
        Effect eff = new Effect().stat(SPECIAL_ATTACK, (int) (p.getStat(SPECIAL_ATTACK)*2)).turns(0);
        p.addEffect(eff);
    }
    @Override
    protected String describe(){
        return "Using LightScreen";
    }
}
