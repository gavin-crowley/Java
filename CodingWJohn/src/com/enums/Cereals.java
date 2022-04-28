package com.enums;

public enum Cereals {
    CAPTAIN_CRUNCH(50, 2.5),
    FROOT_LOOPS(60, 3.0),
    REESES_PUFFS(100, 1.5),
    COCOA_PUFFS(75, 1.8);

    final int levelOfDeliciousness;
    final double price;

    Cereals(int levelOfDeliciousness, double price) {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }
}
