package Pack_8;

@FunctionalInterface
interface Subtract
{
	int sub(int a,int b);
}
public class FI_3 
{
	public static void main(String[] args) 
	{
//		Subtract ss=(a,b)->{
//			return a-b;
//		};
		
		Subtract ss= (a,b)-> a-b;
		System.out.println(ss.sub(20, 10));
	}
}
