package repaso;

public class Ejericicio1 
{

	public static void main(String[] args) 
	{
		try {
			int a= 1;
			int b= 0;
			
			long divisiaoh = a/b;
			
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("La cagaste we!");
		}
	}

}
