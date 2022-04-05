package com.blz;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static Scanner in = new Scanner(System.in);
    String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[][] deck = new String[4][13];
    int noOfPlayers;
    int noOfCards;
    Players[] player;

    public Game() {
    }

    public Game(int noOfPlayers, int noOfCards, String[][] deck) {
        this.noOfPlayers = noOfPlayers;
        this.noOfCards = noOfCards;
        this.deck = deck;
    }

    public void print() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                System.out.print(deck[i][j]);
            }
            System.out.println();
        }
    }

    public void playGame() {
        int i = 0;
        int k = 0;
        int j = 0;
        while (i < suit.length) {
            for (Players eachPlayer : player) {
                if (k == 13) {
                    i++;
                    k = 0;
                }
                if (i == 4) {
                    break;
                }
                eachPlayer.cards[j] = deck[i][k];
                k++;
            }
            j++;
            if (j == noOfCards) {
                break;
            }
        }
    }


    public void setup() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[i][j] = rank[j] + "(" + suit[i] + ")";
            }
        }
    }


    public void addPlayers() {
        System.out.println("Enter the number of players to participate");
        noOfPlayers = in.nextInt();
        if (noOfPlayers >= 2 && noOfPlayers <= 4) {
            player = new Players[noOfPlayers];
            for (int i = 0; i < noOfPlayers; i++) {
                System.out.println("Enter the name of the " + i + " player");
                String name = in.next();
                noOfCards = (52 / noOfPlayers);
                player[i] = new Players(name, noOfCards);
            }
        } else {
            System.out.println("Illegal input");
        }
    }

    public void display() {
        for (Players player : player)
            System.out.println(player.getName() + " " + Arrays.toString(player.cards));
    }
}