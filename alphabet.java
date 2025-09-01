import java.util.Scanner;
class alpha
{
	static Scanner A = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\n\t\t\tAlphabet Series");
		//System.out.print("\n\t\t\tEnter Your Starting Alphabet char: ");
		//char a = A.next().charAt(0);
		for (char i='A';i<='Z' ;i++ )
		{
			System.out.println(i);
		}
	}
}
