public class Magazine implements SaleableItem // Question 5f
{
	public Magazine()
	{
		// no fields to fill
	}
	
	@Override
	public void sellCopy()
	{
		System.out.println("Selling a magazine");
	}
}
