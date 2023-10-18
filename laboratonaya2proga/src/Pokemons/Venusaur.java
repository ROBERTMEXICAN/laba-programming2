import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Venusaur extends Ivysaur {
    public Venusaur(String name, int lvl){
        super(name, lvl);
        this.setStats(80,82,83,100,100,80);
        this.setType(Type.NORMAL, Type.FLYING);
        this.addMove(new TakeDown());
    }
}