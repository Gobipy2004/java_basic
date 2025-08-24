import java.util.Scanner;
class wh
{
	static Scanner w=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.print("enter number:");
		int a=w.nextInt();
		System.out.println("Processing.....");
		Thread.sleep(2000);
		if (a>=3&&a<=5)
		{
			System.out.println("Summer");
		}
		else if (a>=6&&a<=8)
		{
			System.out.println("winter");
		}
		else if (a>=9&&a<=12)
		{
			System.out.println("rainy");
		}
		else if (a>=1&&a<=2)
		{
			System.out.println("rainy");
		}
		else if (a>12||a<=0)
		{
			System.out.println("invalid");
		}
		
	}
}
