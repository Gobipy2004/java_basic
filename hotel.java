import java.util.Scanner;
class hotel
{
	static Scanner w = new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		boolean hotel=true;
		do
		{
			System.out.println("Hotels:\n\t1.a2b\n\t2.kfc\n\t3.pams\n\t4.exit");
			System.out.print("Select hotel name:");
			int a = w.nextInt();
			switch (a)
			{
			case 1->{
				System.out.println("Processing....");
				Thread.sleep(2000);
				System.out.println("\t\t\tgreeating from a2b hotel");
				boolean a2b=true;
				do
				{
					
					System.out.println("\t\t\t1.chiken biriyani\n\t\t\t2.mutton biriyani\n\t\t\t3.exit");
					System.out.print("enter option here: ");
					int b = w.nextInt();
					switch (b)
					{
					case 1->{
						System.out.println("chiken biriyani price is 150rs");
					}
					case 2->{
						System.out.println("Mutton biriyani price is 200rs");
					}
					case 3->{
						a2b=false;
					}
					default->{
						System.out.println("invalid optaion");
					}
					}
				}
				while (a2b);
			}
			case 2->{
				System.out.println("Processing....");
				Thread.sleep(2000);
				System.out.println("\t\t\tgreeating from kfc hotel");
				boolean kfc=true;
				do
				{
					
					System.out.println("\t\t\t1.fried chiken\n\t\t\t2.chiken pizza\n\t\t\t3.exit");
					System.out.print("enter option here: ");
					int b = w.nextInt();
					switch (b)
					{
					case 1->{
						System.out.println("fried chiken price is 200rs");
					}
					case 2->{
						System.out.println("chiken pizza price is 250rs");
					}
					case 3->{
						kfc=false;
					}
					default->{
						System.out.println("invalid optaion");
					}
					}
				}
				while (kfc);
			}
			case 3->{
				System.out.println("Processing....");
				Thread.sleep(2000);
				System.out.println("\t\t\tgreeating from pams hotel");
				boolean pams=true;
				do
				{
					
					System.out.println("\t\t\t1.dosa\n\t\t\t2.idly\n\t\t\t3.exit");
					System.out.print("enter option here: ");
					int b = w.nextInt();
					switch (b)
					{
					case 1->{
						System.out.println("dosa price is 30rs");
					}
					case 2->{
						System.out.println("idly price is 10rs");
					}
					case 3->{
						pams=false;
					}
					default->{
						System.out.println("invalid optaion");
					}
					}
				}
				while (pams);
			}
			case 4->{
				hotel=false;
				System.out.println("Processing....");
				Thread.sleep(2000);
				System.out.println("\t\t\tthank for using swigyy");
			}
			default->{
				System.out.println("Processing....");
				Thread.sleep(2000);
				System.out.println("\t\t\tinvalid option");
			}
			}
		}
		while (hotel);
		
	}
}
