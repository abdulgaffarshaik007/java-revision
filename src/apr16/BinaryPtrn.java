package apr16;

class BinaryPtrn {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i%2!=0) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}

			}System.out.println();
		}

	}

}
/*
 * if(i%2!=0) or print num 1 & 0 in rev if(i%2==0)
 * 11111
 * 00000
 * 11111
 * 00000
 * 11111
 */