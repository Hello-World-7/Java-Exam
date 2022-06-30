package main.book.chapter1;

import java.util.ArrayList;

public class Questions {
	/**
	 * Which of the following are not valid variable names? (Choose two.)
	 * 
	 * A. _
	 * B. _blue
	 * C. 2blue
	 * D. blue$
	 * E. Blue
	 * 
	 * Answers are B and D by the book
	 * but however E works as well.		
	 */
	//private String _;
	private String _blue;
	//private String 2blue;
	private String blue$;
	private String Blue;
	
	/**
	 * What is the value of tip after executing the following code snippet?
	 * meal = 5
	 * tip = 1
	 * total = 7
	 * 
	 *  A. 1
		B. 2
		C. 3
		D. 7
		E. None of the above
		
		Answer is A
	 */
	
	public static int question2() {
		int meal = 5;
		int tip = 2;
		var total = meal + (meal>6 ? tip++ : tip--);
		System.out.println("meal ="+meal);
		System.out.println("tip ="+tip);
		System.out.println("total ="+total);
		return total;
	}
	
	public static int extraPartsQuestion2() {
		int i = 4;
		int val1 = i++ * 5; // value of i was 4 => answer is 20, but after i++ was completed value became 5
		int val2 = i++ - 5; // value of i was 5 => answer is 0, but after i++ was completed value became 6
		int val3 = ++i * 5; // value of i was 6, but since we used ++i value became 7 => answer is 35
		int val4 = ++i - 5; // value of i was 7, but since we used ++i value became 8 => answer is 3
		System.out.println("i++ * 5 = "+  val1);
		System.out.println("i++ - 5 = "+ val2);
		System.out.println("++i * 5 = "+  val3);
		System.out.println("++i - 5 = "+ val4);
		return 0;
	}
	
	/**
	 * . Which is equivalent to var q = 4.0f;?
	 * A. float q = 4.0f;
	 * B. Float q = 4.0f;
	 * C. double q = 4.0f;
	 * D. Double q = 4.0f;
	 * E. Object q = 4.0f;
	 * 
	 * Answer A is correct, but B, can also fit due to the autoboxing we remove it because var uses primitive types.
	 */
	public static void question3() {
		var q = 4.0f;
		float qa = 4.0f;
		//Float qb = 4.0f;
		//double qc = 4.0f;
		//Double qd = 4.0f;
		//Object qe = 4.0f;
	}
	
	/**
	 * 	4. What is the output of the following?
			12: var b = "12";
			13: b += "3";
			14: b.reverse();
			15: System.out.println(b.toString());
			A. 12
			B. 123
			C. 321
			D. The code does not compile.
			
		Answer is D, because String doesn't have reverse method.
	*/
	public static void question4() {
		 var b = "12";
		 b += "3";
		 //b.reverse();
		 System.out.println(b.toString());
	}
		
	
	/**
	 * What is the output of the following?
		var line = new StringBuilder("-");
		var anotherLine = line.append("-");
		System.out.print(line == anotherLine);
		System.out.print(" ");
		System.out.print(line.length());
		
		A. false 1
		B. false 2
		C. true 1
		D. true 2
		E. It does not compile.
		
		Correct Answer is D, since both variables refers to the same object, therefore they are true.
		and using stringbuilder class with append method, automatically adds extra symbol.
	 * @param args
	 */
		
	public static void question5() {
		var line = new StringBuilder("-");
		var anotherLine = line.append("-");
		System.out.print(line == anotherLine);
		System.out.print(" ");
		System.out.print(line.length());
	}
	
	
	/**
	 * 7. What is the output of the following?
		5: var line = new String("-");
		6: var anotherLine = line.concat("-");
		7: System.out.print(line == anotherLine);
		8: System.out.print(" ");
		9: System.out.print(line.length());
		
		A. false 1
		B. false 2
		C. true 1
		D. true 2
		E. Does not compile
		
		Answer is A, line == anotherLine => two different Immutable Classes, therefore they are not the same (false)
		line.length() => 1, because String.concat method changes the value if it is returned to the same variable, so  anotherline will be 2,
		but line = 1
		
	 */
	
	public static void question7() {
		var line = new String("-");
		var anotherLine = line.concat("-");
		System.out.print(line == anotherLine);
		System.out.print(" ");
		System.out.print(line.length());
	}
	
	/**
	 * . The author of this method forgot to include the data type. Which of the following reference
			types can best fill in the blank to complete this method?
			public static void secret(___________ mystery) {
			 char ch = mystery.charAt(3);
			 mystery = mystery.insert(1, "more");
			 int num = mystery.length();
			}
	 *  A. String
		B. StringBuilder
		C. Both
		D. Neither 
		The correct answer is B
	 */
	
	public static void question11(StringBuilder mystery) {
		char ch = mystery.charAt(3);
		 mystery = mystery.insert(1, "more");
		 int num = mystery.length();
	}
	
	
	/**
	 * Which is one of the lines output by this code?
	 * 
		A. []
		B. [8, 10]
		C. [8, 9, 10]
		D. [10, 8]
		E. The code does not compile
		Answer is A
	 */
	
	public static void question15() {
		 var list = new ArrayList<Integer>();
		 list.add(10);
		 list.add(9);
		 list.add(8);
		 var num = 9;
		 list.removeIf(x -> {int keep = num; return x != keep;});
		 System.out.println(list);
		 list.removeIf(x -> {int keep = num; return x == keep;});
		 System.out.println(list);
	}
	
	/**
	 * Which of the following can fill in the blank so the code prints true?
	 * 
		Answer is A
	 */
	
	public static void question16() {
		var happy = " :) - (: ";
		var really = happy.trim(); // removes spaces both from front and end
		var question = happy.substring(0, happy.length()); // cuts the string
		System.out.println(really.equals(question));
	}
	public static void main(String[] args) {
		//question2();
		//extraPartsQuestion2();
		//question4();
		question16();
	}
	
	/**
	 * All methods described in chapter 1
	 * Working with Java Data Types
	 * @param args
	 */


}
