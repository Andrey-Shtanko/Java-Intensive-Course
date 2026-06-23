package com.pitchbook.HW2;

public record Weapon (String weaponName, int damage) {
    public String getName() {
        return this.weaponName;
    }

     public int getDamage() {
        return this.damage;
    }

}
