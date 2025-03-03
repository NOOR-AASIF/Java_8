package Pack_8;

import java.util.function.BiPredicate;

// take a two argument and return a boolean(true/false) value.
// it's in java.util.function.BiPredicate
public class BiPredicate_1 {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer>odd_Check=(a,b)->a%2==1 && b%2==1;
		System.out.println(odd_Check.test(10, 11));
		
		BiPredicate<Integer,Integer>odd2_Check=(a1,b1)->{ 
			int c=a1+b1;
			return c%2==1;
		};
		System.out.println(odd2_Check.test(15, 20));
		
		BiPredicate<Integer,String>compare=(val,name)->name.length()==val;
		System.out.println(compare.test(6, "Melwyn"));
		
		BiPredicate<Integer,Integer>greater_100=(val1,val2)->{
			int sum=val1+val2;
			return sum>100;
		};
		System.out.println(greater_100.test(20, 81));
		
		
		
	}

}
