package com.devinrsmith.specialk;

/**
 * Created by dsmith on 10/10/14.
 */
public enum CardSuit {
    SPADES("s"),
    HEARTS("h"),
    DIAMONDS("d"),
    CLUBS("c")

    ;

    private final String abbreviation;

    CardSuit(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}