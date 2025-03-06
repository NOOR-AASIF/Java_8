package Pack_8;

import java.util.ArrayList;
import java.util.function.Consumer;

//it is a functional interface -> accept()
//take a single argument and return no result
//perform printing or modifying data on an input. 
public class Consumer_1 {
	
	public static void main(String[] args) {
		
		Consumer<String>printConsumer=s->System.out.println(s);
		printConsumer.accept("Welcome to Java");
		
		Consumer<Integer>printConsumer1=s->System.out.println(s);
		printConsumer1.accept(27);
		
		ArrayList<String>names=new ArrayList<String>();
		names.add("Vasanth");
		names.add("Melwyn");
		names.add("Kumar");
		
		Consumer<String>toUpper=names1->System.out.println(names1.toUpperCase());
		names.forEach(toUpper);
		
		
	}

}
