package org.example.factories;

import org.example.Enemy;
import org.example.entities.Stray;

public class StrayFactory extends EnemyFactory{

    /**
     * Returns a new {@link Stray}
     * @return A new {@link Stray}
     */
    @Override
    public Enemy createEnemy() {
        return new Stray();
    }
}
