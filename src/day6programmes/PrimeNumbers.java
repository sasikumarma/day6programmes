package day6programmes;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, prime;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check prime or not");
		number = sc.nextInt();
		if (number %2 == 0 && number >=2) {
			prime = 0;
		} else {
			prime = 1;
		}
		if (prime == 1) {
			System.out.println(number+" is prime number");
		} else {
			System.out.println(number+" is not prime number");
		}
		

	}

}
