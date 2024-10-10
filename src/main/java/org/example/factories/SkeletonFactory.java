package org.example.factories;

import org.example.Enemy;
import org.example.entities.Skeleton;

public class SkeletonFactory extends EnemyFactory{

    /**
     * Returns a new {@link Skeleton}
     * @return A new {@link Skeleton}
     */
    @Override
    public Enemy createEnemy() {
        return new Skeleton();
    }
}
