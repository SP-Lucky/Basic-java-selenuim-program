package test;
class ride
{
	int a=1;
	void main()
	{
		int c=20;
		System.out.println(+c);
	}
}
class bike extends ride
{
	int b=1;
    void main()
    {
    	int b=10;
    	System.out.println(+b);
    }
}
public class Override 
{

	public static void main(String[] args) 
	{
		
		bike obj=new bike();
		obj.main();
		System.out.println(obj.a);
		obj.main();
	}

}
