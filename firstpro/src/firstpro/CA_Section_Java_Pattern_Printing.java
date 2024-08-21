package firstpro;

public class CA_Section_Java_Pattern_Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PRINT THE PATTERN
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
		
//		PRINT THE PATTERN
//		* 
//		* *
//		* * *
//		* * * *
//		* * * * *
		
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}

//		PRINT THE PATTERN
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
		
//		int n=5;
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
		
//		PRINT THE PATTERN
//		* * * * *
//		*		*
//		*		*
//		*		*
//		* * * * *
		
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==1||j==1||i==n||j==n) {
//					System.out.print(" "+"*");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		PRINT THE PATTERN
//		* * * * *
//		    * * * * 
//		        * * * 
//		            * *
//		               *
		
//		int n=5;
//		for (int i=0;i<=n;i++) {
//			for (int j=1;j<=i*2;j++) {
//				System.out.print(" "+" ");
//			}
//			for (int j=1;j<=n-i;j++) {
//				System.out.print(" "+"*");
//			}
//			System.out.println();
//			
//		}

//		PRINT THE PATTERN
		
//		*       *
//		  *   *
//		    *
//		  *   *
//		*       *
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.println("*");
				}else {
					System.out.println(" ");
				}
			
			System.out.println();

			}
			
		}
	}
		
}
	


