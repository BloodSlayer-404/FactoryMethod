package org.example;

import org.example.factories.*;
import org.example.entities.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {
    private Enemy enemy;
    private EnemyFactory factory;

    /**
     * Checks if the {@link BoggedFactory} returns a {@link Bogged}
     * and checks the values returned by the methods of the {@link Bogged}
     */
    @Test
    void createBogged() {
        factory = new BoggedFactory();
        enemy = factory.createEnemy();
        assertEquals("The bogged shoots poison arrows to the player", enemy.attack());
        assertEquals("The bogged jumps half a block", enemy.jump());
        assertEquals("The bogged walks away from the player", enemy.move());
        assertEquals("The bogged drops mushrooms and poison arrows", enemy.die());
    }

    /**
     * Checks if the {@link DrownedFactory} returns a {@link Drowned}
     * and checks the values returned by the methods of the {@link Drowned}
     */
    @Test
    void createDrowned() {
        factory = new DrownedFactory();
        enemy = factory.createEnemy();
        assertEquals("The drowned hits the player with a trident", enemy.attack());
        assertEquals("The drowned swims to the surface", enemy.jump());
        assertEquals("The drowned swims towards the player", enemy.move());
        assertEquals("The drowned drops copper ingots", enemy.die());
    }

    /**
     * Checks if the {@link HuskFactory} returns a {@link Husk}
     * and checks the values returned by the methods of the {@link Husk}
     */
    @Test
    void createHusk() {
        factory = new HuskFactory();
        enemy = factory.createEnemy();
        assertEquals("The husk bites the player", enemy.attack());
        assertEquals("The husk jumps half a block", enemy.jump());
        assertEquals("The husk limps towards the player", enemy.move());
        assertEquals("The husk drops rotten flesh", enemy.die());
    }

    /**
     * Checks if the {@link SkeletonFactory} returns a {@link Skeleton}
     * and checks the values returned by the methods of the {@link Skeleton}
     */
    @Test
    void createSkeleton() {
        factory = new SkeletonFactory();
        enemy = factory.createEnemy();
        assertEquals("The skeleton shoots arrows to the player", enemy.attack());
        assertEquals("The skeleton jumps a block", enemy.jump());
        assertEquals("The skeleton moves away from the player", enemy.move());
        assertEquals("The skeleton drops bones and arrows", enemy.die());
    }

    /**
     * Checks if the {@link StrayFactory} returns a {@link Stray}
     * and checks the values returned by the methods of the {@link Stray}
     */
    @Test
    void createStray() {
        factory = new StrayFactory();
        enemy = factory.createEnemy();
        assertEquals("The stray shoots slowness arrows to the player", enemy.attack());
        assertEquals("The stray jumps one and a quarter block", enemy.jump());
        assertEquals("The stray runs away from the player", enemy.move());
        assertEquals("The stray drops bones and slowness arrows", enemy.die());
    }

    /**
     * Checks if the {@link ZombieFactory} returns a {@link Zombie}
     * and checks the values returned by the methods of the {@link Zombie}
     */
    @Test
    void createZombie() {
        factory = new ZombieFactory();
        enemy = factory.createEnemy();
        assertEquals("The zombie scratches the player", enemy.attack());
        assertEquals("The zombie jumps a block", enemy.jump());
        assertEquals("The zombie walks towards the player", enemy.move());
        assertEquals("The zombie drops rotten flesh", enemy.die());
    }

}