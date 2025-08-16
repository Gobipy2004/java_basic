class in
{
	public static void main(String[] args)
	{
		int a=10;
		int b=(++a + ++a)+ ++a;
		int c=(++b + b)+ ++a;
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		System.out.println("C:"+c);
		
	}
}
