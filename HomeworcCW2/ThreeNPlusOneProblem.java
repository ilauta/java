//"3N+1" Problem

import java.util.Scanner;
class ThreeNPlusOneProblem{
	public static void main (String [] arg) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please, enter any integer number");
		int N = keyboard.nextInt();
		System.out.println(N);

		while (N!=1) {
			if (N%2==0){
	 				N=N/2;
	 				System.out.println(N);
			}
			else {
					N=3*N+1;
					System.out.println(N);
			}
		}
	}
}