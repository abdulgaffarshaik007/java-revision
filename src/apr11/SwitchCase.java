package apr11;

import java.util.Scanner;

class SwitchCase {

	public static void main(String[] args) {
//		int num=5;
//		switch(num){
//		case 1:	System.out.println("case1");
//		break;
//		case 2: System.out.println("case2");
//
//		case 3: System.out.println("case3");
//		case 4: System.out.println("case4");
//		break;
//		case 5: System.out.println("case5");
//		break;
//		default: System.out.println("num is invalid");
//		}
		Scanner ip = new Scanner(System.in);
		System.out.print("enter ip num");
		int num = ip.nextInt();
		switch(num){
		case 1:	System.out.println("case1");
		break;
		case 2: System.out.println("case2");

		case 13: System.out.println("case13");
		case 7: System.out.println("case7");
		//break;
		case 25: System.out.println("case25");
		break;
		default: System.out.println("num is invalid");
		}


	}

}
