package firstpro;

public class Pattern_printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		NESTED LOOP
//		PRINT THE PATTERN
//		*****
//		*****
//		*****
//		*****
//		Solution:
		
//		int n=4;
//		int m=5;
//		OUTER LOOP
//		for(int i=1;i<=n;i++) {
//		INNER LOOP
//			for(int j=1;j<=m;j++) {
//				System.out.print("*");				
//			}
//			System.out.println("");
//		}
		
//		PRINT THE PATTERN LIKE
//		*****
//		*	*
//		*	*
//		*	*
//		*****
//		SOLUTION:
		
//		int n=5;
//		int m=5;
//		OUTER LOOP
//		for(int i=1;i<=n;i++) {
//		INNER LOOP
//			for(int j=1;j<=m;j++) {
//				if(i==1||j==1||i==n||j==m) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
//		PRINT THE PATTERN
//		*
//		**
//		***
//		****
//		SOLUTION:
		
//		int n=4;
//		OUTER LOOP
//		for(int i=1;i<=n;i++) {
//		INNER LOOP
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		PRINT THE PATTERN
//		****
//		***
//		**
//		*
//		Solution:
		
//		int n=4;
//		OUTER LOOP
//		for(int i=n;i>0;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		PRINT THE PATTERN
//		   *
//		  **
//		 ***
//		****
//		SOLUTION:
		
//		int n=4;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		PRINT THE PATTERN
//		1
//		12
//		123
//		1234
//		12345
//		SOLUTION:
		
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		PRINT THE PATTERN
//		12345
//		1234
//		123
//		12
//		1
//		SOLUTION:
		
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
//		PRINT THE PATTERN
//		1
//		23
//		456
//		78910
//		1112131415
//		SOLUTION
		
//		int n=5;
//		int m=0;
//		for (int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				m=m+1;
//				System.out.print(m);
//			}
//			System.out.println();
//		}
		
//		PRINT THE PATTERN
//		1
//		01
//		101
//		0101
//		10101
//		SOLUTION:
		
//		int n=5;
//		for (int i=1; i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				if((i+j)%2==0) {
//					System.out.print(1);
//				}else {
//					System.out.print(0);
//				}
//			}System.out.println();
//		}
		
	}

}
