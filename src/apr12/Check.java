package apr12;

class Check {
	static int i=10;
	static double j=22.5;
	static String fruit ="apple";

	static int q;
	static String name;

	public static void main(String[] args) {
		System.out.println("---------Global variblae----------");
		System.out.println(i);
		System.out.println(j);
		System.out.println(fruit);
		System.out.println(q);
		System.out.println(name);

		System.out.println("---------local variblae----------");
		int a=10;
		System.out.println(a);
		double b=30.3;
		//double b=11.2; //cte

	}

}
