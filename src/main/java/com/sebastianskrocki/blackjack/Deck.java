package com.sebastianskrocki.blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<>(generateDeck());

    public Card getCardFromDeck(){
        Random randomCard = new Random(System.currentTimeMillis());
        Card matchedCard = deck.get(randomCard.nextInt(deck.size()));
        removeCard(matchedCard);
        return matchedCard;
    }
    public void removeCard(Card card){
        deck.remove(card);
    }

    public void restartDeck(){
        this.deck = generateDeck();
    }

    public void showDeck(){
        for (Card x: deck) {
            System.out.println(x);
        }
    }

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

    public int size(){
        return deck.size();
    }
}
