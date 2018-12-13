/* Write a Java assignment statement to calculate a 35% discount on an item’s value stored in the variable newItem, store the discount amount in a variable called discount. Then calculate the new price for the item subtracting off the discount, storing the new price in a variable called newItemPrice. */

public class Discount {

		public float checkItemPrice(int price) {
			float discount =(price*35)/100;           //calculate discount.
			float newItemPrice =  price- discount;	  // calculate new price of item after getting discount.
			return newItemPrice;
		}
}
