package Pack_8;

//Lambda => anonymous(nameless) function -> no access Specifier,no name,no return type
//Lambda -> Anonymous -> Closure [all are same]
//use : provide implementation of Functional Interface,less code

//FI => interface which contain only one abstract method => Runnable(run),Comparable(compareTo),Callable(call),ActionListener(actionPerformed)

@FunctionalInterface
interface message
{
	void msg();
	//void hello();
}
public class Lambda_Expression 
{
//	public void msg()
//	{
//		System.out.println("hello welcome to Java 8");
//	}
	public static void main(String[] args) 
	{
//		Lambda_Expression objj=new Lambda_Expression();
//		objj.msg();
	
		
		//message obj=()->{System.out.println("hello welcome to Java 8");};
		
		//message obj=()->System.out.println("hello welcome to Java 8");
		
		message obj=()->{
			System.out.println("hello welcome to Java 8");
			System.out.println("Welcome to JDBC");
		};
		obj.msg();
		
	}

	
	  

}
