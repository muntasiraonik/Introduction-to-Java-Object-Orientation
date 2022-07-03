package com.company;

public class Player {

    private int life;
    private int mana;
    private WeaponAttack weaponAttack;
    private MagicAttack magicAttack;

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void addAttack(Attack attack) {
        if(attack instanceof WeaponAttack) {
            this.weaponAttack = (WeaponAttack) attack;
        } else if(attack instanceof MagicAttack) {
            this.magicAttack = (MagicAttack) attack;
        } else {
            System.out.println("Unknown Attack added!");
        }
    }

    public WeaponAttack getWeaponAttack() {
        return weaponAttack;
    }

    public MagicAttack getMagicAttack() {
        return magicAttack;
    }
}
