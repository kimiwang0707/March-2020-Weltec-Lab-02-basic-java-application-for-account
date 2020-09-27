import java.util.Scanner;

public class PetrolPurchaseTest 
{
	public static void main(String[] args)
	{
	PetrolPurchase purchase1 = new PetrolPurchase("Porirua", "#91", 2.248, 10.00, 0, 0);
		System.out.printf("Station's Location: %s%nType of Petrol: %s%nPrice per Litre: $%.3f%nPercentage Discount: %.0f%%%n",
	                      purchase1.getLocation(), purchase1.getPetrolType(), purchase1.getLitrePrice(), purchase1.getDiscount());
	
		Scanner input = new Scanner(System.in);
		System.out.print("\nPlease enter the quantity of petrol you want to purchase in litres:");
		int purchaseQty = input.nextInt();
		purchase1.purchase(purchaseQty);
	    
		System.out.printf("%nStation's Location: %s%nType of Petrol: %s%nPrice per Litre: $%.3f%nPercentage Discount: %.0f%%%n%n" +
                "The Quantity of Purchase in Litres: %dL%nPurchase Amount: $%.3f%n", purchase1.getLocation(), 
                purchase1.getPetrolType(), purchase1.getLitrePrice(), purchase1.getDiscount(),
                purchase1.getPurchaseQty(), purchase1.getPurchaseAmount());
		
	}
}
