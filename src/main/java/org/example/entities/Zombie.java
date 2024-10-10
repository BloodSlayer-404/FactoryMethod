package org.example.entities;

import org.example.Enemy;

public class Zombie implements Enemy{

    /**
     * Returns the attack action of the {@link Zombie}
     * @return "The zombie scratches the player"
     */
    @Override
    public String attack() {
        return "The zombie scratches the player";
    }

    /**
     * Returns the jump action of the {@link Zombie}
     * @return "The zombie jumps a block"
     */
    @Override
    public String jump() {
        return "The zombie jumps a block";
    }

    /**
     * Returns the move action of the {@link Zombie}
     * @return "The zombie walks towards the player";
     */
    @Override
    public String move() {
        return "The zombie walks towards the player";
    }

    /**
     * Returns the drops of the {@link Zombie} when dies
     * @return "The zombie drops rotten flesh";
     */
    @Override
    public String die() {
        return "The zombie drops rotten flesh";
    }
    
}
