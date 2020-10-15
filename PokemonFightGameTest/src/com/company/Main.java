package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the demo for a turn-based fighter RPG game");
        System.out.println("Choose your class: 1 for Heavy Tank, 2 for Demolition Man");
        int input = Integer.valueOf(scanner.nextLine());

        if (input == 1) {
            System.out.println("You chose Heavy Tank!");
            System.out.println("Enter your Heavy Tank's name: ");
            String inputName = scanner.nextLine();
            battle(inputName);

        }
        else {
            System.out.println("You chose Demolition Man!");
            System.out.println("Enter your Demolition man's name: ");
            String inputName = scanner.nextLine();
            battle(inputName);
        }
    }

    public static void battle(String name) {

        MiniGunMan player = new MiniGunMan(200,100, name,"Minigun",1);
        RocketMan NPC = new RocketMan(150,120,"Demolition Man", "Rockets",1);
        Battle battle1 = new Battle(player, NPC);
        battle1.battle_time();
    }
}
