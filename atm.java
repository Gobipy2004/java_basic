import java.util.Scanner;
class atm
{
	static Scanner p=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.println("\n\tAtm Banking");
		System.out.println("Welcom To Canara Bank");
		System.out.print("Enter Your 4 Digits Pin:");
		int a=p.nextInt();
		float amount=2446.74f;
		int pin=2004;
		
		System.out.println("Processing.....");
		Thread.sleep(1000);
		if (a==pin)
		{
			System.out.println("\n1-Withdraw\n2-Deposite\n3-Balance\n4-Statement");
			System.out.print("\n\tEnter Above Options:");
			int o=p.nextInt();
			if (o==1)
			{
				System.out.print("Enter Withdraw Amount:");
				float withdraw=p.nextFloat();
			
			
					if (withdraw<=2446.74)
					{
						amount-=withdraw;
						System.out.println("wait.......");
						Thread.sleep(1000);
						System.out.println("Withdraw successfully,current balance is:"+amount);
						
					}
					else
					{
						
						System.out.println("Wait.....");
						Thread.sleep(3000);
						System.out.println("insufficent amount,your balance is:"+ amount);
						
					}
				
				
				
			}
			if (o==2)
			{
				System.out.print("Enter Deposite Amount:");
				float deposite=p.nextFloat();
				amount+=deposite;
				System.out.println("Wait.......");
				Thread.sleep(3000);
				System.out.println("Deposite successfully,Balance is:"+amount);
			}
			if (o==3)
			{
				System.out.println("wait");
				Thread.sleep(2000);
				System.out.print("your balance is:"+amount);
			}
			if (o==4)
			{
				System.out.println("wait......");
				Thread.sleep(3000);
				System.out.print("your Statement is Currently not Available");
			}
		
		}
		else
		{
			
			System.out.println("\'Invalid Pin\' Kindly Check your Pin");
		}
	}
}
