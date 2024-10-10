package org.example.entities;

import org.example.Enemy;

public class Skeleton implements Enemy{

    /**
     * Returns the attack action of the {@link Skeleton}
     * @return "The skeleton shoots arrows to the player"
     */
    @Override
    public String attack() {
        return "The skeleton shoots arrows to the player";
    }

    /**
     * Returns the jump action of the {@link Skeleton}
     * @return "The skeleton jumps a block"
     */
    @Override
    public String jump() {
        return "The skeleton jumps a block";
    }

    /**
     * Returns the move action of the {@link Skeleton}
     * @return "The skeleton moves away from the player";
     */
    @Override
    public String move() {
        return "The skeleton moves away from the player";
    }

    /**
     * Returns the drops of the {@link Skeleton} when dies
     * @return "The skeleton drops bones and arrows"
     */
    @Override
    public String die() {
        return "The skeleton drops bones and arrows";
    }
    
}
