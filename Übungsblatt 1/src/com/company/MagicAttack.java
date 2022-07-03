package com.company;

import java.util.Random;

public class MagicAttack implements Attack {

    private String name;
    private int minDamage;
    private int maxDamage;
    private int manaCost;

    @Override
    public String getDescription() {
        return "Magic Spell called " + name + ". Costs " + manaCost + " Mana and deals " + minDamage + " to " + maxDamage + " Damage (2)";
    }

    @Override
    public int getDamage() {
        Random random = new Random();
        return maxDamage + random.nextInt(maxDamage - minDamage + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }
}
