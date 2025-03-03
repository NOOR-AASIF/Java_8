package Pack_8;

import java.util.function.Predicate;

//@FunctionalInterface
//interface Predicate
//{
//	boolean test(int a); // take single argument and return true/false 
//}
//it's a functional interface->test(). java.util.function.Predicate
public class Predicate_1 {
	
//	public boolean above18(int age)
//	{
//		if(age>=18)
//			return true;
//		else
//			return false;
//	}
//	
	public static void main(String[] args) 
	{
		Predicate<Integer> above_18=(age)->age>18;
		System.out.println(above_18.test(20));
		
		Predicate<Integer>check_Odd=(value)->value%2==1;
		System.out.println(check_Odd.test(2314));
		
		Predicate<String>char_Length_Check=(name)->name.length()%2==1;
		System.out.println(char_Length_Check.test("Melwyn"));
		
		Predicate<String>name_Check=(name1)->name1=="Vasanth"|| name1=="Melwyn";
		System.out.println(name_Check.test("Aasif"));
		
		Predicate<Character>gender_Check=(gender)->gender=='m'|| gender=='f' || gender=='F' || gender=='M';
		System.out.println(gender_Check.test('m'));
		
		Predicate<String>gender1_Check=(gender1)->gender1.equalsIgnoreCase("m") || gender1.equalsIgnoreCase("f");
		System.out.println(gender1_Check.test("M"));
	}

}
