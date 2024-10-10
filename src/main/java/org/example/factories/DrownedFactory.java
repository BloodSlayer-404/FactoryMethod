package org.example.factories;

import org.example.Enemy;
import org.example.entities.Drowned;

public class DrownedFactory extends EnemyFactory{

    /**
     * Returns a new {@link Drowned}
     * @return A new {@link Drowned}
     */
    @Override
    public Enemy createEnemy() {
        return new Drowned();
    }
}
