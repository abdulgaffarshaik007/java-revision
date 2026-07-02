package apr11;

import java.util.Scanner;

class NumSwap {

	public static void main(String[] args) {
		//swapng 2 nums with 3rd variable
//		Scanner ip = new Scanner(System.in);
//		System.out.print("a");
//		int a = ip.nextInt();
//		System.out.print("b");
//		int b = ip.nextInt();
//		int tmp;
//		System.out.println("before swap");
//		System.out.println("a " + a);
//		System.out.println("b " + b);
//		System.out.println("after swap");
//		tmp=a;
//		a =b;
//		b=tmp;
//		System.out.println("a " + a);
//		System.out.println("b " + b);

		//with out 3rd variable
		Scanner ip2 = new Scanner(System.in);
		System.out.print("c");
		int c = ip2.nextInt();
		System.out.print("d");
		int d = ip2.nextInt();
				System.out.println("before swap");
		System.out.println("c " + c);
		System.out.println("d " + d);
		System.out.println("after swap");
		c = c +d;
		d=c-d;
		c=c-d;
		System.out.println("c " + c);
		System.out.println("d " + d);


	}

}
