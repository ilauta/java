
import java.util.Scanner;
public class HomeWorkCW04 {
	
	//проверка введенных данных
	
	public static boolean getCheck(int a, int b){
		if (a<b) {
			return true;
		}
		else{
			System.out.println("Error! 'a' should be less than 'b'");
			return false;
		}
	}

	//26. Даны два целых числа: D (день) и M (месяц), определяющие правильную
//дату. Вывести знак Зодиака, соответствующий этой дате: «Водолей»
//(20.1–18.2), «Рыбы» (19.2–20.3), «Овен» (21.3–19.4), «Телец» (20.4–20.5),
//«Близнецы» (21.5–21.6), «Рак» (22.6–22.7), «Лев» (23.7–22.8), «Дева»
//(23.8–22.9), «Весы» (23.9–22.10), «Скорпион» (23.10–22.11), «Стрелец»
//(23.11–21.12), «Козерог» (22.12–19.1).

	public static int getCalendarIndex(int d, int m){
		int[][] calendar = new int[][]{
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0 },
			{ 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 },
			{ 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
			{ 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6 },
			{ 0, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 0 },
			{ 0, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8 },
			{ 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9 },
			{ 0, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 0 },
			{ 0, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11 },
			{ 0, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 0 },
			{ 0, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
		};
		int i = calendar[d][m];
		return i;
	}
	public static String getZodiac(int i){
		String [] zodiac = {"0", "Capricorn", "Aquarius", "Fish", "Aries", "Taurus", "Twins", "Cancer", "Lion", "Virgo", "Libra", "Scorpio", "Sagittarius"};
		String zodiacName = zodiac[i];
		return zodiacName;
	}

		
	//28. Даны два целых числа A и B (A < B). Найти произведение всех целых чисел от A до B включительно.
	
	public static int getMultiplication(int a, int b){
		int multiplication = 1;
		for (int i=a; i<=b; i++) {
			multiplication = multiplication*i;	
		}
		return multiplication;
	}
	
	//29. Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых чисел от A до B включительно.
	
	//получение массива из квадратов чисел
	
	public static int[] getArray(int a, int b){
		int [] intArray = new int [(b-a+1)];
		int j = 0;
			for (int i=a; i<=b; i++) {
				intArray[j] = i*i;
				j++;
			}
		return intArray;
	}
	
	//нахождение суммы квадратов
	
	public static int getSumSquares(int a, int b){
		int arr[] = getArray(a,b);
		int sumarray = 0;
			for (int i=0; i<arr.length; i++) {
				sumarray = sumarray+arr[i];
			}
		return sumarray;
	}
	
	//30. Дано вещественное число A и целое число N (> 0). Используя один цикл, найти значение выражения 1 – A + A2 – A3 + ... + (–1)N·AN. Условный
	//оператор не использовать.
	
	public static float getSeries (float a, int n){
		float result = 1;
		for (int i=1; i<=n; i++){
			result =result + (float)(Math.pow(-1,i)*Math.pow(a,i));
		}
		return result;
	}
	
	//31. Дано целое число N (> 0). Найти произведение N! = 1·2·...·N (N–факториал). Чтобы избежать целочисленного переполнения, вычислять это
	//произведение с помощью вещественной переменной и вывести его как вещественное число.
	
	public static int getFactorial(int c){
		int factorial = getMultiplication(1,c);
		return factorial;
	}
	
	//32. Дано целое число N (> 1). Последовательность чисел Фибоначчи FK (целого типа) определяется следующим образом: F1 = 1, F2 = 1, FK = FK–2 +
	//FK–1, K = 3, 4, ... . Вывести элементы F1, F2, ..., FN.
	
	public static int[] getFibonacciSeries (int n){
		int [] fi = new int [n+2];
		fi[0]=fi[1]=1;
		for (int i = 2; i<(n+2); i++){
			fi[i]=fi[i-1]+fi[i-2];
		}
		return fi;
	}
	
	//вывод массива на экран
	
	public static void printArray (int[] arr) {
	    for (int i=0; i<arr.length; i++){
	       System.out.print(arr[i]+" ");
	    }
	}
	
	//36. Дано целое число N (> 1). Последовательность чисел Фибоначчи FK определяется следующим образом: F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, ...
	//Проверить, является ли число N числом Фибоначчи. Если является, то вывести True, если нет — вывести False.
	
	public static void isFibonacciMember (int n){
		int [] fi = getFibonacciSeries(n);
		boolean res = false;
		int i=1;
		while(fi[i]<=n){
			if (n==fi[i]){
				res = true;
			}
			i++;
		}
	System.out.println(res);	
	}
//33. Начальный вклад в банке равен 1000 руб. Через каждый месяц размер вклада увеличивается на P процентов 
//	от имеющейся суммы (P — вещественное число, 0 < P < 25). По данному P определить, через сколько 
//месяцев размер вклада превысит 1100 руб., и вывести найденное количество месяцев K (целое число) 
//и итоговый размер вклада S (вещественное число). 
	
	//функция для вывода кол-ва месяцев
	
	public static int getQuantityMonth (float p) {
		float vklad = 1000;
		int month = 0;
		while (vklad<=1100) {
			vklad = vklad*(1+p/100);
			month++;
		}
		return month;
	}
	
	//определение размера вклада
	
	public static float getDepositAmount (float p) {
		float vklad = 1000;
		int month = 0;
		while (vklad<=1100) {
			vklad = vklad*(1+p/100);
			month++;
		}
		return vklad;
	}
	
	//34. Дано целое число N (> 0). Используя операции деления нацело и взятия остатка от деления, 
//	вывести все его цифры, начиная с самой правой (разряда единиц).
	
	public static void getBitsNumbers (int n) {
		System.out.println(n%10);
		while (n/10!=0) {
			n=n/10;
			System.out.println(n%10);
		}
	}
	
//35. Дано целое число N (> 1). Если оно является простым, то есть не имеет положительных делителей, кроме 1 и 
//самого себя, то вывести True, иначе вывести False.
	
	public static void isSimple (int n) {
		int j=0;
		for (int i=2; i<n; i++) {
			if (n%i!=0)	{
				j=j;
			}
			else {
				j++;
			}
		}
		if (j==0){
			System.out.println("true");
		}
		else {	
			System.out.println("false");
		}
	}
	
	
	
			
	public static void main (String [] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please, enter 'a'");
		int a = keyboard.nextInt();
		System.out.println("Please, enter 'b'");
		int b = keyboard.nextInt();
		System.out.println("Please, enter 'c' (for factorial)");
		int c = keyboard.nextInt();
		
		System.out.println("Please, enter 'n' (1+(-1)^n)+A^n)");
		int d = keyboard.nextInt();
		
		System.out.println("Please, enter 'A' (1+(-1)^n)+A^n)");
		float e = keyboard.nextFloat();
		
		System.out.println("Please, enter 'N' to get Fibonacci Series");
		int fibonac = keyboard.nextInt();
		
				
		int [] fi = getFibonacciSeries(fibonac);
		
		printArray(fi);
		
		System.out.println();
		
		System.out.println("Please, enter Number to check is it Fibonacci Series member?");
		int fibonaccimember = keyboard.nextInt();
		
		isFibonacciMember(fibonaccimember);
		
			float res = getSeries(e,d);
			System.out.println("(1+(-1)^n)+A^n) is " + res);
		
		if (getCheck(a,b)){
			
			int mult = getMultiplication(a,b);
			int sumsquares = getSumSquares(a,b);
			int factorial = getFactorial(c);
						
			System.out.println("Multiplication of all numbers between a and b is " + mult);
			System.out.println("Sum of squares of all numbers between a and b is " + sumsquares);
			System.out.println("Factorial 'c' is " + factorial);
		}
		
		System.out.println("Please, enter p. It should be 0<p<25");
		int p = keyboard.nextInt();
		
		int month = getQuantityMonth(p);
		System.out.println(month);
		float vklad = getDepositAmount(p);
		System.out.println(vklad);
		
		System.out.println("Please, enter integer N>0.");
		int n = keyboard.nextInt();
		
		isSimple(n);
		getBitsNumbers(n);

		System.out.println("Please, enter month");
		int m = keyboard.nextInt();
		System.out.println("Please, enter day");
		int d = keyboard.nextInt();
		int index = getCalendarIndex(m,d);
		String zodiacName = getZodiac(index);
		System.out.println(zodiacName);
	}
}
