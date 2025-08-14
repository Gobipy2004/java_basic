class gobi
{
	public static void main(String[]args)
	{
		System.out.println("\nsimple account");
		System.out.println("atm:");
		System.out.println("----------------------------------------------");
		float total;
		double amount=3006.74;
		System.out.println("initaial amount\t:"+amount);
		double withdraw=1500;
		System.out.println("withdraw amount\t:"+withdraw);
		total=(float)amount-(float)withdraw;
		System.out.println("balance amount\t:"+total);
		System.out.println("-------------------------------------------------");
	}
}
