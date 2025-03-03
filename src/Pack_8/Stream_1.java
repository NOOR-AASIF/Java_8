package Pack_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//stream ->  Filter ->   sort ->      map ->    collect
//            ^           ^            ^
//         Predicate   Comparator    Function
public class Stream_1
{
	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Vasanth");
		names.add("Melwyn");
		names.add("Sanjay");
		names.add("Ramji");
		names.add("Udhaya");
		
//		for(String s:names)
//		{
//			System.out.println(s);
//		}
		
//		System.out.println("Iteration using ForEach Method...");
//		names.forEach(s->System.out.println(s));
//		System.out.println("Iteration using method reference.....");
//		names.forEach(System.out::println);
		
		List<Integer> nums=Arrays.asList(2,3,11,6,8,7,2);
		
		nums.stream()
		    .filter(a->a%2==1) // predicate->take single argument return boolean value
		    .sorted()          // order the elements in ascending order
		    .map(a->a*2)       // function-> take single argument and return any type of value
		    .forEach(s->System.out.println(s)); // return the elements
		
	int sum=nums.stream()
		    .filter(a->a%2==1)
		    .sorted()
		    .map(a->a)
		    .reduce(0,(a,b)->a+b);
	System.out.println(sum);
	
	//Iterating using stream
	System.out.println("Iterating using stream");
	Stream.iterate(1, e->e+1)  // initial/starting value=1,increment plus one
	      .filter(e->e%3==0)   // divisible by 3
	      .limit(5)            // 3,6,9,12,15
	      .forEach(System.out::println);
	
	//Collectors->toList
	List<Integer>numList=nums.stream()
	    .filter(a->a%2==0)
	    .sorted()
	    .map(a->a*2)
	    .collect(Collectors.toList());
	System.out.println("Num as a list :"+numList);
	
	//Collectors->toSet
	Set<Integer>numSet=nums.stream()
		    .filter(a->a%2==0)
		    .sorted()
		    .map(a->a*2)
		    .collect(Collectors.toSet());
		System.out.println("Num as a set :"+numSet);
		
	
	long sumOfCount=nums.stream()
	    .filter(a->a%2==0)
	    .count();
	System.out.println("Sum Of Count :"+sumOfCount);
	}
	

}
