import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Jolteon extends Pokemon {
    public Jolteon(String name, int lvl){
        super(name, lvl);
        this.setStats(65,65,60,110,95,130);
        this.setType(Type.ELECTRIC);
        this.addMove(new TripleKIck());
        this.addMove(new LightScreen());
    }
}