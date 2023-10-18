import ru.ifmo.se.pokemon.*;

public class FlameWheel extends PhysicalMove {
    public FlameWheel(){
        super(Type.FIRE,60,100);
    }
    @Override
    public void applyOppEffects(Pokemon p){
        Effect eff = new Effect().chance(0.1).condition(Status.BURN);
        p.addEffect(eff);
    }
}
