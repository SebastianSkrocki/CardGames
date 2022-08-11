package com.sebastianskrocki.blackjack;

public class Card {
    private Suit suit;
    private Rank rank;


    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return this.suit + this.rank.toString() + this.rank.getValue();
    }

    public static void main(String[] args) {
        Card card1 = new Card(Suit.DIAMONDS,Rank.JACK);
        System.out.println(card1);

        System.out.println(card1.suit.toString());
        System.out.println("\u2666");
    }
}
