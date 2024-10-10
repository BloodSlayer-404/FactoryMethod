package org.example.factories;

import org.example.Enemy;
import org.example.entities.Husk;

public class HuskFactory extends EnemyFactory{

    /**
     * Returns a new {@link Husk}
     * @return A new {@link Husk}
     */
    @Override
    public Enemy createEnemy() {
        return new Husk();
    }
}
