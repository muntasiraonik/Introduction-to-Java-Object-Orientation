package com.company;

import java.util.Random;
import java.util.Scanner;

public class BattleArena {

    Scanner scanner = new Scanner(System.in);

    public void fight(Player player, Monster monster) {
        boolean done =  false;
        while (!done) {

            System.out.println("############## New Round ##############");
            System.out.println("Your Life : " + player.getLife());
            System.out.println("Your Mana : " + player.getMana());
            System.out.println("Monster Life : " + monster.getLife());
            System.out.println("_______________________________________");

            System.out.println("it is your turn. Which attack do you want to perform ? ");
            System.out.println(player.getWeaponAttack().getDescription());
            System.out.println(player.getMagicAttack().getDescription());

            // player option

            int option = scanner.nextInt();
            int damage;
            if(option == 1) {
                damage = player.getWeaponAttack().getDamage();
            } else {
                damage = player.getMagicAttack().getDamage();
                player.setMana(player.getMana()-player.getMagicAttack().getManaCost());
            }

            System.out.println("Monster got " + damage + " Damage");
            System.out.println("Monster Attacks!");

            monster.setLife(monster.getLife()-damage);

            int monsterDamage =  1 + new Random().nextInt(10 - 1 + 1);

            System.out.println("You got " + monsterDamage + " Damage.");

            player.setLife(player.getLife()-monsterDamage);

            if(monster.getLife() <= 0) {
                System.out.println("You Won!");
                return;
            }

            if(player.getLife() <= 0) {
                System.out.println("You Lost!");
                return;
            }
        }
    }
}
