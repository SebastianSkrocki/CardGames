package com.sebastianskrocki.blackjack;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.getCard(4));

        deck.showDeck();
        deck.removeCard(4);
        deck.showDeck();


    }

    public static void startGame(){

    }
}
