package com.company;

import java.util.Random;
import java.util.Scanner;

public class MiniGunMan {
    private int health;
    private int rage;
    private String name;
    private String attackType;
    private int level;
    private Scanner scanner;
    private RocketMan rocketMan;

    public int getMana() {
        return rage;
    }

    public void setMana(int mana) {
        this.rage = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public MiniGunMan(int health, int mana, String name, String attackType, int level) {
        this.health = health;
        this.rage = mana;
        this.name  = name;
        this.attackType = attackType;
        this.level = level;
        this.scanner = new Scanner(System.in);

    }


    public int attack() {
        System.out.println("Which ability would you like to use?");
        System.out.println("1. Whirlwind Of Bullets");
        System.out.println("2. Grow");
        System.out.println("3. Molotov Cocktail");
        System.out.println("4. Body Slam");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println(this.name + " used Whirlwind of Bullets");
                return WhirlWindOfBullets();
            case 2:
                System.out.println(this.name + " used Grow");
                return Grow();
            case 3:
                System.out.println(this.name + " threw a Molotov Cocktail");
                return MolotovCocktail();
            case 4:
                System.out.println(this.name + " used Body Slam");
                return BodySlam();
            default:
                System.out.println("Incorrect number entered");

        }
        return 0;
    }

    public int WhirlWindOfBullets() {
        Random random = new Random();
        int dmg = random.nextInt(20-10)+10;
        return dmg;
    }

    public int Grow() {
        Random random = new Random();
        int dmg = random.nextInt(15-10)+10;
        return dmg;
    }
    public int MolotovCocktail() {
        Random random = new Random();
        int dmg = random.nextInt(10-5)+5;
        return dmg;
    }
    public int BodySlam() {
        Random random = new Random();
        int dmg = random.nextInt(50-5)+5;
        return dmg;
    }

}
