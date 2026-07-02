package apr11;

import java.util.Scanner;

class GreatestNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter num1 ");
		 int num1 = input.nextInt();
		System.out.print("enter num2 ");
		 int num2 = input.nextInt();
		if(num1 > num2) {
			System.out.println("num1" + " "+ num1 + " is greater then " + num2 + " "+ " num2");
		}else if(num2 > num1) {
			System.out.println("num2" + " "+ num2 + " is greater then " + "num1" + " "+ num1);
		}
		System.out.println("out side of if else");

	}

}
