package org.example.entities;

import org.example.Enemy;

public class Stray implements Enemy{

    /**
     * Returns the attack action of the {@link Stray}
     * @return "The stray shoots slowness arrows to the player"
     */
    @Override
    public String attack() {
        return "The stray shoots slowness arrows to the player";
    }

    /**
     * Returns the jump action of the {@link Stray}
     * @return "The stray jumps one and a quarter block"
     */
    @Override
    public String jump() {
        return "The stray jumps one and a quarter block";
    }

    /**
     * Returns the move action of the {@link Stray}
     * @return "The stray runs away from the player"
     */
    @Override
    public String move() {
        return "The stray runs away from the player";
    }

    /**
     * Returns the drops of the {@link Stray} when dies
     * @return "The stray drops bones and slowness arrows"
     */
    @Override
    public String die() {
        return "The stray drops bones and slowness arrows";
    }
    
}
