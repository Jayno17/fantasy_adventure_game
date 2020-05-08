package Enemies;

import Interfaces.IDefend;

public abstract class Enemy implements IDefend {

    private String name;
    private int healthScore;

    public Enemy(String name, int healthScore) {
        this.name = name;
        this.healthScore = healthScore;
    }

    public String getName() {
        return name;
    }

    public int getHealthScore() {
        return healthScore;
    }
}
