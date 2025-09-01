import java.util.Scanner;
class Mult
{
	static Scanner multi = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\n\t\t\t*******Multiplication*******");
		System.out.print("\n\t\t\tEnter Which Number Mutiplication You Want: ");
		int table = multi.nextInt();
		System.out.println("Processing.....");
		Thread.sleep(3000);
		for (int a=1;a<=10 ;a++ )
		{
			//int c=a;
			//System.out.println(a);
			System.out.println(a+"*"+table+"="+(a*table));
			//System.out.println(a + " * " + table + " = " + (a * table));

		}
	}
}
