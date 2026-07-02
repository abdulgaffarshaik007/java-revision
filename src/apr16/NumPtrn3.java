package apr16;

class NumPtrn3 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(j);
				//System.out.print(i);
				//System.out.print('*');
			}System.out.println();
		}

	}

}

/*
for i
5
44
333
2222
11111

for j
5
54
543
5432
54321

for *
*
**
***
****
*****
*/