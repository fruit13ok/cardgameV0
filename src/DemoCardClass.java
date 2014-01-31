public class DemoCardClass
{
	//contain a hand of 13 cards
	static Card[] niceHand = new Card[13];
	static int niceHandIndex = 0;
	public static void main(String[] args)
	{
		//create 9 cards ace, 2, 3 in diamond, club, heart with nested for loop
		for(int suit = 1; suit <= 3; suit++)
		{
			for(int value = 1; value <= 3; value++)
			{
				niceHand[niceHandIndex] = new Card(suit, value);
				niceHandIndex++;
			}
		}
		//create 4 cards both jokers and 2 wildcards
		niceHand[niceHandIndex++] = new Card(-1, -1);
		niceHand[niceHandIndex++] = new Card(-2, -2);
		niceHand[niceHandIndex++] = new Card();
		niceHand[niceHandIndex++] = new Card();
		//change the 2 wildcards to spade 6, diamond 6
		if(niceHand[11].getValueInt() == 0)
		{
			niceHand[11] = new Card(4, 6);
		}
		if(niceHand[12].getSuitInt() == 0)
		{
			niceHand[12] = new Card(3, 6);
		}
		//display cards
		while(niceHandIndex > 0)
		{
			System.out.print("card " + niceHandIndex + "\t: ");
			System.out.println(niceHand[niceHandIndex-1].getSuitString() + ", " + niceHand[niceHandIndex-1].getValueString());
			niceHandIndex--;
		}
	}
}