import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;


public class PinMissile extends PhysicalMove {

    public PinMissile(){
        super(Type.BUG,25,9);
        int[] probability = new int[]{2,2,2,3,3,3,4,5};
        int rnd = probability[new Random().nextInt(probability.length)];
        this.hits = rnd;
    }
    @Override
    public String describe(){
        return "Using PinMissile";
    }
}



