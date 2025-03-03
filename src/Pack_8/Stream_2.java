package Pack_8;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) 
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public String toString()
	{
		return id+" "+name+" "+price;
	}
	
}
public class Stream_2 {
	
	public static void main(String[] args) {
		ArrayList<Product> pro=new ArrayList<>();
		pro.add(new Product(1,"HP",45000));
		pro.add(new Product(2,"Lenova",55000));
		pro.add(new Product(3,"Dell",35000));
		pro.add(new Product(4,"Mac",95000));
		pro.add(new Product(5,"Acer",65000));
		
		pro.forEach(System.out::println);
		
		double sumPrice=pro.stream()
		                   .collect(Collectors.summingDouble(a->a.price));
		System.out.println("Sum of the price :"+sumPrice);
		
		int sumId=pro.stream()
				   .collect(Collectors.summingInt(a->a.id));
				System.out.println("Sum of the id :"+sumId);
				
		double avgPrice=pro.stream()
				           .collect(Collectors.averagingDouble(a->a.price));
		System.out.println("Average of the price :"+avgPrice);
		
		long count=pro.stream()
		              .collect(Collectors.counting());
		System.out.println("The total count :"+count);
		
	}

}
