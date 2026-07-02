package may10;

public class NsmNsvNsm {
	//non static method non static variable & non static method
	int k;
	static double j;
	int v=111;
	public void nonStaticMethod() {
		
		System.out.println(" V is not static variable " + v);
		nonStaticMethod2();
		
	}
	public void nonStaticMethod2() {
		System.out.println("nonStaticMethod2 is called in nonStaticMethod ");
		
	}
	public static void main(String[] args) {
		
		System.out.println("main starts");
		NsmNsvNsm obj = new NsmNsvNsm();
		
		/*if static variable & non static varibales are decalred and not initialized but 
		when we go for utilization default value will be print*/
		System.out.println(obj.k);
		System.out.println(obj.j);
		
	}
}
