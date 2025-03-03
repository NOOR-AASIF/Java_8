package Pack_8;

@FunctionalInterface
interface Subtract1  
{
	int sub(int a,int b);
	default void vasanth()
	{
		System.out.println("This is a vasanth method...");
	}
	static void melwyn()
	{
		System.out.println("This is a Melwyn method...");
	}
}
public class Default_Static 
{
	public static void main(String[] args) 
	{	
		Subtract1 ss= (a,b)-> a-b;
		System.out.println(ss.sub(20, 10));
		ss.vasanth();
		Subtract1.melwyn();
	}
}