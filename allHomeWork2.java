---------algorithm---------

//Chess desk

import java.util.Scanner;
class Chess {
	public static void main (String[]args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please, enter any integer number");
		int length = keyboard.nextInt();
		System.out.println("Please, enter any integer number");
		int height = keyboard.nextInt();

		char[][] chess = new char[length][height];

		for (int i = 0; i < length; i++) {
               
            for (int j = 0; j < height; j++) {
                	
                if ((i+j)%2==0) {
                	chess[i][j] = '0';
                }
                else {
                	chess[i][j] = '#';	
                }
            }
        }
       
        for (int i = 0; i < length; i++) {
                for (int j = 0; j < height; j++) {
                     System.out.print(chess[i][j]);
            }
            
            System.out.println();
        }
	}
}

//3N+1 problem

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


//число с максимальным кол-в делителей в промежутке от 1 до 10000

class MaxNubmerOfDecimars{
	public static void main (String [] arg) {
	
		int numberOfDecimars = 0; //kol-vo delitelej
		int maxNumberOfDecimars = 0; //max kol-vo delitelej
		int maxNumber = 0;

		for (int n=10000; n>=1; n=n-2) {
			for (int i=1; i<=n; i++) {
				if (n%i==0) {
					numberOfDecimars++;
				}

				if (numberOfDecimars>maxNumberOfDecimars) {
					maxNumberOfDecimars = numberOfDecimars;
					maxNumber = n;
				}
			}
			numberOfDecimars=0;
		}
		System.out.println("maxNumberOfDecimars = "+maxNumberOfDecimars);
		System.out.println("maxNumber = "+maxNumber);
	}
}

//кол-во делителей для произвольного целого числа

import java.util.Scanner;
class NumbersOfDecimars {
	public static void main (String[]args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please, enter any integer number");
		
        int N = keyboard.nextInt();
        int D=0; //Number of decimars
    
        for (int i=1; i<=N; i++) {
            if (N%i==0){
                D++;
                
            }
        }
        System.out.println("decimars = "+D);
    }
}    

---------------ЗАДАЧИ-------------------------
// 13. С начала суток прошло N секунд (N — целое). Найти количество полных часов, минут и секунд, прошедших с начала последнего часа.

import java.util.Scanner;
class TaskThirteen {
	public static void main (String[]args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please, enter any integer number");
		
    int N = keyboard.nextInt();
	int hours = (int) (N/3600);
	int minutes = (int) ((N-3600*hours)/60);
	int secundes = (N-3600*hours)%60;

	System.out.println("hours = "+hours);
	System.out.println("minutes = "+minutes);
	System.out.println("secundes = "+secundes);
	
	}
}

// 14. Дни недели пронумерованы следующим образом: 1 — понедельник, 2 — вторник, ..., 
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


//15. Дано целое положительное число. Проверить истинность высказывания:«Данное число является нечетным трехзначным».


import java.util.Scanner;
class TaskFifteen {
	public static void main (String[]args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please, enter any integer number");
		
    int ABC = keyboard.nextInt();

    int A = (int) ABC/100;
    // int B = 10*a - (int) (ABC/10);
    // int C = ABC%10;

    	if (A!=0&&ABC%2!=0) {System.out.println(true);
   		 }
    		else {
    			System.out.println(false);
    		}

    }
}

// 16. Дано трехзначное число. Проверить истинность высказывания: «Цифры данного числа образуют возрастающую последовательность».
// a. Проверить истинность высказывания: «Цифры данного числа образуют возрастающую арифметическую последовательность», например, 123, 456 и т.п.

import java.util.Scanner;
class TaskSixteen {
	public static void main (String[]args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please, enter any integer number");
		
    int ABC = keyboard.nextInt();

    int A = (int) ABC/100;
    int B = (int) (ABC/10) - 10*A;
    int C = ABC%10;

    	if ( (A<B && B<C)||(B==(A+1) && C==(B+1)) ) { 
    		System.out.println("true");
   		 }
       		else { 
       			System.out.println("false");
       		}

    }
}

// 17. Дано четырехзначное число. Проверить истинность высказывания: «Данное число читается одинаково слева направо и справа налево» (т.е. является палиндромом)

import java.util.Scanner;
class TaskSeventeen {
	public static void main (String[]args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please, enter any integer number");
		
    int ABCD = keyboard.nextInt();

    int A = (int) ABCD/1000;
    int B = (int) ABCD/100 - 10*A;
    int C = (int) (ABCD/10) - 10*(10*A+B);
    int D = ABCD%10;

    	if (A==D && B==C) { 
    		System.out.println("true");
   		 }
       		else { 
       			System.out.println("false");
       		}

    }
}

// 18. Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность высказывания: «Данные поля имеют одинаковый цвет».

import java.util.Scanner;
class TaskEighteen {
	public static void main (String[]args) {
	Scanner keyboard = new Scanner(System.in);

	System.out.println("Please, enter x1 coordinate from 1 to 8");
	int XONE = keyboard.nextInt();

  System.out.println("Please, enter y1 coordinate from 1 to 8");
  int YONE = keyboard.nextInt();

  System.out.println("Please, enter x1 coordinate from 1 to 8");
  int XTWO = keyboard.nextInt();

  System.out.println("Please, enter y1 coordinate from 1 to 8");
  int YTWO = keyboard.nextInt();


    	if ( ((XONE+YONE)%2==0 && (XTWO+YTWO)%2==0) || ((XONE+YONE)%2!=0 && (XTWO+YTWO)%2!=0) ) { 
    		System.out.println("the same color");
   		 }
       		else { 
       			System.out.println("diff color");
       		}

    }
}

// 19. Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность высказывания: 
// «Ладья за один ход может перейти с одного поля на другое».

import java.util.Scanner;
class TaskNineteen {
	public static void main (String[]args) {
	Scanner keyboard = new Scanner(System.in);

	System.out.println("Please, enter x1 coordinate from 1 to 8");
	int XONE = keyboard.nextInt();

  System.out.println("Please, enter y1 coordinate from 1 to 8");
  int YONE = keyboard.nextInt();

  System.out.println("Please, enter x1 coordinate from 1 to 8");
  int XTWO = keyboard.nextInt();

  System.out.println("Please, enter y1 coordinate from 1 to 8");
  int YTWO = keyboard.nextInt();


    	if ( XONE==XTWO||YONE==YTWO) { 
    		System.out.println("this step is available");
   		 }
       		else { 
       			System.out.println("unavailable");
       		}
    }
}

---------------------TBD-------------------------------

// 20. Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность высказывания: 
// «Ферзь за один ход может перейти с одного поля на другое».

import java.util.Scanner;
class TaskTwenty {
	public static void main (String[]args) {
	Scanner keyboard = new Scanner(System.in);

	System.out.println("Please, enter x1 coordinate from 1 to 8");
	int XONE = keyboard.nextInt();

  System.out.println("Please, enter y1 coordinate from 1 to 8");
  int YONE = keyboard.nextInt();

  System.out.println("Please, enter x1 coordinate from 1 to 8");
  int XTWO = keyboard.nextInt();

  System.out.println("Please, enter y1 coordinate from 1 to 8");
  int YTWO = keyboard.nextInt();


    	if ( XONE==XTWO||YONE==YTWO||(Math.abs(XONE-XTWO)==Math.abs(YONE-YTWO)) ) { 
    		System.out.println("this step is available");
   		 }
       		else { 
       			System.out.println("unavailable");
       		}
    }
}




//Write a code fragment that shuffle one-dimensional array a[] of different int values.

import java.util.Scanner;
class ArrayTwo {
	
	public static void main (String[]args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please, enter any integer number");
		int N = keyboard.nextInt();
		
		int[] arrayTwo = new int[N];

		for (int i = 0; i < N; i++) {
         	arrayTwo[i] = i;
             }
         
        for (int i = 0; i < arrayTwo.length; i++) {
                System.out.print(arrayTwo[i]);
       	}
       	System.out.println();  

		for (int i= 0; i<arrayTwo.length; i++){ //arrayTwo.length shifts should be enought
			int randomindex1 = (int) (Math.random() * arrayTwo.length);
			int randomindex2 = (int) (Math.random() * arrayTwo.length);
			if (randomindex1!=randomindex2)  {
				// System.out.println(randomindex1 +" -> "+randomindex2);

				arrayTwo[randomindex1]=arrayTwo[randomindex1]+arrayTwo[randomindex2];
		        arrayTwo[randomindex2]=arrayTwo[randomindex1]-arrayTwo[randomindex2];
		        arrayTwo[randomindex1]=arrayTwo[randomindex1]-arrayTwo[randomindex2];

		       //  for (int j = 0; j < arrayTwo.length; j++) {
	        //         System.out.print(arrayTwo[j]);   

	       	// 	}
	       	// 	System.out.println(); 
	       	}

        }
        for (int i = 0; i < arrayTwo.length; i++) {
                System.out.print(arrayTwo[i]);      
       	}

    }
}




// Write a code fragment that reverses the order of a one-dimensional array a[] of int values. Do not create another array to hold the result.

import java.util.Scanner;

class ArraysOne {
	public static void main (String[]args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please, enter any integer number");
		int N = keyboard.nextInt();
		
		double[] arrayOne = new double[N];

		for (int i = 0; i < N; i++) {
         	arrayOne[i] = (int) (1+Math.random()*N);   //add random numbers to the array 
        }
         
        for (int i = 0; i < arrayOne.length; i++) {
                System.out.println(arrayOne[i]); // print the first array
        }

        for (int i = 0; i < N/2; i++) { //add random numbers to the array 
         	arrayOne[i] =  


        }
         
        for (int i = 0; i < arrayOne.length; i++) {
                System.out.println(arrayOne[i]); //print inverted array
        }

   	}
}


// Write a code fragment that reverses the order of a one-dimensional array a[] of 
// int values. Do not create another array to hold the result.

import java.util.Scanner;

class ArraysOne {
	public static void main (String[]args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please, enter any integer number");
		int N = keyboard.nextInt();
		
		int[] arrayOne = new int[N];

		for (int i = 0; i < N; i++) {
         	arrayOne[i] = i;   //add numbers to the array 
        }
         
        for (int i = 0; i < arrayOne.length; i++) {
                System.out.print(arrayOne[i]); // print the first array
        }

        System.out.println();

        for (int i = 0; i <= (N/2-1); i++) { 
         	arrayOne[i] = arrayOne[i] + arrayOne[N-1-i];
            arrayOne[N-1-i] = arrayOne[i] - arrayOne[N-1-i];
            arrayOne[i] = arrayOne[i] - arrayOne[N-1-i];


        }
         
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i]); //print inverted array
        }

   	}
}




	
