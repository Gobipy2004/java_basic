import java.util.Scanner;
class finding
{
	static Scanner fi=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.println("\nFinding");
		System.out.print("Enter here to find what:");
		char find=fi.next().charAt(0);
		String res= find>=48&&find<=56?"number":find>=65&&find<=90?"letters":find>=97&&find<=122?"Letters":find>=32&&find<=47?"special character":find>=128&&find<=255?"special character":"another";
		System.out.println("Processing......");
		Thread.sleep(1000);
		System.out.println(res);
			
	}
}
