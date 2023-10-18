import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swampert extends Pokemon {
    public Swampert(String name, int lvl){
        super(name, lvl);
        this.setStats(100,110,90,85,90,60);
        this.setType(Type.WATER, Type.GROUND);
        this.addMove(new TripleKIck());
        this.addMove(new FlameWheel());
    }
}