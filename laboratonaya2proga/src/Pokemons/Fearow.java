import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Fearow extends Pokemon {
    public Fearow(String name, int lvl){
        super(name, lvl);
        this.setStats(65,90,65,61,61,100);
        this.setType(Type.NORMAL, Type.FLYING);
        this.addMove(new IceBeam());
        this.addMove(new HydroPump());
        this.addMove(new BubbleBeam());
    }
}