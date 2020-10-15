
package com.company;
import java.util.Random;
import java.util.Scanner;

public class RocketMan {
    private int health;
    private int mana;
    private String name;
    private String attackType;
    private int level;

    private Scanner scanner;



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
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




    public RocketMan(int health, int mana, String name, String attackType, int level) {
        this.health = health;
        this.mana = mana;
        this.name  = name;
        this.attackType = attackType;
        this.level = level;
        this.scanner = new Scanner(System.in);
    }

    public int attack() {
        System.out.println("Which ability would you like to use?");
        System.out.println("1. Rocket Barrage");
        System.out.println("2. Rocket Jump");
        System.out.println("3. Guided Missile");
        System.out.println("4. Space-X Candy");
        int input = scanner.nextInt();
        switch (input) {
            case 0:
                System.out.println((this.getName() + " used rocket barrage"));
                return rocketBarrage();
            case 1:
                System.out.println((this.getName() + " used rocket jump"));
                return rocketJump();
            case 2:
                System.out.println((this.getName() + " used guided missile"));
                return guidedMissile();
            case 3:
                System.out.println((this.getName() + " ate some SpaceX Candy"));
                return spaceXCandy();

            default:
                System.out.println("Incorrect number entered");

        }
        return 0;
    }

    public int npcAttack() {
        Random randomNum = new Random();
        int rand = randomNum.nextInt(3);

        switch (rand) {
            case 0:
                System.out.println((this.getName() + " used rocket barrage"));
                return rocketBarrage();
            case 1:
                System.out.println((this.getName() + " used rocket jump"));
                return rocketJump();

            case 2:
                System.out.println((this.getName() + " used guided missile"));
                return guidedMissile();

            case 3:
                System.out.println((this.getName() + " ate some SpaceX Candy"));
                return spaceXCandy();

            default:
                System.out.println("Not sure how this happened!");

        }
        return 0;
    }

    public int rocketBarrage() {
        Random random = new Random();
        int dmg = random.nextInt(40-30)+30;
        return dmg;
    }

    public int rocketJump() {
        Random random = new Random();
        int dmg = random.nextInt(40-30)+ 30;
        return dmg;
    }

    public int guidedMissile() {
        Random random = new Random();
        int dmg = random.nextInt(70-50)+50;
        return dmg;
    }

    public int spaceXCandy() {
        Random random = new Random();
        int heal = random.nextInt(40-20)+20;
        return heal;
    }


}
