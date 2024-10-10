package org.example.factories;

import org.example.Enemy;
import org.example.entities.Zombie;

public class ZombieFactory extends EnemyFactory{

    /**
     * Returns a new {@link Zombie}
     * @return A new {@link Zombie}
     */
    @Override
    public Enemy createEnemy() {
        return new Zombie();
    }
}