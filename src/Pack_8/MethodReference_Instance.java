package Pack_8;

interface Message3
{
	void sum(int a,int b);
}

public class MethodReference_Instance {
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		MethodReference_Instance object=new MethodReference_Instance();
		Message3 obj=object::add;
		obj.sum(10, 30);
	}

}
