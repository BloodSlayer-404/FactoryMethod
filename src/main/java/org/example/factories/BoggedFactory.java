package org.example.factories;

import org.example.Enemy;
import org.example.entities.Bogged;

public class BoggedFactory extends EnemyFactory{

    /**
     * Returns a new {@link Bogged}
     * @return A new {@link Bogged}
     */
    @Override
    public Enemy createEnemy() {
        return new Bogged();
    }
}
