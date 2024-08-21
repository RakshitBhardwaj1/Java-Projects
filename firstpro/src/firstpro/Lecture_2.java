package firstpro;
import java.util.Scanner;

public class Lecture_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP A PROBLEM ENTER A NUMBER TO PRINT THE EVEN NUMBER WITHIN A RANGE
		//WAP A PROJRAM TO ENTER THE 2 NUMBERS AND PRINT ODD NUMBER BETWEEN THEM
		//WAP TO ENTER A NUMBER AND PRINT SUM OF ITS DIGIT
		//WAP TO ENTER A NUMBER AND CHECK FOR PRIME
		//WAP TO ENTER A NUMBER AND CHECK FOR ARMSTRONG
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter a Number:");
//		int n=sc.nextInt();
//		for (int i=1;i<=n;i++) {
//			if(i%2==0) {
//				System.out.print(i+" ");
//			}
//		}
		
//		System.out.println("Enter a Number:");
//		int n=sc.nextInt();
//		int n1=sc.nextInt();
//		int m=0;
//		for (int i=n;i<=n1;i++) {
//			if(i%2!=0) {
//				m=m+i;		
//				System.out.println(m);
//			}
//		}
//		System.out.println();

//		System.out.println("Enter a Number:");
//   	    static int getSum(int n){    
//        int sum = 0;
//         
//        while (n != 0)
//        {
//            sum = sum + n % 10;
//            n = n/10;
//        }
//     
//			return sum;
//   	    }

//		System.out.println("Enter a Number:");
//		int n=sc.nextInt();
//		if (n <= 1) {
//			System.out.print("NOT PRIME");
//	        for (int i = 2; i < n; i++) {
//	            if (n % i == 0) {
//	            	System.out.print("NOT PRIME");
//	            }
//	            System.out.print("PRIME");
//	          
//	        }
//	       
//	       
//	    }
		
//		BREAK STATEMENT IS FORCEFULLY BREAK THE LOOP 
		int i=1;
		while(i<=8){
			
			if(i==5) {
				i++;
				continue;
			}
			System.out.print(i);
			i++;
			}
		
	}

}
