package practice;

import java.util.Scanner;

public class factor {
	
	
public void fact(int n ) {
		
	int count =0;
		for(int i=1;i<=n;i++) 
		{
			if(n%i == 0) {
				count ++;
			}
		}
		if(count==2) {
			System.out.println("factor of "+n+"(excluding 1"+n+" are: the number is prime number  "  );;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i == 0) {
					System.out.println(i);
				}
			}
		}
	}	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in );
				factor f = new factor();
				int number = sc.nextInt();
			f.fact(number);
			
	}
}
	

