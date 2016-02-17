// 1. Modify the example program so that it uses the command line argument to print any name in greeting

class HelloOne {
	public static void main (String[]arg){
		System.out.println("Hello, "+arg[0]+"!");
	}
}



// 2. Modify the example program so that it uses many command line arguments and prints greeting for every name

class HelloTwo {
	public static void main (String[]args){
	for (String s: args)  
 		System.out.println("Hello "+s);
 }
}



//Дана сторона квадрата a. Найти его периметр P = 4·a
//Дана сторона квадрата a. Найти его площадь S = a^2
//Даны стороны прямоугольника b и c. Найти его площадь S=b·c и периметр P = 2·(c+b). 
//Дан диаметр окружности d. Найти ее длину L = π·d. В качестве значения π использовать 3.14

class Geometry{
	
	public static void main(String[]arg){
		float sideA; //square side
		float sideB; //the first rectange side
		float sideC; //the second rectange side
		float perimeterSquare; 
		float areaSqare;
		float areaRectangle;
		float perimeterRectangle;
		float diameter; //circle diameter
		float pi=3.14F;
		float circumference;

		try{
			sideA=Float.parseFloat(arg[0]);
			sideB=Float.parseFloat(arg[1]);
			sideC=Float.parseFloat(arg[2]);
			diameter=Float.parseFloat(arg[3]);

			perimeterSquare=4*sideA; 
			areaSqare=sideA*sideA;
			areaRectangle=sideB*sideC;
			perimeterRectangle=2*(sideB+sideC);
			circumference=pi*diameter;	

			System.out.println("Perimeter of the square is "+perimeterSquare);
			System.out.println("Area of the square is " +areaSqare);
			System.out.println("Perimeter of the rectangle is " +perimeterRectangle);
			System.out.println("Area of the rectangle is  " +areaRectangle);
			System.out.println("Circumference is " +circumference);
		} catch (Exception e){
			System.out.println("Incorrect arguments format or arguments number.\nPlease, use following format:\njava Geometry sideA sideB sideC diameter\nwhere: sideA - square side\nsideB, sideC - rectangle sides\ndiameter - circle diameter\nExample: java Geometry 2.34 1.67 3 8.99");
		}
	}
}



// 1.Поменять местами содержимое переменных A и B и вывести новые значения A и B.

class TaskOne {
	public static void main(String[]arg){

		float A;
		float B;
		float C;

		try{

		A=Float.parseFloat(arg[0]);
		B=Float.parseFloat(arg[1]);

		System.out.println("A = "+A);
		System.out.println("B = "+B);

		C = A;
		A = B;
		B = C;

		System.out.println("A = "+A);
		System.out.println("B = "+B);

		} catch (Exception e){
			System.out.println("Incorrect arguments format or arguments number.\nPlease, use the following format:\n java TaskOne arg[0] arg[1]");
		}

	}
	
}



// 2.Даны переменные A, B, C. Изменить их значения, переместив содержимое
// A -> B, B -> C, C -> A, и вывести новые значения переменных A, B, C.

class TaskTwo {
	public static void main(String[]arg){

		float A;
		float B;
		float C;
		float Buffer;

		try{

		A=Float.parseFloat(arg[0]);
		B=Float.parseFloat(arg[1]);
		C=Float.parseFloat(arg[2]);

		System.out.println("Input data:");
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		System.out.println("C = "+C);

		Buffer = A;
		A = C;
		C = B;
		B = Buffer;
		

		System.out.println("New data:");
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		System.out.println("C = "+C);

		} catch (Exception e){
			System.out.println("Incorrect arguments format or arguments number.\nPlease, use the following format:\n java TaskTwo arg[0] arg[1] arg[2]");
		}

	}
	
}



// 3.Даны переменные A, B, C. Изменить их значения, переместив содержимое
// A -> C, C -> B, B -> A, и вывести новые значения переменных A, B, C.

class TaskThree {
	public static void main(String[]arg){

		float A;
		float B;
		float C;
		float Buffer;

		try{

		A=Float.parseFloat(arg[0]);
		B=Float.parseFloat(arg[1]);
		C=Float.parseFloat(arg[2]);

		System.out.println("Input data:");
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		System.out.println("C = "+C);

		Buffer = A;
		A = B;
		B = C;
		C = Buffer;

		System.out.println("New data:");
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		System.out.println("C = "+C);

		} catch (Exception e){
			System.out.println("Incorrect arguments format or arguments number.\nPlease, use the following format:\n java TaskThree arg[0] arg[1] arg[2]");
		}

	}
	
}




//4.Поменять местами содержимое переменных A и B, используя только эти две переменные, 
//и вывести новые значения A и B.

class TaskFour {
	public static void main(String[]arg){

		float A;
		float B;
		
		try{

		A=Float.parseFloat(arg[0]);
		B=Float.parseFloat(arg[1]);
		
		System.out.println("Input data:");
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		
 		A = A+B;
		B = A-B; //B=A-B=A+B-B=A
		A = A-B; //A=A-B=A+B-A=B
		

		System.out.println("New data:");
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		
		} catch (Exception e){
			System.out.println("Incorrect arguments format or arguments number.\nPlease, use the following format:\n java TaskFour arg[0] arg[1]");
		}

	}
	
}



// 5.Дано число A. Вычислить A^8, используя вспомогательную переменную и три
// операции умножения. Для этого последовательно находить A^2, A^4, A^8.
// Вывести все найденные степени числа A.

class TaskFive {
	public static void main(String[]arg){

		float A;
		float B;
		
		try{

		A=Float.parseFloat(arg[0]);
		
		B=A*A; //A^2
		System.out.println("A^2 = "+B);
		B=B*B; //A*A*A*A=A^4
		System.out.println("A^4 = "+B);
		B=B*B; //A*A*A*A*A*A*A*A=A^8
		System.out.println("A^8 = "+B);
	
 	
		} catch (Exception e){
			System.out.println("Incorrect arguments format or arguments number.\nPlease, use the following format:\n java TaskFive arg[0]");
		}
	}
}




// 6.Дано значение температуры T в градусах Фаренгейта. Определить значение
// этой же температуры в градусах Цельсия. Температура по Цельсию TC и
// температура по Фаренгейту TF связаны следующим соотношеним:
// TC=(TF–32)·5/9.

class TaskSix {
	public static void main(String[]arg){

		float TF; //Farenheit degrees
		float TC; //Celsius degrees
		
		try{

		TF=Float.parseFloat(arg[0]);
		
		TC=(TF-32)*5/9;
		System.out.println(TF+" Farenheit degrees are equal "+TC+" Celsius degrees");
		 	
		} catch (Exception e){
			System.out.println("Incorrect arguments format or arguments number.\nPlease, use the following format:\n java TaskSix arg[0]");
		}
	}
}



// 7.Дано значение температуры T в градусах Цельсия. Определить значение этой
// же температуры в градусах Фаренгейта. Температура по Цельсию TC и
// температура по Фаренгейту TF связаны следующим соотношением:
// TC=(TF–32)·5/9. Ввод температуры организовать через параметры командной cтроки.

class TaskSeven {
	public static void main(String[]arg){

		float TF; //Farenheit degrees
		float TC; //Celsius degrees
		
		try{

		TC=Float.parseFloat(arg[0]);
		
		TF=TC*9/5+32;
		System.out.println(TC+" Celsius degrees are equal "+TF+" Farenheit degrees");
		 	
		} catch (Exception e){
			System.out.println("Incorrect arguments format or arguments number.\nPlease, use the following format:\n java TaskSeven arg[0]");
		}
	}
}



// 8.Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем
// — его правую цифру (единицы). Для нахождения десятков использовать
// операцию деления нацело, для нахождения единиц — операцию взятия остатка
// от деления.

class TaskEight {
	public static void main(String[]arg){

		int twoDigitNumber; //tseloe dvuznachnoe chislo
		int dozensOf; //desjatki
		int units; //edinitsy
			
		try{

		twoDigitNumber=Integer.parseInt(arg[0]);
		
		dozensOf = twoDigitNumber/10;
		units = twoDigitNumber % 10;
		System.out.println("Dozens is equal "+dozensOf);
		System.out.println("Units is equal "+units);
		 	
		} catch (Exception e){
			System.out.println("Incorrect arguments format or arguments number.\nPlease, use the following format:\n java TaskEight arg[0]\n Be careful! arg[0] should be integer, two digits number");
		}
	}
}



// 9.Дано двузначное число. Найти сумму и произведение его цифр.

class TaskNine {
	public static void main(String[]arg){

		int twoDigitNumber; //tseloe dvuznachnoe chislo
		int dozensOf; //desjatki
		int units; //edinitsy
		int sum; 
		int mult;
			
		try{

		twoDigitNumber=Integer.parseInt(arg[0]);
		
		dozensOf = twoDigitNumber/10;
		units = twoDigitNumber % 10;
		sum = dozensOf + units;
		mult = dozensOf*units;
		System.out.println("Sum is equal "+sum);
		System.out.println("Multiplier is equal "+mult);
		 	
		} catch (Exception e){
			System.out.println("Incorrect arguments format or arguments number.\nPlease, use the following format:\n java TaskNine arg[0]\n Be careful! arg[0] should be integer, two digits number");
		}
	}
}



// 10. Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.

class TaskTen {
	public static void main(String[]arg){

		int twoDigitNumber; //tseloe dvuznachnoe chislo
		int dozensOf; //desjatki
		int units; //edinitsy
		int result;
			
		try{

		twoDigitNumber=Integer.parseInt(arg[0]);
		
		dozensOf = twoDigitNumber/10;
		units = twoDigitNumber % 10;
		result = 10*units+dozensOf;

		System.out.println("The first number is equal "+twoDigitNumber);
		System.out.println("The first number is equal "+ result);
		 	
		} catch (Exception e){
			System.out.println("Incorrect arguments format or arguments number.\nPlease, use the following format:\n java TaskTen arg[0]\n Be careful! arg[0] should be integer, two digits number");
		}
	}
}



// 11. Решить предыдущую задачу, не использую никаких дополнительных переменных.

class TaskEleven {
	public static void main(String[]arg){

		int twoDigitNumber; //tseloe dvuznachnoe chislo
		int buffer; /// Используется дополнительная переменная
					
		try{

		twoDigitNumber=Integer.parseInt(arg[0]);
		System.out.println("The first number is equal "+twoDigitNumber);
		
		buffer=twoDigitNumber % 10;
		twoDigitNumber = (twoDigitNumber-buffer)/10;
		twoDigitNumber = 10*buffer+twoDigitNumber;
		
		System.out.println("The second number is equal "+twoDigitNumber);
		 	
		} catch (Exception e){
			System.out.println("Incorrect arguments format or arguments number.\nPlease, use the following format:\n java TaskEleven arg[0]\n Be careful! arg[0] should be integer, two digits number");
		}
	}
}




// 12. Дано трехзначное число. Найти сумму и произведение его цифр.

class TaskTwelve {
	public static void main(String[]arg){

		int threeDigitNumber; //tseloe dvuznachnoe chislo
		int hundredsOf; //sotni
		int dozensOf; //desjatki
		int units; //edinitsy
		int sum; 
		int mult;
			
		try{

		threeDigitNumber=Integer.parseInt(arg[0]);
		
		hundredsOf = threeDigitNumber/100;
		dozensOf = (threeDigitNumber-hundredsOf*100)/10;
		units = threeDigitNumber % 10;
		sum = hundredsOf + dozensOf + units;
		mult = hundredsOf*dozensOf*units;
		System.out.println("hundredsOf is equal "+hundredsOf);
		System.out.println("dozensOf is equal "+dozensOf);
		System.out.println("units is equal "+units);
		System.out.println("Sum is equal "+sum);
		System.out.println("Multiplier is equal "+mult);
		 	
		} catch (Exception e){
			System.out.println("Incorrect arguments format or arguments number.\nPlease, use the following format:\n java TaskTwelve arg[0]\n Be careful! arg[0] should be integer, three digits number");
		}
	}
}



// Write a for loop that will print out all the multiples of 3 from 3 to 36, that is: 3 6 9 12 15 18 21 24 27 30 33 36.

class LoopOne {
	public static void main (String [] arg) {
		
		for (int i=3; i<=36; i=i+3) {
			System.out.println(i);
		}
	}
}




// Fill in the following main() routine so that it will ask the user to enter an integer, read the user’s response, and tell the user whether the number entered is even or odd. (Recall that an integer n is even if n % 2 == 0.)

import java.util.Scanner;
class EvenOddNumber{
	public static void main (String [] arg) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please, enter any integer number");
		int number = keyboard.nextInt();

		if (number%2==0){ 
			System.out.println("Your number is even");
		}
		else{
			System.out.println("Your number is odd"); 
		}
	}
}




// Write a program that uses Math.sin() and Math.cos() to check that the value of 
// sin2θ + cos2θ is approximately 1 for any θ entered as a command-line argument. 
// Just print the value. Why are the values not always exactly 1?
//import static java.lang.Math.*;

class SinCos{

	public static void main (String[]arg){
	
		double argument;
		double result;
			
		argument=Double.parseDouble(arg[0]);
  		result=Math.sin(argument)*Math.sin(argument)+Math.cos(argument)*Math.cos(argument);
		
		System.out.println(result);
	}
}



// Write a program that takes two positive integers as command-line arguments and
// prints true if either evenly divides the other.

class EvenlyDivides{
	public static void main (String[]arg){

		int numberOne;
		int numberTwo;
		int remainder;

		numberOne=Integer.parseInt(arg[0]);
		numberTwo=Integer.parseInt(arg[1]);

		if (numberOne>numberTwo){
			remainder=numberOne%numberTwo;
		} 
		else {
			remainder=numberTwo%numberOne;
		}

		if (remainder==0) {
			System.out.println("true");
		}
	}
}



// Write a program that takes three positive integers as command-line arguments 
// and prints true if any one of them is strictly greater than the sum of the other
// two and false otherwise.

class ThreeInt {
	public static void main (String[]arg){

		int numberOne;
		int numberTwo;
		int numberThree;

		numberOne=Integer.parseInt(arg[0]);
		numberTwo=Integer.parseInt(arg[1]);
		numberThree=Integer.parseInt(arg[2]);
	
		if (numberOne>(numberTwo+numberThree)){
			System.out.println("true");
		}
		else if (numberTwo>(numberOne+numberThree)){
			System.out.println("true");
		}
		else if (numberThree>(numberOne+numberTwo)){
			System.out.println("true");
		}
		else {
			System.out.println("false");	
		}
	}
}



// Write a program that takes two int values a and b from the command line and
// prints a random integer between a and b.

class RandomInt{
	public static void main (String[]arg){

		int numberOne;
		int numberTwo;
		int numberThree;
		
		numberOne=Integer.parseInt(arg[0]);
		numberTwo=Integer.parseInt(arg[1]);

			
		if (numberOne==numberTwo){
			System.out.println("Input data should be different");
		}
		else {
			numberThree=(numberOne+numberTwo)/2; /// Число должно быть случайным, а не средним
			System.out.println(numberThree);
		}			
	}
}



// Write a program that prints the sum of two random integers between 1 and 6
// (such as you might get when rolling dice).

class RollingDice{
	public static void main (String[]arg){
		int min = 1;
		int max = 6;
		double randomOne = min+Math.random()*((max-min)+1);/// Здесь лучше сразу использовать прямое преобразование в int
		double randomTwo = min+Math.random()*((max-min)+1);
		int sum;

		System.out.println("randomOne = "+(int) randomOne);
		System.out.println("randomTwo = "+(int) randomTwo);
		sum = (int) randomOne + (int) randomTwo;
		System.out.println("sum = "+sum);

	}
}




// Loan payments.
// Write a program that calculates the monthly payments you would have to make over a 
// given number of years to pay off a loan at a given interest rate compounded 
// continuously, taking the number of years t, the principal P, and the annual interest rate 
// r as command-line arguments. The desired value is given by the formula P*e(rt)
// Math.exp().

class LoanPayments{
	public static void main (String[]arg){
		int numberOfYears; //t
		double principal; //P
		double annualInterestRate; //r
		double monthlyPayments;

		numberOfYears=Integer.parseInt(arg[0]);
		principal=Double.parseDouble(arg[1]);
		annualInterestRate=Double.parseDouble(arg[2]);

		monthlyPayments=principal*Math.exp(annualInterestRate*numberOfYears);

		System.out.println("monthlyPayments = "+monthlyPayments);
	}
}



// Order check.
// Write a program that takes three double values x, y, and z as command-line arguments 
// and prints true if the values are strictly ascending or descending (x < y < z or x > y > z), 
// and false otherwise.

class OrderCheck{
	public static void main (String[]arg){

		double numberOne;
		double numberTwo;
		double numberThree;

		numberOne=Double.parseDouble(arg[0]);
		numberTwo=Double.parseDouble(arg[1]);
		numberThree=Double.parseDouble(arg[2]);

		if((numberOne<numberTwo&&numberTwo<numberThree)||(numberOne>numberTwo&&numberTwo>numberThree)){
			System.out.println("true");
		}
		else{	
			System.out.println("false");
		}
	
	}	
}



// Day of the week.
// Write a program that takes a date as input and prints the day of the week that date 
// falls on. Your program should take three command-line arguments: m (month), d (day), 
// and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 
// for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for 
// the Gregorian calendar:
// y0 = y - (14 - m) / 12
// x = y0 + y0/4 - y0/100 + y0/400
// m0 = m + 12 * ((14 - m) / 12) - 2
// d0 = (d + x + (31*m0)/ 12) mod 7

class DayOfTheWeek{
	public static void main (String[]arg){

		int m; //month
		int d; //day
		int y; //year


		m=Integer.parseInt(arg[0]);
		d=Integer.parseInt(arg[1]);
		y=Integer.parseInt(arg[2]);

		int y0 = y-(14-m)/12;
		int x = y0+y0/4-y0/100+y0/400;
		int m0 = m+12*((14-m)/12)-2;
		int d0 = (d+x+(31*m0)/12)%7;

		switch (d0) {

		case 1:
		System.out.println("Monday");
		break;

		case 2:
		System.out.println("Tuesday");
		break;

		case 3:
		System.out.println("Wednesday");
		break;

		case 4:
		System.out.println("Thursday");
		break;

		case 5:
		System.out.println("Friday");
		break;

		case 6:
		System.out.println("Saturday");
		break;

		default:
		System.out.println("Sunday");
		}

	}
}



// Color conversion.
// Write a program RG- BtoCMYK that converts RGB to CMYK. Take three integers 
// - red, green, and blue - from the command line and print the equivalent CMYK 
// values. If the RGB values are all 0, then the CMY values are all 0 and the K value 
// is 1; otherwise, use these formulas:
// RGB to CMYK formula:

class ColorConversion {
	public static void main (String[]arg){

		float red;
		float green;
		float blue;
		float cyan;
		float magenta;
		float yellow; 
		float black;
		float white;
		float whiteOne;


		red=Float.parseFloat(arg[0]);
		green=Float.parseFloat(arg[1]);
		blue=Float.parseFloat(arg[2]);

		if (red==0&&green==0&&blue==0) {
			cyan = 0;
			magenta = 0;
			yellow = 0; 
			black = 1;
		}
		else {
			whiteOne = Math.max(red/255, green/255);
			white = Math.max(whiteOne, blue/255);
			cyan = (white-red/255)/white;
			magenta = (white-green/255)/white;
			yellow = (white-blue/255)/white;
			black = 1-white;

		}

		System.out.println("cyan = " +cyan);
		System.out.println("magenta = " +magenta); 
		System.out.println("yellow = " +yellow);
		System.out.println("black = " +black);

	}	

}
