package com.alpha.work2;

public class Runner {
    public void run(){
        int CardNumber = 0;
        for (Suit suit:Suit.values()
        ) {
            for (Rank rank :Rank.values()
                 ) {
                CardNumber++;
                System.out.print(CardNumber);
                System.out.println( new Card(suit,rank));
            }
        }
    }
}
