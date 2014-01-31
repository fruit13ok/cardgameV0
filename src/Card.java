/**
 * Card class is one of core parent class, declare the property of a card, 
 * and create accessers to do something to the card.
 */
public class Card
{
	/**wild card suit and value represent in number, wildCard is placeholder can become any card*/
	public final static int wildCard = 0;
	
	/**jokers suit and value represent in number*/
	public final static int jokerColor = -1, jokerNoColor = -2;
	
	/**suits represent in number*/
   public final static int diamond = 1, club = 2, heart = 3, spade = 4;
   
   /**A, K, Q, J value, don't care cards 2 to 10*/
   public final static int jack = 11, queen = 12, king = 13, ace = 1;
   
   /**card property suit and value, other card game like UNO will be color and value*/
   private final int suit, value;
   
   /**default constructor create a card with no suit no value*/
   public Card()
   {
   	suit = 0;
   	value = 0;
   }
   
   /**constructor create card with given suit and value*/
   public Card(int givenSuit, int givenValue)
   {
   	if(!checkGivenSuit(givenSuit) || !checkGivenValue(givenValue))
   	{
   		System.out.println("wrong suit or value");
   		System.exit(1);
   	}
   	suit = givenSuit;
   	value = givenValue;
   }
   
   /**check if given suit is valid, card game that has differ suit should write child class inherit this class*/
   public boolean checkGivenSuit(int givenSuit)
   {
   	return(givenSuit == diamond || givenSuit == club || givenSuit == heart || givenSuit == spade || 
   			givenSuit == jokerColor || givenSuit == jokerNoColor || givenSuit == wildCard);
   }
   
   /**check if given value is valid, card game that has differ value should write child class inherit this class*/
   public boolean checkGivenValue(int givenValue)
   {
   	return(givenValue == ace || givenValue == king || givenValue == queen || givenValue == jack || 
   			givenValue == jokerColor || givenValue == jokerNoColor || givenValue == wildCard || 
   			(givenValue >= 2 && givenValue <= 10));
   }
   
   /**get suit int representation*/
   public int getSuitInt()
   {
      return suit;
   }
   
   /**get value int representation*/
   public int getValueInt()
   {
      return value;
   }
   
   /**get suit String representation*/
   public String getSuitString()
   {
   	switch (suit)
   	{
	      case diamond: return "diamond";
	      case club: return "club";
	      case heart: return "heart";
	      case spade: return "spade";
	      case jokerColor: return "colored joker";
	      case jokerNoColor: return "black and white joker";
	      default: return "wild card";
      }
   }
   
   /**get value String representation*/
   public String getValueString()
   {
   	switch (value)
   	{
	      case 1: return "ace";
	      case 2: return "2";
	      case 3: return "3";
	      case 4: return "4";
	      case 5: return "5";
	      case 6: return "6";
	      case 7: return "7";
	      case 8: return "8";
	      case 9: return "9";
	      case 10: return "10";
	      case 11: return "jack";
	      case 12: return "queen";
	      case 13: return "king";
	      case -1: return "colored joker";
	      case -2: return "black and white joker";
	      default: return "wild card";
      }
   }
}