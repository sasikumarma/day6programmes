package day6programmes;
import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, firstterm = 0, secondterm = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how may fibonacci numbers to print");
		number = sc.nextInt();
		System.out.println("fibonacci series till " + number + "terms:");
		for (int i = 1; i < number; i++) {
			System.out.print(firstterm + ",");
			int nextterm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm = nextterm;
		}
		
		

	}

}
