package com.pitchbook.HW2;

public class Character {
    private Weapon weapon;
    private int health;
    private final String name;

    public Character(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    private void increaseHealthBeforeFight () {
        this.health += 10;

        System.out.println(this.name + " uses special skill and increases health in " + this.health + " points");
    }

    public void fight (Character character) {
        System.out.println(this.name + " wants to fight...");

        if (character.weapon == null) {
            System.out.println(character.name + " has no weapon and running away...");
            return;
        }

        increaseHealthBeforeFight();

        System.out.println("Makes a hit with " + this.weapon.weaponName());
        System.out.println(character.name + " looses " + this.weapon.damage() + " health points");
        System.out.println(character.name + " remaining health " + (character.health - this.weapon.damage()));

    }

}
