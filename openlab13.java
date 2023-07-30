package src;

import java.util.Scanner;
public class openlab13 {

	public static void main(String[] args) {
		int number,sum = 0;
		Scanner scan=new Scanner(System.in);
		System.out.println("n Please enter any integer below 10");
		number=scan.nextInt();
		
		while(number<=10) {
			sum =sum+number;
			number++;
		}
		System.out.format("The sum of numbers from the while loop is=%d",sum);
		
		
		
	
		
	
				
		
		
						
		
		
		
		
	}

}
