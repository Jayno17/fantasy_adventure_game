package Enemies;

import Players.Player;

public class Troll extends Enemy {

    public Troll(String name, int healthScore) {
        super(name, healthScore);
    }

    public int blockValue() {
        return 0;
    }

    public int defend(Player player) {
        return 0;
    }
}
