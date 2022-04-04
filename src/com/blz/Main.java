package com.blz;

public class Main {

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
    }

    private static void print(String[][] deck, String[] suit, String[] rank) {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                System.out.print(deck[i][j]);
            }
            System.out.println();
        }
    }
}
