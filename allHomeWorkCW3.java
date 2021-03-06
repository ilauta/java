// 1. Write a function named countChars that has a String and a char as parameters. The function should count the number of times the 
// character occurs in the string, and it should return the result as the value of the function.

import java.util.Scanner;
class CharsCount {
    public static int getCountChars (String str, char a){
        int count=0;
        String [] stringarray = new String [str.length()];	/// А зачем этот массив?
        for (int i=0; i<str.length(); i++) {
            if (a==str.charAt(i)){
                count++;
            } 
        }
        return (count);    
    }

    public static void main (String [] args){    
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter any string");
        String str = keyboard.nextLine();
        System.out.println("Please, enter char to be find");
        char a = keyboard.next(".").charAt(0);
       
        int charcount = getCountChars(str, a);

        System.out.println(charcount);
    }
}
 

// Задачи на массивы

// +++Дан массив из 10-ти случайных целых чисел
// +++1 Поменять местами максимальный и минимальный элемент массива
// +++2 Найти элемент массива, значение которого находится ближе всего к 
// среднему значению максимального и минимального элементов массива.
// +++3. Изменить порядок следования элементов массива на противоположный
// +++4. Сдвинуть массив вправо (влево) так, чтобы минимальный (максимальный)
// элемент массива оказался первым(последним).
// +++5. Перетасовать массив.

import java.util.Scanner;
import java.util.Arrays;
class ArrayTask{

    public static int[] getOriginalArray (int length) {
        int [] originalArray = new int [length];
        for (int i= 0; i<originalArray.length; i++){
            originalArray[i] = (int) (Math.random() * 50);
        }
        return originalArray;
    }

    public static int[] getRandomArray (int [] originalArray) {
        int [] rArray = new int [originalArray.length];
        System.arraycopy(originalArray, 0, rArray, 0, originalArray.length);
        for (int i=0; i<rArray.length; i++){
            int randomindex1 = (int) (Math.random() * rArray.length);
            int randomindex2 = (int) (Math.random() * rArray.length);
            if (randomindex1!=randomindex2)  {
                rArray[randomindex1]=rArray[randomindex1]+rArray[randomindex2];
                rArray[randomindex2]=rArray[randomindex1]-rArray[randomindex2];
                rArray[randomindex1]=rArray[randomindex1]-rArray[randomindex2];
            }
        }
        return rArray;
    }

    public static int[] getReverseArray (int [] originalArray) {
        int [] revArray = new int [originalArray.length];
        System.arraycopy(originalArray, 0, revArray, 0, originalArray.length);
        for (int i = 0; i <= revArray.length/2-1; i++) { 
            revArray[i] = revArray[i] + revArray[revArray.length-1-i];
            revArray[revArray.length-1-i] = revArray[i] - revArray[revArray.length-1-i];
            revArray[i] = revArray[i] - revArray[revArray.length-1-i];
        }
        return revArray;
    }

    public static int getMax (int [] originalArray) {	/// Ну и назвать метод надо было бы getIndexOfMax() или как-то так...
        int maxarray = originalArray[0];
        int maxindex = 0;
        for (int i = 1; i < originalArray.length; i++) { 
            if (originalArray[i]>maxarray){
                maxarray=originalArray[i];
                maxindex=i;
            }
        }
        return maxindex;
    }

    public static int getMin (int [] originalArray) {
        int minindex = 0;
        int minarray = originalArray[0];
        
        for (int i = 1; i < originalArray.length; i++) { 
            if (originalArray[i]<minarray){
                minarray=originalArray[i];
                minindex=i;
            }
        }
        return minindex;
    }

    public static int getAverage (int [] originalArray) {
        int minindex = getMin(originalArray);
        int maxindex = getMax(originalArray);
        float average = Math.abs(((float) originalArray[minindex]+(float) originalArray[maxindex])/2 -(float) originalArray[0]) ;
        int averageindex = 0;
        int averagevalue;

        for (int i = 1; i < originalArray.length; i++) { 
            if (average > Math.abs( ((float) originalArray[minindex]+(float) originalArray[maxindex])/2 -(float) originalArray[i])) {
                average=Math.abs( ((float) originalArray[minindex]+(float) originalArray[maxindex])/2 - (float) originalArray[i]);
                averageindex=i;
                averagevalue = originalArray[i];
            }
        }
        return averageindex;
    }

    public static int[] getReverseMaxWithMinArray (int [] originalArray) {
        int [] revmmArray = new int [originalArray.length];
        System.arraycopy(originalArray, 0, revmmArray, 0, originalArray.length);
        
        int minindex = getMin(originalArray);
        int maxindex = getMax(originalArray);

        revmmArray[maxindex] = revmmArray[maxindex] + revmmArray[minindex];
        revmmArray[minindex] = revmmArray[maxindex] - revmmArray[minindex];
        revmmArray[maxindex] = revmmArray[maxindex] - revmmArray[minindex];
        
        return revmmArray;
    }

    public static int[] getShiftMinArray (int [] originalArray){
        int [] shiftMinArray = new int [originalArray.length];
        System.arraycopy(originalArray, 0, shiftMinArray, 0, originalArray.length);
        
        int minindex = getMin(originalArray);

        for (int j=0; j<shiftMinArray.length-minindex; j++) {
            for (int i = shiftMinArray.length-1; i >= 1; i--) {
                shiftMinArray[i]=shiftMinArray[i]+shiftMinArray[i-1];
                shiftMinArray[i-1]=shiftMinArray[i]-shiftMinArray[i-1];
                shiftMinArray[i]=shiftMinArray[i]-shiftMinArray[i-1];
            }
        }
        return shiftMinArray;
    }

    public static int[] getShiftMaxArray (int [] originalArray){
        int [] shiftMaxArray = new int [originalArray.length];
        System.arraycopy(originalArray, 0, shiftMaxArray, 0, originalArray.length);
        
        int maxindex = getMax(originalArray);

        for (int j=0; j<=maxindex; j++) {
            for (int i = 0; i<shiftMaxArray.length-1; i++) {
                shiftMaxArray[i]=shiftMaxArray[i]+shiftMaxArray[i+1];
                shiftMaxArray[i+1]=shiftMaxArray[i]-shiftMaxArray[i+1];
                shiftMaxArray[i]=shiftMaxArray[i]-shiftMaxArray[i+1];
            }
        }       
        return shiftMaxArray;
    }

    public static void printArray (int[] arr) {
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
               
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter array length");
        int N = keyboard.nextInt();

        int[] originalArray = getOriginalArray(N);
        int[] randomArray = getRandomArray(originalArray);
        int[] reverseArray = getReverseArray(originalArray);
        int[] reverseMaxMin = getReverseMaxWithMinArray(originalArray);
        int min = getMin(originalArray);
        int max = getMax(originalArray);
        int avg = getAverage(originalArray);
        int[] shiftMinArray = getShiftMinArray(originalArray);
        int[] shiftMaxArray = getShiftMaxArray(originalArray);

        System.out.print("originalArray ");
        printArray (originalArray);
        System.out.println();

        System.out.print("randomArray ");
        printArray (randomArray);
        System.out.println();

        System.out.print("reverseArray ");
        printArray (reverseArray);
        System.out.println();

        System.out.print("revers max with min ");
        printArray (reverseMaxMin);
        System.out.println();

        System.out.println("minarray " + min);
        System.out.println("maxarray " + max);
        System.out.println("index of Average " + avg);

        System.out.print("shift min <-- ");
        printArray (shiftMinArray);
        System.out.println();

        System.out.print("shift max --> ");
        printArray (shiftMaxArray);
        System.out.println();
    }
}


// 21. Дан номер года (положительное целое число). Определить количество дней в этом году, учитывая, что обычный год насчитывает 365 дней, а ви­
// сокосный — 366 дней. Високосным считается год, делящийся на 4, за исключением тех годов, которые делятся на 100 и не делятся на 400
// (например, годы 300, 1300 и 1900 не являются високосными, а 1200 и 2000 —являются).

import java.util.Scanner;
class TwentyOne{

    public static boolean isLeapYear (int yearNumber){
        return (yearNumber%4==0)^(yearNumber%100==0&&yearNumber%400!=0);
    }

    public static int getYearType (int yearNumber) {
        if ((yearNumber%4==0)^(yearNumber%100==0&&yearNumber%400!=0)){
        return 366;
        }
        else {
        return 365;
        }
    }

    public static void printYearType (int yearNumber) {
        if ((yearNumber%4==0)^(yearNumber%100==0&&yearNumber%400!=0)){
        System.out.println ("This year is leap and has 366 days");
        }
        else {
        System.out.println ("This year is regular and has 365 days");
        }
    }

    public static void main (String [] arg) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter any integer number");
        int number = keyboard.nextInt();
        
        System.out.println(isLeapYear(number));
        System.out.println(getYearType(number));
        printYearType(number);
    }
}

// 22. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — 
// февраль и т. д.). Вывести название соответствующего времени года и
// месяца, например, “март ­ весна”, “август ­ лето” и т.п.

import java.util.Scanner;
class TwentyTwo {
    public static String getMonthAndSeasons (int n) {		/// как я уже говорил, лучше использовать массивы.
															/// и во всех последующих заданиях
        String monthAndSeasons;

        switch (n) {

        case 1:
        monthAndSeasons = "January- Winter";
        break;

        case 2:
        monthAndSeasons = "February - Winter";
        break;

        case 3:
        monthAndSeasons = "Martch - Spring";
        break;

        case 4:
        monthAndSeasons = "April - Spring";
        break;

        case 5:
        monthAndSeasons = "May - Spring";
        break;

        case 6:
        monthAndSeasons = "June - Summer";
        break;

        case 7:
        monthAndSeasons = "July - Summer";
        break;

        case 8:
        monthAndSeasons = "August - Summer";
        break;

        case 9:
        monthAndSeasons = "September - Autumn";
        break;

        case 10:
        monthAndSeasons = "October - Autumn";
        break;

        case 11:
        monthAndSeasons = "November - Autumn";
        break;

        case 12:
        monthAndSeasons = "December - Winter";
        break;

        default:
        monthAndSeasons = "ERROR! Please, enter int number from 1 to 12";
        }
        return monthAndSeasons;
    }

    public static void printMonthAndSeasons (int n) {
        System.out.println (getMonthAndSeasons(n));
    }

    public static void main (String [] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter any integer from 1 to 12");
        int monthNumber = keyboard.nextInt();

        printMonthAndSeasons(monthNumber);
    }
}

// 23. Мастям игральных карт присвоены порядковые номера: 1 — пики, 2 —
// трефы, 3 — бубны, 4 — червы. Достоинству карт, старших десятки, присвоены
// номера: 11 — валет, 12 — дама, 13 — король, 14 — туз. Даны два целых
// числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты (1 ≤ M ≤ 4).
// Вывести название соответствующей карты вида «шестерка бубен», «дама
// червей», «туз треф» и т. п.

import java.util.Scanner;
class TwentyThree {

    public static String getColorCard (int n) {
        String colorCard;

        switch (n) {

        case 1:
        colorCard = "spades";
        break;

        case 2:
        colorCard = "clubs";
        break;

        case 3:
        colorCard = "diamonds";
        break;

        case 4:
        colorCard = "heards";
        break;

        default:
        colorCard = "ERROR! Please, enter int number from 1 to 4";
        }
        return colorCard;
    }

    public static String getValueCard (int n) {
        String valueCard;

        switch (n) {

        case 6:
        valueCard = "six";
        break;

        case 7:
        valueCard = "seven";
        break;

        case 8:
        valueCard = "eight";
        break;

        case 9:
        valueCard = "nine";
        break;

        case 10:
        valueCard = "ten";
        break;

        case 11:
        valueCard = "Jack";
        break;

        case 12:
        valueCard = "Queen";
        break;

        case 14:
        valueCard = "King";
        break;

        case 15:
        valueCard = "Ace";
        break;

        default:
        valueCard = "ERROR! Please, enter int number from 6 to 15";
        }
        return valueCard;
    }

    public static void printColorCard (int n) {
        System.out.println (getColorCard(n));
    }

    public static void printValueCard (int n) {
        System.out.println (getValueCard(n));
    }

    public static void main (String [] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter any integer from 1 to 4");
        int color = keyboard.nextInt();
        System.out.println("Please, enter any integer from 6 to 15");
        int value = keyboard.nextInt();

        printColorCard(color); 
        printValueCard(value);
    }
}

// 24. Дано целое число в диапазоне 100–999. Вывести строку­описание
// данного числа, например: 256 — «двести пятьдесят шесть», 814 — «восемьсот
// четырнадцать».

import java.util.Scanner;
class TwentyFour {

    public static String getTens(int n) {
        String valueTens;

        switch (n) {

        case 2:
        valueTens = "Twenty";
        break;

        case 3:
        valueTens = "Thirty";
        break;

        case 4:
        valueTens = "Fouty";
        break;

        case 5:
        valueTens = "Fifty";
        break;

        case 6:
        valueTens = "Sixty";
        break;

        case 7:
        valueTens = "Seventy";
        break;

        case 8:
        valueTens = "Eighty";
        break;

        case 9:
        valueTens = "Ninety";
        break;
                
        default:
        valueTens = "ERROR! Please, enter int number from 6 to 15";
        }
        return valueTens;
    }

    public static String getTensException(int n) {
        String valueTensException;

        switch (n) { 
        case 10:
        valueTensException = "Ten";
        break;

        case 11:
        valueTensException = "Eleven";
        break;

        case 12:
        valueTensException = "Twelve";
        break;

        case 13:
        valueTensException = "Thirteen";
        break;

        case 14:
        valueTensException = "Fourteen";
        break;

        case 15:
        valueTensException = "Fifteen";
        break;

        case 16:
        valueTensException = "Sixteen";
        break;

        case 17:
        valueTensException = "Seventeen";
        break;

        case 18:
        valueTensException = "Eighteen";
        break;

        case 19:
        valueTensException = "Nineteen";
        break;

        default:
        valueTensException = "ERROR! Please, enter int number from 6 to 15";
        }
        return valueTensException;
    }

    public static String getUnits(int n) {
        String valueUnits;

        switch (n) {

        case 1:
        valueUnits = "One";
        break;

        case 2:
        valueUnits = "Two";
        break;

        case 3:
        valueUnits = "Three";
        break;

        case 4:
        valueUnits = "Four";
        break;

        case 5:
        valueUnits = "Five";
        break;

        case 6:
        valueUnits = "Six";
        break;

        case 7:
        valueUnits = "Sevent";
        break;

        case 8:
        valueUnits = "Eight";
        break;

        case 9:
        valueUnits = "Nine";
        break;
                
        default:
        valueUnits = "ERROR! Please, enter int number from 6 to 15";
        }
        return valueUnits;
    }
        
    public static void main (String [] args) {		/// Проверь программу для случаев, когда вторая и/или третья цифра 0 (805, 750, 200)

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter positive theree number untegerinteger");
        int abc = keyboard.nextInt();

        int a = abc/100;
        int b = abc/10-10*a;
        int c = abc%10;

        if (b==1) {
            System.out.println(abc+" is " +getUnits(a)+" Hundred and "+getTensException (10*b+c));
        }
        else if (b==0&&c==0) {
            System.out.println(abc+" is " +getUnits(a) +" Hundred");
        }
        else if (b==0) {
            System.out.println(abc+" is " +getUnits(a)+" Hundred and "+ getUnits(c));
        }
        else {
            System.out.println(abc+" is " + " " + getUnits(a) +" Hundred and "+ getTens(b) +" "+ getUnits(c));
        }
    }
}


// 25. В восточном календаре принят 10­летний цикл, состоящий из 2­летних
// подциклов, обозначаемых названиями цвета: 
// зеленый, 
// красный, 
// желтый, 
// белый
// черный.

// В каждом подцикле годы носят названия животных: 

// крысы, 
// коровы,
// тигра, 
// зайца,
// дракона, 
// змеи, 
// лошади, 
// овцы, 
// обезьяны, 
// курицы, 
// собаки 
// свиньи. 

// По номеру года определить его название, если 1984 год — начало
// цикла: «год зеленой крысы».


import java.util.Scanner;
class TwentyFive {
    public static String getYearAnimal (int n){
        
        String valueYearAnimal;

        switch (n) {

        case 0:
        valueYearAnimal = "Rat";
        break;

        case 1:
        valueYearAnimal = "Ox";
        break;

        case 2:
        valueYearAnimal = "Tiger";
        break;

        case 3:
        valueYearAnimal = "Rabbit";
        break;

        case 4:
        valueYearAnimal = "Dragon";
        break;

        case 5:
        valueYearAnimal = "Snake";
        break;

        case 6:
        valueYearAnimal = "Horse";
        break;

        case 7:
        valueYearAnimal = "Goat";
        break;

        case 8:
        valueYearAnimal = "Monkey";
        break;

        case 9:
        valueYearAnimal = "Rooster";
        break;

        case 10:
        valueYearAnimal = "Dog";
        break;

        case 11:
        valueYearAnimal = "Pig";
        break;
                
        default:
        valueYearAnimal = "ERROR!";
        }
        return valueYearAnimal;
    }
    public static String getYearAnimalInverted (int n){
        
        String valueYearAnimalInverted;

        switch (n) {

        case 0:
        valueYearAnimalInverted = "Rat";
        break;

        case 11:
        valueYearAnimalInverted = "Ox";
        break;

        case 10:
        valueYearAnimalInverted = "Tiger";
        break;

        case 9:
        valueYearAnimalInverted = "Rabbit";
        break;

        case 8:
        valueYearAnimalInverted = "Dragon";
        break;

        case 7:
        valueYearAnimalInverted = "Snake";
        break;

        case 6:
        valueYearAnimalInverted = "Horse";
        break;

        case 5:
        valueYearAnimalInverted = "Goat";
        break;

        case 4:
        valueYearAnimalInverted = "Monkey";
        break;

        case 3:
        valueYearAnimalInverted = "Rooster";
        break;

        case 2:
        valueYearAnimalInverted = "Dog";
        break;

        case 1:
        valueYearAnimalInverted = "Pig";
        break;
                
        default:
        valueYearAnimalInverted = "ERROR!";
        }
        return valueYearAnimalInverted;
    }
    public static String getYearColor (int n){
        
        String valueYearColor;

        switch (n) {

        case 0:
        case 1:
        valueYearColor = "green";
        break;

        case 2:
        case 3:
        valueYearColor = "red";
        break;

        case 4:
        case 5:
        valueYearColor = "yellow";
        break;

        case 6:
        case 7:
        valueYearColor = "white";
        break;

        case 8:
        case 9:
        valueYearColor = "black";
        break;

        default:
        valueYearColor = "ERROR!";
        }
        return valueYearColor;
    }
    public static String getYearColorInverted (int n){
        
        String valueYearColorInverted;

        switch (n) {

        case 0:
        valueYearColorInverted = "green";
        break;

        case 9:
        case 8:
        valueYearColorInverted = "red";
        break;

        case 7:
        case 6:
        valueYearColorInverted = "yellow";
        break;

        case 5:
        case 4:
        valueYearColorInverted = "white";
        break;

        case 3:
        case 2:
        valueYearColorInverted = "black";
        break;

        case 1:
        valueYearColorInverted = "black";
        break;

        default:
        valueYearColorInverted = "ERROR!";
        }
        return valueYearColorInverted;
    }
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter any year number");
        int year = keyboard.nextInt();

        int colorYear = (Math.abs(year-1984)%10);
        int animalYear = (Math.abs(year-1984)%12);
        if (year >= 1984){
        System.out.println("year is "+year+getYearColor(colorYear)+getYearAnimal(animalYear));
        }
        else{
        System.out.println("year is "+year+getYearColorInverted(colorYear)+getYearAnimalInverted(animalYear));  
        }
    }
}

// 27. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел от
// A до B включительно.


import java.util.Scanner;
class TwentySeven{
    public static float getSum (float a, float b){
        float valueSum = (a+b)/2 * (b-a+1);
        return valueSum;
    }
    public static void printSum (float a, float b){
        System.out.println(getSum(a,b));
    }
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter any integer");
        int a = keyboard.nextInt();
        System.out.println("Please, enter any integer bigger, than previous");
        int b = keyboard.nextInt();

        printSum(a,b);
    }
}
