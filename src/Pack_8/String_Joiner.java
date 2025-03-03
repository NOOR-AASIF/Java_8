package Pack_8;

import java.util.StringJoiner;

public class String_Joiner {
	
	public static void main(String[] args) {
		
		StringJoiner sj=new StringJoiner(",");
		sj.add("vasanth");
		sj.add("Melwyn");
		sj.add("Ramji");
		sj.add("Sanjay");
		
		System.out.println(sj);
		
		StringJoiner sj2=new StringJoiner(":","{","}");
		sj2.add("vasanth");
		sj2.add("Melwyn");
		sj2.add("Ramji");
		sj2.add("Sanjay");
		
		System.out.println(sj2);
	}

}
