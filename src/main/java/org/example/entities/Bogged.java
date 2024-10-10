package org.example.entities;

import org.example.Enemy;

public class Bogged implements Enemy{

    /**
     * Returns the attack action of the {@link Bogged}
     * @return "The bogged shoots poison arrows to the player"
     */
    @Override
    public String attack() {
        return "The bogged shoots poison arrows to the player";
    }

    /**
     * Returns the jump action of the {@link Bogged}
     * @return "The bogged jumps half a block"
     */
    @Override
    public String jump() {
        return "The bogged jumps half a block";
    }

    /**
     * Returns the move action of the {@link Bogged}
     * @return "The bogged walks away from the player"
     */
    @Override
    public String move() {
        return "The bogged walks away from the player";
    }

    /**
     * Returns the drops of the {@link Bogged} when dies
     * @return "The bogged drops mushrooms and poison arrows"
     */
    @Override
    public String die() {
        return "The bogged drops mushrooms and poison arrows";
    }

}
