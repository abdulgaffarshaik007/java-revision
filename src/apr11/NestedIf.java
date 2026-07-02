package apr11;

 class NestedIf {
public static void main(String[] args) {
	int a=22, b=33;
	System.out.println("condintion starts");
	if(a < b) {
		System.out.println("a < b inside of if");
		if(a !=b) {
			System.out.println(" a not eql to b inside 2nd if");
		}if(a ==b) {
			System.out.println("a euql to b inside 3rd if");
	}if(b > a) {
		System.out.println("b greter then a inside 4th if");
}
	}else {
		System.out.println("none is true - else block");
	}

	}
}
