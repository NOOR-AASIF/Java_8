package Inner_Class;

public class Static_InnerClass 
{
	static private int data =10;
	
	static class Inner
	{
		void msg()
		{
			System.out.println("This is a inner class msg..."+data);
		}
	}
	public static void main(String[] args)
	{
		Static_InnerClass.Inner object=new Static_InnerClass.Inner();
		object.msg();
	}

}
