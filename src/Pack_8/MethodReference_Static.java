package Pack_8;

@FunctionalInterface
interface Message2
{
	void sum(int a,int b);
}
public class MethodReference_Static
{
//	static public void mms()
//	{
//		System.out.println("Welcome to a message method....");
//	}
	
	static public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
//		Message2 obj=()->System.out.println("Welcome to Java 8");
//		obj.msg();
		Message2 obj=MethodReference_Static::add;
		obj.sum(20,10);
	}

}
