package firstpro;

public class Pattern_Printing_Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		PRINT THE PATTERN
////			*
////		   ***
////		  *****
////		 *******
////		*********
////		SOLUTION:
//		
////		int n=5;
////		for(int i=1;i<=n;i++) {
////			for(int j=i;j<=n-1;j++) {
////				System.out.print(" ");
////			}
////			for(int j=1;j<=i;j++) {
////				System.out.print("*");
////			}
////			for(int j=1;j<=i-1;j++) {
////				System.out.print("*");
////			}
////			System.out.println();
////		}
		
//		PRINT THE PATTERN
//			*
//		   * * 
//		  *	  *
//		 *     *
//		* * * * *
		
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=i;j<=n-1;j++) {
//				System.out.print(" ");
//			}
//			for(int j=n;j==n;j--) {
//				System.out.println("*");
//			}
//			System.out.println();
//		}
		
//		PRINT THE PATTERN
//		*      *
//		**    **
//		***  ***
//		********
//		********
//		***  ***
//		**    **
//		*      *
		
//		int n =4;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			for(int j=1;j<=2*(n-i);j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			for(int j=1;j<=2*(n-i);j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		
//		}
		
//		PRINT THE PATTERN
//		     *****
//		    *****
//		   *****
//		  *****
//		 *****
		
//		int n=5;
//		for (int i=0;i<n;i++) {
//			for(int j=1;j<n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=n;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		PRINT THE PATTERN
		  
//		    1
//		   2 2
//		  3 3 3
//		 4 4 4 4
//		5 5 5 5 5
		
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//			System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
//		PRINT THE PATTERN
		
//		    1
//		   212
//		  32123
//		 4321234
//		543212345

//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			for(int j=2;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
//		PRINT THE PATTERN
//		    *
//		   ***
//		  *****
//		 *******
//		 *******
//		  *****
//		   ***
//		    *
		
//		int n=4;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		PRINT THE PATTERN
//		    	*  
//		      * * *  
//		    * * * * *  
//		  * * * * * * *  
//		* * * * * * * * * 
		
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=n;j>=1;j--) {
//				System.out.print("&");
//			}
//			for(int j=n;j>=1;j--) {
//				System.out.print("*");
//			}
//			for(int j=1;j<=i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//			
//		}
		
//		PRINT THE PATTERN
		
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
		
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//		for(int i=n-1;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
		
//		PRINT THE PATTERN

//		  *
//	    * *	
//	  * * *	
//  * * * *	
//* * * * *		
//  * * * *		     
//	  * * *	
//	    * *
//	      *
		
//		Problem occur
		
//		int n=6;
//		for(int i=n-1;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" "+" ");
//			}
//			for (int j=1;j<=n-i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n-1;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" "+" ");
//			}
//			for (int j=1;j<=n-i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//	    
		
		
	}

}
