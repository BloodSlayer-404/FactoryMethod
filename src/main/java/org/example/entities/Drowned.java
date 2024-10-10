package org.example.entities;

import org.example.Enemy;

public class Drowned implements Enemy{

    /**
     * Returns the attack action of the {@link Drowned}
     * @return "The drowned hits the player with a trident"
     */
    @Override
    public String attack() {
        return "The drowned hits the player with a trident";
    }

    /**
     * Returns the jump action of the {@link Drowned}
     * @return "The drowned swims to the surface"
     */
    @Override
    public String jump() {
        return "The drowned swims to the surface";
    }

    /**
     * Returns the move action of the {@link Drowned}
     * @return "The drowned swims towards the player"
     */
    @Override
    public String move() {
        return "The drowned swims towards the player";
    }

    /**
     * Returns the drops of the {@link Drowned} when dies
     * @return "The drowned drops copper ingots"
     */
    @Override
    public String die() {
        return "The drowned drops copper ingots";
    }
    
}
