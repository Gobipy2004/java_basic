import java.util.Scanner;
class fact
{
	static Scanner o = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\n\t\t\tFoactoria");
		System.out.print("\n\t\t\tEnter Number TO find Factoria Number: ");
		int a = o.nextInt();
		int sum=0;
		for (int c=1;c<=a ;c++ )
			sum=sum+c;
		{
			//System.out.println(
			System.out.println(sum);
		}
		
	}
}
