package com.blz;

public class Players {
    String name;
    String[] cards;


    public Players(String name, int noOfCards) {
        this.name = name;
        this.cards = new String[noOfCards];
    }

    public String getName() {
        return name;
    }

    public void typeCard() {
        int clubCount = 0;
        int diamondCount = 0;
        int heartCount = 0;
        int spadeCount = 0;

        for (String card : cards) {
            switch (card.split("\\(")[1]) {
                case "Clubs)" -> clubCount = clubCount + 1;
                case "Diamonds)" -> diamondCount = diamondCount + 1;
                case "Hearts)" -> heartCount = heartCount + 1;
                case "Spades)" -> spadeCount = spadeCount + 1;
                default -> System.out.println("Illegal Input");
            }
        }
        System.out.println(this.getName() + " " + "Clubs:" + clubCount + ", " + "Diamonds:" + diamondCount + ", " + "Hearts:" + heartCount + ", " + "Spades:" + spadeCount);
    }

    public void sortedHand() {
        for (int i = 0; i < cards.length - 1; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                int firstNum = switch (cards[i].split("\\(")[0]) {
                    case "Jack" -> 11;
                    case "Queen" -> 12;
                    case "King" -> 13;
                    case "Ace" -> 14;
                    default -> Integer.parseInt(
                            cards[i].split("\\(")[0]);
                };
                int secondNum = switch (cards[j].split("\\(")[0]) {
                    case "Jack" -> 11;
                    case "Queen" -> 12;
                    case "King" -> 13;
                    case "Ace" -> 14;
                    default -> Integer.parseInt(
                            cards[j].split("\\(")[0]);
                };
                if (firstNum > secondNum) {
                    String temp = cards[i];
                    cards[i] = cards[j];
                    cards[j] = temp;
                }
            }
        }
    }
}
