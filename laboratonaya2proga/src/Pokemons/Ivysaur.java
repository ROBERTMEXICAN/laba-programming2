import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ivysaur extends Bulbasaur {
    public Ivysaur(String name, int lvl){
        super(name, lvl);
        this.setStats(60,62,63,80,80,60);
        this.setType(Type.GRASS, Type.POISON);
        this.addMove(new PinMissile());
    }
}