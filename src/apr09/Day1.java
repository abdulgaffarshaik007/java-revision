package apr09;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		//literals

//	        System.out.println(1);//int
//	        System.out.println('a');//char
//	        System.out.println("abc123");//string
//	        System.out.println(true);//boolean
//	        System.out.println(false);
//	        System.out.println("d");

	//concatenation
//	        System.out.println(3 + 5);
//	        System.out.println( 7 + 's');
//	        System.out.println(5 + "String");
//	        System.out.println('a' + 'b');
//	        System.out.println('g' + "char+string");
//	        System.out.println("string" + "string");
//	        System.out.println("string" + true);
	       // System.out.println(false + 1); //---error
	      //  System.out.println(true + 'c');//---error
	     //   System.out.println(false + "string");

	   //variables
	        //local variable

//		int sId;//declared
//		String sName;
//		char sIn;
//		double sPer;
//		System.out.println("print");
//		int Snum = 2; // dec + init
//		System.out.println(Snum);//util
//		System.out.println(sId=7);//utilization
//		sName="nobita";//initialization
//		System.out.println(sName);//util
		//int sId = 11; local variable cnnt be duplicate else will get CTE(compile time error)

	//Separator ,'
//		2
//---> when we have same data types multiple we can decalare datatype only once by useing , seperator
//		System.out.println(i);
//		System.out.println(b);
//		System.out.println(sId2);
//		i=12;//reinitilization/reassigning --> chng or providing new val to alredy exstng valu
//		System.out.println(i);

		//scanner
		Scanner input = new Scanner(System.in);
		 System.out.print("Enter first number: ");
	        int num1 = input.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = input.nextInt();

	        System.out.println("Bitwise AND: " + (num1 & num2));
	        System.out.println("Bitwise OR: " + (num1 | num2));
	        System.out.println("Bitwise XOR: " + (num1 ^ num2));
	        System.out.println("Bitwise NOT: " + (~num1));
	        System.out.println("Bitwise Left Shift: " + (num1 << 2));
	        System.out.println("Bitwise Right Shift: " + (num1 >> 2));
	        System.out.println("Bitwise Unsigned Right Shift: " + (num1 >>> 2));

	        input.close();

	}


}
