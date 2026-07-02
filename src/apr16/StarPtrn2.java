package apr16;

class StarPtrn2 {

	public static void main(String[] args) {
		int n=4, value=7,space=n+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(' ');
			}
			for(int k=1;k<=value;k++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
			value-=2;
		}
		

	}

}
