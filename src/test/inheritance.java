package test;
		
class A
{
	int a=20;
	void main()
	{
		int x=30;
		System.out.println(x);
	}
}
public class inheritance extends A
{

	public static void main(String[] args) 
	{
		inheritance obj = new inheritance();
		obj.main();
		System.out.println(obj.a);
				
	}

}
