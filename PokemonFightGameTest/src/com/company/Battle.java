package com.company;

public class Battle {
    private MiniGunMan miniGunMan;
    private RocketMan rocketMan;
    int round;


    public Battle(MiniGunMan miniGunMan, RocketMan rocketMan) {
        this.miniGunMan = miniGunMan;
        this.rocketMan = rocketMan;
        int round = 0;
    }

    public void battle_time() {
        while (true) {

            int dmg = miniGunMan.attack();
            System.out.println("You hit " + rocketMan.getName() + " for " + dmg + "\n");
            rocketMan.setHealth(rocketMan.getHealth() - dmg);
            System.out.println(this.rocketMan.getName() + "'s  health is " + rocketMan.getHealth());
            System.out.println(this.rocketMan.getName() + " attacks you for " + this.rocketMan.npcAttack());
            miniGunMan.setHealth((miniGunMan.getHealth() - dmg));
            System.out.println(miniGunMan.getName() + "'s health is " + miniGunMan.getHealth());
            if (this.miniGunMan.getHealth() <= 0) {
                System.out.println("Game over.");
                break;
            }
            if (this.rocketMan.getHealth() <= 0) {
                System.out.println("You have defeated NPC Rocket Man");
                break;
            }

        }
    }

}
