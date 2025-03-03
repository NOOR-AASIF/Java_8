package Pack_8;

import java.util.function.BiFunction;

public class BiFunction_1 {
	
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Boolean>even_Check=(num1,num2)->{
			int num=num1+num2;
			return num%2==0;
		};
		System.out.println(even_Check.apply(10, 20));
		
		BiFunction<Integer,String,Boolean>char_length=(val,name)->val==name.length();
		System.out.println(char_length.apply(6, "Melwyn"));
		
		BiFunction<Integer,Integer,Boolean>odd_Compare=(val1,val2)->val1%2==1 && val2%2==1;
		System.out.println(odd_Compare.apply(20, 21));
		
		BiFunction<Integer,Integer,Integer>add=(num1,num2)->num1+num2;
		System.out.println(add.apply(20,8));
		
		BiFunction<Integer,Integer,Integer>char_size=(n1,n2)->{
//			String s=n1.toString();
//			String s2=n2.toString();
//			int s3=s.length()+s2.length();
			String s=n1.toString()+n2.toString();
			return s.length();
		};
		System.out.println(char_size.apply(12312, 321));
	}

}
