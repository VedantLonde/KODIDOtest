package practice;

import java.util.Scanner;
import java.lang.RuntimeException;


public class Bank extends RuntimeException {
	
public void deposite(int s) {
	if( s < 0) {
		throw  new CustomException("Negative Value");
	}
	else {
		System.out.println(s);
	}
		
		
	}		
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();		
		 b.deposite(sc.nextInt());
		
	}
	
	
}
