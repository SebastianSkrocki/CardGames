package com.sebastianskrocki.blackjack;



public class Game {
    public static void main(String[] args) {
        startGame();

    }

    public static void startGame(){
        Deck deck = new Deck();
        Player playmaker = new Player("Playmaker");
        System.out.println("Your name: ");
        Player player = new Player("Gracz");
        //deck.showDeck();
        playmaker.drawCard(deck);
        playmaker.drawCard(deck);
        playmaker.drawCard(deck);
        System.out.println(deck.size());
        playmaker.showHand();
        deck.showDeck();
        deck.restartDeck();
        System.out.println(deck.size());
        deck.showDeck();
    }
}
