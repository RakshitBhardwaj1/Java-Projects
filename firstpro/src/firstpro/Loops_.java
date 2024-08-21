package firstpro;
import java.util.Scanner;
public class Loops_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Syntax:
//		for(initialisation;condition;updation){
//		print statements}
//		intialisation is used as int counter=0
//		condition is used as counter<100
//		updation is used as counter = counter+1
		
//		for(int counter=0; counter<11;counter++) {
//			System.out.println(counter+" Hello World");
		
//		Multiplication Table
		
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number for mutiplication table: ");
//		int num=sc.nextInt();
//		for(int counter=1; counter<11; counter++) {
//			System.out.println(num+"x"+counter+"="+num*counter);
//		}
		
//		Print the number till 10
		
		for(int i=0;i<11;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		
//		WHILE LOOP
		
//		SYNTAX
//		Initialisation;
//		while(condition) {
//			print(statement);
//			updation;
//		}
		
//		int i=0;
//		while(i<11) {
//			System.out.println(i);
//			i++;
//		}
		
//		DO WHILE
		
//		SYNTAX
//		Initialisation;
//		do {
//			print Statements;
//			updation;
//		}while(codition);
		
//		int i=0;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<11);
		
		
//		DIFFERANCE BETWEEN DO WHILE AND WHILE
		
//		If we write the False statement Like
//		For While Loop
		
//		int i=12;
//		while(i<11) {
//			System.out.println(i);//it never print i because initialisation is greater than condition
//		}
//		But For DO WHILE loop
		
//		int i=12;
//		do {
//			System.out.println(i);//it will print at least 1 time i then terminate
//			i++;
//		}while(i<11);
		
//		Practice Question
//		1. Print the Sum of First n Natural
//		Solution
		
//		System.out.println("Enter the number:");
//		int n=sc.nextInt();
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			sum=sum+i;
//		}
//		System.out.println(sum);
	}

}
