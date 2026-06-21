package com.pitchbook.HW2;

public class Weapon {
    private final String weaponName;
    private final int damage;

    public Weapon(String weaponName, int damage) {
        this.weaponName = weaponName;
        this.damage = damage;
    }

    public String getName() {
        return this.weaponName;
    }

     public int getDamage() {
        return this.damage;
    }

}
