
package may10;

public class SmNsvNsm {
	//static method non static variable non static method
	int i=123;
	
	public void nStaticMethod() {
		System.out.println("inside non static method"  + " i is non sv " + i);		
	}
	public static void display() {
		System.out.println("display is static method ");
		SmNsvNsm obj = new SmNsvNsm();
		System.out.println(" i is non sv " + obj.i);
		obj.nStaticMethod();
	}
	public static void main(String[] args) {
		System.out.println("Main starts");
		display();
		System.out.println("Main ends");
		
	}

}
