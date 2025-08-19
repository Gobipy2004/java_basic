import java.util.Scanner;
class Student
{
	static Scanner stu = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("\t\t\tStudent_Details");
		System.out.print("\tEnter Student Id:");
		int id=stu.nextInt();
		System.out.print("\tEnter Mark:");
		double mark=stu.nextDouble();
		System.out.print("\tEnter Student Phone Number:");
		long phone=stu.nextLong();
		System.out.print("\tEnter Gender:");
		char gender=stu.next().charAt(0);
		System.out.println("Student Id Is:"+id);
		System.out.println("Student Mark Is:"+mark);
		System.out.println("Student ph_no is:"+phone);
		System.out.println("Student Gender is:"+gender);
	}
}
