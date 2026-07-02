package apr11;

import java.util.Scanner;
 class EvnOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.print("Enter number to check evn/odd: ");
	        int num1 = input.nextInt();
		//int num=223;
		if (num1 % 2 ==0) {
			System.out.println("num is evn");
		}else {
			System.out.println("num is odd");
		}
	}

}
