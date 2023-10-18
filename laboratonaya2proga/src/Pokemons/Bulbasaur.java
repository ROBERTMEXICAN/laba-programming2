import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bulbasaur extends Pokemon {
    public Bulbasaur(String name, int lvl){
        super(name, lvl);
        this.setStats(45,49,49,65,65,45);
        this.setType(Type.GRASS, Type.POISON);
        this.addMove(new Growl());
        this.addMove(new SwordDance());
    }
}
