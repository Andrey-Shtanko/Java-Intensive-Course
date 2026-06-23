package com.pitchbook.HW2;

public class FightZone {

    static void main(String[] args) {
        Weapon bowAndArrows = new Weapon("BowAndArrows", 15);
        Weapon knife = new Weapon("Knife", 5);

        Character rambo = new Character("Rambo", 100, bowAndArrows);
        Character commando = new Character("Commando", 100);
        Character commandoWithKnife = new Character("Commando", 100, knife);

        rambo.fight(commando);
        rambo.fight(commandoWithKnife);
    }

}
