package org.example.entities;

import org.example.Enemy;

public class Husk implements Enemy{

    /**
     * Returns the attack action of the {@link Husk}
     * @return "The husk bites the player"
     */
    @Override
    public String attack() {
        return "The husk bites the player";
    }

    /**
     * Returns the jump action of the {@link Husk}
     * @return "The husk jumps half a block"
     */
    @Override
    public String jump() {
        return "The husk jumps half a block";
    }

    /**
     * Returns the move action of the {@link Husk}
     * @return "The husk limps towards the player"
     */
    @Override
    public String move() {
        return "The husk limps towards the player";
    }

    /**
     * Returns the drops of the {@link Husk} when dies
     * @return ""The husk drops rotten flesh"
     */
    @Override
    public String die() {
        return "The husk drops rotten flesh";
    }
    
}
