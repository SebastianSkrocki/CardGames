package com.sebastianskrocki.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {

    @Test
    void canGetSymbol(){
        assertEquals("\u2665",Suit.HEARTS.toString());
        assertEquals("\u2666",Suit.DIAMONDS.toString());
        assertEquals("\u2660",Suit.SPADES.toString());
        assertEquals("\u2663",Suit.CLUBS.toString());
    }
}