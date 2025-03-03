package Inner_Class;

class A
{
	private int a=10;
	void show() 
	{
		System.out.println("This is a show "+a);
	}
	
	class B
	{
		void display()
		{
			System.out.println("This is a display "+a);
		}
	}
}
public class Member_InnerClass {
	
	public static void main(String[] args) {
		
		A obj=new A();
		obj.show();
		A.B obj1=obj.new B();  //outerclass.innerclass object=new outerclass().new innerclass();
	//  A.B obj1=new A().new B();
		obj1.display();
	}

}
