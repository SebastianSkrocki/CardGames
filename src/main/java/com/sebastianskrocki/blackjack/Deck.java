package com.sebastianskrocki.blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    private final ArrayList<Card> deck = new ArrayList<>(generateDeck());


    public static ArrayList<Card> generateDeck(){
        ArrayList<Card> deck = new ArrayList<>();
        ArrayList<Suit> suits = new ArrayList<>(Arrays.asList(Suit.values()));
        ArrayList<Rank> ranks = new ArrayList<>(Arrays.asList(Rank.values()));
        for(int i =0 ;i<Rank.values().length;i++){
            for(int j=0;j<Suit.values().length;j++){
                deck.add(new Card(suits.get(j),ranks.get(i)));
            }
        }
        return deck;
    }
    public Card getCard(int index){
        return deck.get(index);
    }

    public ArrayList<Card> removeCard(int index){
        deck.remove(index);
        return deck;
    }

    public void showDeck(){
        for (Card x: deck) {
            System.out.println(x);
        }
    }
}
