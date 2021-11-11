package com.bridgelabz;

public class DeckOfCards {
	private static int num;

    public static void main(String[] args){
   CardDistribution distrubuteCards = new CardDistribution();
    for (num=1;num<=4;num++)
    {
        distrubuteCards.DistrubuteCardsplayers(num);
        System.out.println("Players :"+num+ "cards:");
        distrubuteCards.showCards(num);

    }


}

}
