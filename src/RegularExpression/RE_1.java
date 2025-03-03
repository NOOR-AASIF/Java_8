package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//[abc]	a,b or c
//[^abc]  any character without a,b,c
//[A-Z]   capital A to Z
//[a-z]   small a to z
//[A-Z a-z] capital A-Z or small a-z
//[0-9]	Find one character from the range 0 to 9

// Quantifiers
//[abc]?  occurs 0 or 1 time
//[abc]+  occurs 1 or more times
//[abc]*  occurs 0 or more times
//[abc] {n}  occurs n times
//[abc] {n,} ocurrs n or more times
//[abc] {n,m} occurs atleast n times but less than m times

// meta character
//\d  -> [0-9]
//\D  -> [^ 0-9]
//\w  -> [a-z A-Z 0-9]
//\W  -> [^\w]

// Example -1 
// mobile number -> total ha 10 digit... first 9,6,8
// [9876][0-9]{9}

// Example - 2
//First Uppercase, contains lowecase , only one digit allowed in between.  // Vasanth5melwyn
//[A-Z][a-z]*[0-9][a-z]*

// Example -3 
// Email-id -----> svasanth29921@gmail.com
// [a-z 0-9]*[@][a-z]*[\.][a-z]{2,3}
public class RE_1 {
	
	public static void main(String[] args) {
		
		// 1st way
		Pattern p = Pattern.compile("..m"); // . is any one letter
		Matcher m=p.matcher("sqm");
		boolean b=m.matches();
		System.out.println(b);
		
		//2nd way
		boolean b1= Pattern.compile(".m.").matcher("smr").matches();
		System.out.println(b1);
		
		//3rd way
		boolean b2= Pattern.matches(".m.", "Tmr");
		System.out.println(b2);
		
		System.out.println(Pattern.matches(".m.", "Tmr"));  // t
		System.out.println(Pattern.matches(".m.", "Tks"));  // f
		System.out.println(Pattern.matches(".s", "asm"));   // f
		System.out.println(Pattern.matches(".s", "asms"));  // f
		System.out.println(Pattern.matches("[amn]", "am")); // f
		System.out.println(Pattern.matches("[amn]", "m"));   // t
		System.out.println(Pattern.matches("[amn]", "ammn")); // f
		System.out.println(Pattern.matches("[amn]?", "amn")); // t
		System.out.println(Pattern.matches("[amn]?", "ammnn")); // f
		System.out.println(Pattern.matches("[amn]?", "am"));	// t
		System.out.println(Pattern.matches("[amn]+", "ammnn"));  // t
		System.out.println(Pattern.matches("[amn]?", "mmmnn"));  // f
		System.out.println(Pattern.matches("[amn]*", "asg"));  // f
		System.out.println(Pattern.matches("[amn]*", "aammnn"));  // t
		System.out.println(Pattern.matches("\\d", "123"));  //f
		System.out.println(Pattern.matches("\\d", "ammnn"));  // f
		System.out.println(Pattern.matches("\\d", "2")); //t
		System.out.println(Pattern.matches("\\D", "a")); //t
		System.out.println(Pattern.matches("\\D", "am"));  //f
		System.out.println(Pattern.matches("\\D*", "ammnn")); // t
	
	}
	
	

}









