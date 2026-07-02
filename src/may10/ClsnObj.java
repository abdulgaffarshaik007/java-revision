package may10;

public class ClsnObj {

	static int i=10;
	public static void main(String[] args) {
		int j=20;
		System.out.println("main menthod " + i + " " + j );
		//sMethod(); //---> accessing static method directly
		ClsnObj.sMethod(); //---> accessing static method with class name

	}
	public static void sMethod() {
		 int q = 30;
		System.out.println("static method " + i+ " " + q);
	}

}
