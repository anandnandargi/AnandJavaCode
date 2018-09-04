package SimpleJavaProg;

public class NationalBank implements RBI, WorldBank {
	
	public void saving()
	{
		System.out.println("Saving A/c");
	}
	
	public void fixed()
	{
		System.out.println("Fixed A/c");
	}
	
	public void current()
	
	{
		System.out.println("Current A/c");
	}
	
	public void donation()
	{
		System.out.println("WorldBank Donation");
	}
	
	public void fund()
	{
		System.out.println("World Bank Funds");
	}
	public static void main(String[] args)
	{

		RBI bank= new NationalBank();
		NationalBank nb=new NationalBank();
		nb.donation();
		nb.fund();
		bank.current();
		bank.saving();
		bank.fixed();
		
	}

}
