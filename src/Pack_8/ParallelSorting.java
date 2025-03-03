package Pack_8;

import java.util.Arrays;

public class ParallelSorting {
	
	public static void main(String[] args) {
		
		int a[]= {10,2,4,20,12,13,11,15};
		
//		Arrays.parallelSort(a);
//		for(int s:a)
//		{
//			System.out.println(s);
//		}
		Arrays.parallelSort(a,2,6);
		System.out.println("...................");
		for(int b:a)
		{
			System.out.println(b);
		}
		
	}

}
