package com.sebastianskrocki.blackjack;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();
    Deck deck = new Deck();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void drawCard(){
        hand.add(deck.getCardFromDeck());
    }

    public void showHand () {
        for (Card x : hand){
            System.out.println(x);
        }
    }
}
