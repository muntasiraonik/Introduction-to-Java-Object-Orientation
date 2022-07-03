package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();

        Scanner scanner = new Scanner(System.in);

        String option = scanner.nextLine();

        if(option.toLowerCase().equals("y")) {

            Player player = new Player();
            player.setLife(100);
            player.setMana(35);
            player.addAttack(new WeaponAttack("Sword",7,9));

            MagicAttack magicAttack = new MagicAttack();
            magicAttack.setName("Fire Ball");
            magicAttack.setMinDamage(1);
            magicAttack.setMaxDamage(18);
            magicAttack.setManaCost(10);

            player.addAttack(magicAttack);

            Monster monster = new Monster();
            monster.setLife(100);

            new BattleArena().fight(player,monster);

        } else {
            System.out.println("See You Again!");
        }

    }

    private static void menu() {
        System.out.println("Welcome to the Turn-Based-System App");
        System.out.println("Do you wanna fight ? (y/n)");
    }
}
