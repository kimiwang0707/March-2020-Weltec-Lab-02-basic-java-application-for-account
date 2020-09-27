
public class PetrolPurchase
{
	private String location;
	private String petrolType;
	private double litrePrice;
	private double discount;
	private int purchaseQty;
	private double purchaseAmount;
	
	public PetrolPurchase(String location, String petrolType, double litrePrice, double discount, int purchaseQty, double purchaseAmount)
	{
		this.location = location;
		this.petrolType = petrolType;
		if (litrePrice > 0) 
		{
			this.litrePrice = litrePrice;
		}
		if (discount > 0 && discount <= 100) 
		{
			this.discount = discount;
		}
	    if (purchaseQty > 0)
	    {
	    	this.purchaseQty = purchaseQty; 
	    }
	 }		
		public void setLocation(String location) 
		{
			this.location = location;
		}
		public String getLocation()
		{
			return location;
		}
		public void setPetrolType(String petrolType) 
		{
			this.petrolType = petrolType;
		}
		public String getPetrolType() 
		{
			return petrolType;
		}
		public void setLitrePrice(double litrePrice)
		{
			this.litrePrice = litrePrice;
		}
		public double getLitrePrice()
		{
			return litrePrice;
		}
		public void setDiscount(double discount)
		{
			this.discount = discount;
		}
		public double getDiscount()
		{
			return discount;
		}
		public void purchase(int purchaseQty)
		{
			if (purchaseQty > 0) 
			{
			    this.purchaseQty = purchaseQty;
				purchaseAmount = litrePrice * purchaseQty * (100 - discount) / 100;
			}
		}
		public int getPurchaseQty()
		{
			return purchaseQty;
		}
		public double getPurchaseAmount()
		{
			return purchaseAmount;
	}
		
}
