import java.util.Scanner;
class odd
{
	static Scanner l=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.print("enter number:");
		int a=l.nextInt();
		System.out.println("Procesing...");
		Thread.sleep(1000);
		if(a%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
