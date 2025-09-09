import java.util.*;
class Zomato
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("\n\t\t\t\t\tZOMATO");
		
		login();
	}
	public static void login()
	{
		System.out.println("\n\t\t\t\t1.singup||2.singin");
		System.out.print("Enter login Option: ");
		int login=sc.nextInt();
		boolean option=true;
		switch (login)
		{
		case 1->{
			singup();
		}
		case 2->{
			singin();
		}
		default->{
			System.out.println("invalid login option");
			login();
		}
		}
	}
	public static void singup()
	{
		System.out.print("Enter Mobile Number: ");
		long phone=sc.nextLong();
		if (phone>=1111111111l&&phone<=9999999999l)
		{
			System.out.print("Enter Age: ");
			int age=sc.nextInt();
			if (age>=18)
			{
				int otp=(int)(Math.random()*999+999);
				System.out.println(otp);
				System.out.print("Enter Otp: ");
				int OTP=sc.nextInt();
				if (otp==OTP)
				{
					hotels();
				}
				else
				{
					System.out.println("\t\t\totp is not matched");
					singup();
				}
			}
			else
			{
				System.out.println("\t\t\tAge Must be 18 or Above");
				singup();
			}
		}
		else
		{
			System.out.println("\t\t\tMobile Number Must Be 10 Digits");
			singup();
		}
	}
	public static void singin()
	{
		
		int attemp=1;
		while (attemp<=3)
		{
			int password=2004;
			System.out.print("Enter Password: ");
			int pass=sc.nextInt();
			if (password==pass)
			{
				hotels();
				break;
			}
			else
			{
				
				System.out.println("password not matching");
				attemp++;
				if (attemp>3)
				{
					System.out.println("Access denid");
				}
				
			}
			
		}
		
		
	}
	public static void hotels()
	{
		
	}
}
