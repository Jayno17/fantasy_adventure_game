package Enemies;

import Players.Player;

public class Orc extends Enemy {
    public Orc(String name, int healthScore) {
        super(name, healthScore);
    }

    public int blockValue() {
        return 0;
    }

    public int defend(Player player) {
        return 0;
    }
}
