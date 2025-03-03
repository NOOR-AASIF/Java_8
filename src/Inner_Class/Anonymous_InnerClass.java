package Inner_Class;

//abstract class Person
//{
//	abstract void eat();
//}

interface Person
{
	void eat();
}

public class Anonymous_InnerClass
{
	public static void main(String[] args) 
	{
		
		Person p=new Person()
		{
			public void eat()
			{
				System.out.println("This is a Eat Method..");
			}
		};
		p.eat();
	}
	
}
