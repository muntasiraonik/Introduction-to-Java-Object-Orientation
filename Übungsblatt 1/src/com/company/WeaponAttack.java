package com.company;

import java.util.Random;

public class WeaponAttack implements Attack {

    private String name;
    private int min;
    private int max;

    public WeaponAttack(String name, int min, int max) {
        this.name = name;
        this.min = min;
        this.max = max;
    }

    @Override
    public String getDescription() {
        return "Melee Attack with " + name + ". Deals " + min + " to " + max + " Damage (1)";
    }

    @Override
    public int getDamage() {
        Random random = new Random();
        return min + random.nextInt(max - min + 1);
    }
}
