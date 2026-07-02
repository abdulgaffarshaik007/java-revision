package may10;

public class NsmSvsm {
	//NsmSvsm ---> Non Static method Static variable static method
	//in static method -- sm / sv can access directly
	//in static method -- nsm / nsv can access with help of object creation only
	//in non- static method -- sm / sv & nsm/nsv can access directly
	 
	static int j=100;
	public void display(){
		
		System.out.println("display() method is not static");
		System.out.println("j is static variable accessing directly from display() " + j);
		show();
		
	}
	public static void show() {
		System.out.println("show() is static method - inside show() method");
		
	}
	public static void main(String[] args) {
		System.out.println("main method ");
		NsmSvsm obj = new NsmSvsm();
		obj.display();
		System.out.println("main ends");
	}

}
