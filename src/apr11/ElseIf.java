package apr11;

public class ElseIf {

	public static void main(String[] args) {
		int q=11, r=12;
		System.out.println("conditions start");
		if(q==r) {
			System.out.println("q == r inside if");
		}else if(q > r) {
			System.out.println("q > r inside else if 1");
		}else if(q<r) {
			System.out.println("q < r inside else if2");

		}else if(r>q) {
			System.out.println("r > q inside else if3");

		}
		else {
			System.out.println("r is greater then q insde of else");
		}

	}

}
