package Pack_8;

import java.util.function.Function;

//function is a Functional interface -> apply(). java.util.function.Function
//it take a single argument and return any type of value.
public class Function_1 {
	
	public static void main(String[] args) {
		
		Function<Integer,Integer>cube=(val)->val*val*val;
		System.out.println(cube.apply(2));
		
		Function<Integer,Float>half=(num)->(float)num/2;
		System.out.println(half.apply(25));
		
		Function<Integer,Integer>add_Ten=(num)->num+10;
		System.out.println(add_Ten.apply(20));
		
		Function<Integer,Boolean>odd_Check=(num1)->{
			int num=num1*num1*num1;
			return num%2==1;
		};
		System.out.println(odd_Check.apply(3));
		
		Function<Integer,Integer>count_Digit=(n)->{
			int count=0;
			while(n!=0)    //   123           12          1      0
			{
				count++;  //   0+1=1         1+1=2      2+1=3
				n=n/10;   // 123/10=12      12/10=1    1/10=0
			}
			return count;
		};
		System.out.println(count_Digit.apply(254543513));
		
		Function<Integer,Integer>char_size=(n)->{
			String s=n.toString();
			return s.length();
		};
		System.out.println(char_size.apply(29282));
		
		
	}

}
