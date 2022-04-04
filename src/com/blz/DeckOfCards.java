package com.blz;

import java.util.Scanner;

public class DeckOfCards {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] deck = new String[4][13];
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[i][j] = rank[j] + "(" + suit[i] + ")";
            }
        }
        print(deck, suit, rank);
        addPlayers();
    }


    private static void print(String[][] deck, String[] suit, String[] rank) {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                System.out.print(deck[i][j]);
            }
            System.out.println();
        }
    }

    private static void addPlayers() {
        Players[] player = new Players[4];
        for (int i = 1; i <= player.length; i++) {
            System.out.println("Enter the name of the " + i + " player");
            String name = in.next();
            player[i] = new Players(name);
        }

    }
}
