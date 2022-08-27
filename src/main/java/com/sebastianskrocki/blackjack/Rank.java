package com.sebastianskrocki.blackjack;

public enum Rank {
    ACE (11,1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private final int value;
    private int alternativeValue;

    Rank(int value,int alternativeValue){
        this.value = value;
        this.alternativeValue = alternativeValue;
    }
    Rank(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public int getAlternativeValue () {
        return this.alternativeValue;
    }
}
