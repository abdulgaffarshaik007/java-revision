package apr16;

class BinaryPtrn2 {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j%2!=0) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}

			}System.out.println();
		}

	}

}
/*
 * if(j%2==0) or print num 1 & 0 in rev if j%2!=0
 * 01010
 * 01010
 * 01010
 * 01010
 * 01010
 */