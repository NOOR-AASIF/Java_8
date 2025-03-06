package Pack_8;

import java.util.function.Supplier;

//it is a Functional interface -> get()
//it provides the result without accepting any input
public class Supplier_1 {
	
	public static void main(String[] args) {
		
		Supplier<String>sup=()->"This is a Supplier..";
		System.out.println(sup.get());
		
		Supplier<Double>randomnum=()->Math.random()*100;
		System.out.println(randomnum.get());
	}

}
