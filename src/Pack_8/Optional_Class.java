package Pack_8;

import java.util.Optional;

public class Optional_Class {
	
	public static void main(String[] args)
	{
		
		String a[]=new String[3];
		a[0]="Vasanth";
		a[1]="melwyn";
		
		System.out.println(a[0].toUpperCase());
		//System.out.println(a[2].toUpperCase());
		
		Optional<String> obj=Optional.ofNullable(a[2]);
		
		if(obj.isPresent())
		{
			System.out.println(a[2].toUpperCase());
		}
		else
		{
			System.out.println("There is no value..");
		}
		
		Optional op=Optional.of(12);
		System.out.println(op.get());
		System.out.println(op=op.empty());
		System.out.println(op);
	}

}
