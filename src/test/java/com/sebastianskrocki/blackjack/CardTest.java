package com.sebastianskrocki.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void canGetValueOfACard() {
        Card card1 = new Card(Suit.CLUBS,Rank.ACE);
        Card card2 = new Card(Suit.CLUBS,Rank.QUEEN);
        Card card3 = new Card(Suit.CLUBS,Rank.JACK);
        Card card4 = new Card(Suit.CLUBS,Rank.SIX);
        assertEquals(11,card1.getRank().getValue());
        assertEquals(10,card2.getRank().getValue());
        assertEquals(10,card3.getRank().getValue());
        assertEquals(6,card4.getRank().getValue());
    }


}