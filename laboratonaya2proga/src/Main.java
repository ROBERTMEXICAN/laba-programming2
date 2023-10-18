import ru.ifmo.se.pokemon.Battle;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();

        Bulbasaur bulb = new Bulbasaur("Roma", 1);
        Fearow fear = new Fearow("Anton", 1);
        Ivysaur ivy = new Ivysaur("Slava", 1);
        Jolteon jolt = new Jolteon("Subdullah", 1);
        Swampert swamp = new Swampert("Anfisa", 1);
        Venusaur venu = new Venusaur("Rock", 1);

//        b.addAlly(bulb);
//        b.addAlly(fear);
        b.addAlly(jolt);

//        b.addFoe(ivy);
//        b.addFoe(swamp);
        b.addFoe(venu);

        b.go();
    }
}
