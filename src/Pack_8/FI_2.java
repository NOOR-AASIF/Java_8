package Pack_8;

@FunctionalInterface
interface Adding
{
	void add(int a,int b);
}

public class FI_2 
{

//	@Override
//	public void add(int a, int b) 
//	{
//		int c=a+b;
//		System.out.println(c);
//	}
	
	public static void main(String[] args)
	{
		Adding obj=(a,b)->System.out.println(a+b);
		obj.add(20, 10);
	}
	
}
