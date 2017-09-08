public class retail_shop {
	
	public static void main(String[] args) {
		int shoes = 200, t_shirt = 75, suit = 500;
		double price;
		
		price = ( (shoes * 2) + (t_shirt) + (suit * 3));
		//price = price - (.1 * price); //There is an offer of 10 percent off cost price and this is how it is calculated by the computer.
		//price = price + (.05* price); //This is adding on 5 percent tax to the total cost.
		
		System.out.println("The total cost for new clothes is " + price);
	}
}