package testYoonjin;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);	

		/*
		 * double[] ar = {85.6, 79.5, 83.1, 80.0 ,78.2 ,75.0};
		 */
		double[] ar = {85.6, 79.5, 83.1, 80.0 ,78.2 ,75.0, 80.0, 90.0 , 70.0, 60.0};
		
		int a = sc.nextInt();

		int b = sc.nextInt();
		sc.close();
		double sum = ar[a-1] + ar[b-1];

		System.out.printf("%.1f", sum);

	}

}
	