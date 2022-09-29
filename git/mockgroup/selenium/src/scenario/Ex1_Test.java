package scenario;

public class Ex1_Test 
{
	
	public static void main(String[] args)
	{
		int n=15;
		for(int i=1;i<=n;i++)
		{
			if(i%15==0)
			{
				System.out.println("fizzBuzz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else if(i%3==0)
			{
				System.out.println("fizz");
			}
			else
			{
				System.out.println(i);
			}
		
		}
		
	}

}
