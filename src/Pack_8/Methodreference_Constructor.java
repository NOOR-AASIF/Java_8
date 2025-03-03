package Pack_8;

interface Message4
{
	void add(int a,int b);
}
public class Methodreference_Constructor 
{
	Methodreference_Constructor(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		Message4 obj=Methodreference_Constructor::new;
		obj.add(10, 40);
	}
}
