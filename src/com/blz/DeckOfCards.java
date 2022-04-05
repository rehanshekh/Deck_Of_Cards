package com.blz;


public class DeckOfCards {
    public static void main(String[] args) {
        Game poker = new Game();
        poker.setup();
        poker.addPlayers();
        poker.shuffle();
        poker.playGame();
        poker.display();
    }
}
