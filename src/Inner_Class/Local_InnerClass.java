package Inner_Class;

public class Local_InnerClass {
	
	private int a=20;
	
	void display()
	{
		System.out.println("This is outer class display..");
		class Inner
		{
			void show()
			{
				System.out.println("This is a inner class show method "+a);
			}
		}
		Inner obj=new Inner();
		obj.show();
	}
	
	public static void main(String[] args) {
		Local_InnerClass object=new Local_InnerClass();
		object.display();
		
	}

}
