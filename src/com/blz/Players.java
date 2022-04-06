package com.blz;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Integer> typeMap = new HashMap<>();
        for (String card : cards) {
            String name = (card.split("\\(")[1]);
            if (typeMap.containsKey(name)) {
                typeMap.put(name, typeMap.get(name) + 1);
            } else {
                typeMap.put(name, 1);
            }

        }System.out.print(this.getName()+" ");
        for (Map.Entry<String,Integer>entry:typeMap.entrySet()){
            System.out.print(entry.getKey()+"=>"+entry.getValue()+" ");
        }
        System.out.println();
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
