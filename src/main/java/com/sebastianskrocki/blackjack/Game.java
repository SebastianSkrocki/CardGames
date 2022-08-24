package com.sebastianskrocki.blackjack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame(){
        Player playmaker = new Player("Playmaker");
        System.out.print("Your name: ");
        Player player = new Player("Gracz");
        playmaker.drawCard();
        playmaker.drawCard();
        playmaker.drawCard();
        playmaker.showHand();
    }
}
