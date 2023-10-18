import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Stat.ATTACK;

public class TripleKIck extends PhysicalMove {
    public TripleKIck(){
        super(Type.FIGHTING,10,90,0,3);
    }

    @Override
    public void applySelfEffects(Pokemon p){
        int n = (int) p.getStat(ATTACK);
        Effect eff = new Effect().stat(ATTACK, (int) (p.getStat(ATTACK)*2)).turns(0);
        p.addEffect(eff);
    }
    @Override
    public String describe(){
        return "Using TripleKick";
    }

}