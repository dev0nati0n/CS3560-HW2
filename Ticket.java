public class Ticket implements SaleableItem // Question 5f
{
	public Ticket()
	{
		// no fields to fill
	}
	
	@Override
	public void sellCopy()
	{
		System.out.println("Selling a ticket");
	}
}
