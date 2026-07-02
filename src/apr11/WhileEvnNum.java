package apr11;

import java.util.Scanner;

class WhileEvnNum {

	public static void main(String[] args) {

//		Scanner ip = new Scanner(System.in);
//		System.out.print("enter num1 ");
//		int num1 = ip.nextInt();
//		System.out.print("enter num2 ");
//		int num2=ip.nextInt();
//		System.out.println("while loop starts");
//		while(num1 <= num2) {
//
//			if(num1 % 2==0) {
//				System.out.println(num1);
//			}
//			num1++;
//		}
//		System.out.println("end");

		//case-2
		//note---> for even num give num1 as even num's only else odd nums will print
		Scanner ip = new Scanner(System.in);
		System.out.print("enter num1 ");
		int num1 = ip.nextInt();
		System.out.print("enter num2 ");
		int num2=ip.nextInt();
		System.out.println("while loop starts");
		while(num1 <= num2) {

			System.out.println(num1);
			num1+=2;
		}
		System.out.println("end");
	}

}
