// Дни недели пронумерованы следующим образом: 1 — понедельник, 2 — вторник, ..., 
// 6 — суббота, 7 — воскресенье. Дано целое число K, лежащее в
// диапазоне 1–365. Определить номер дня недели для K­го дня года, если 
// известно, что в этом году 1 января было средой.

import java.util.Scanner;
class TaskForteen{
	public static void main (String[]args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please, enter any integer number");
		int K = keyboard.nextInt();
		int day = 0;

		String[] week = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday","Monday","Tuesday"};
			

			for (int i=1; i<=K; i++) {
				if (day>6){
					day=0;
				}
				// System.out.println(i);
				System.out.println(day);
				day++;
			}
// System.out.println(i);
System.out.println(day);
System.out.println(week[day-1]);

	}
}