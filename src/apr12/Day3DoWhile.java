package apr12;

class Day3DoWhile {

	public static void main(String[] args) {
		int n1=10, n2=20;
		do {
			System.out.println("n1 " + n1);
		//case-2	System.out.println("n1 " + n1++);
		}
		while(n1<=5);
		//case-2 while(n1 <= n2);
		System.out.println("in main method");
		// in case 2 10-20 num will print
	}


}
