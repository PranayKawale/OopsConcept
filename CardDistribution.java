package com.bridgelabz;

import java.util.Random;

public class CardDistribution {
	int arr[][] = new int[4][13];
	void DistrubuteCardsplayers(int num){
		for(int i=0;i<9;i++){
			giveCards(num);
		}
	}

	void giveCards(int num){
		Random random = new Random();


		int suit = random.nextInt(4);
		int Rank = random.nextInt(13);
		if (arr[suit][Rank]!=0) {
			giveCards(num);
		}
		else {
			arr[suit][Rank]=num;
		}
	}
	void showCards(int num){
		for(int suit=0;suit<4;suit++){
			for(int Rank=0;Rank<13;Rank++){
				if (arr[suit][Rank]==num){
					System.out.println(getSuit(suit)+""+getRank(Rank)+"\t");
				}
			}
		}
	}
	String getSuit(int SuitNum)
	{
		switch (SuitNum){
		case 0:
			return "Clubs";
		case 1:
			return "Dimond";

		case 2:
			return "Hearts";
		case 3:
			return "Spades";

		default:
			return "";

		}

	}
	String getRank(int Ranknum)
	{
		switch (Ranknum){
		case 0:
			return "2";
		case 1:
			return "3";
		case 2:
			return "4";
		case 3:
			return "5";
		case 4:
			return "6";
		case 5:
			return "7";
		case 6:
			return "8";
		case 7:
			return "9";
		case 8:
			return "10";
		case 9:
			return "jack";
		case 10:
			return "queen";
		case 11:
			return "king";
		case 12:
			return "Aca";
		default:
			return "";
		}
	}
}
