import ru.ifmo.se.pokemon.*;

public class BubbleBeam extends SpecialMove {
    public BubbleBeam(){
        super(Type.WATER,65,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect().chance(0.1).stat(Stat.SPEED, -1);
        p.addEffect(eff);
    }
    @Override
    protected String describe(){
        return "Using BubbleBeam";
    }

}
