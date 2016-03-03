
import java.util.Arrays;
public class HomeWorkCW05 {

//создание массива ненулевых чисел

	public static int[] getArray (int length) {
		int [] originalArray = new int [length];
		for (int i= 0; i<originalArray.length; i++){
			originalArray[i] = (int) (1+Math.random() * 50);
		}
		return originalArray;
	}
	
	//печать элементов массива
	
	  public static void printArray (int[] arr) {
    	for (int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
    }

//41. Дано целое число K и массив из десяти целых ненулевых чисел. Вывести
//номер первого числа в массиве, большего K. Если таких чисел нет, то
//вывести 0.

	public static int getFirstBigNumber (int k, int [] arr) {
		int res = -1;
		for (int i=0; i<arr.length; i++){
			if (arr[i]>k){               
				res=i;
				break;
			}
		}
		return (res+1);
	}
	
//42. Дано целое число K и массив из десяти целых ненулевых чисел. Вывести
//номер последнего числа в массиве, большего K. Если таких чисел нет, то
//вывести 0.

	public static int getLastBigNumber (int k, int [] arr) { 
		int res = -1;
		for (int i = arr.length-1; i>=1; i--){
			if (arr[i]>k){                        
				res=i;
				break;
			}
		}
		return (res+1);
	}
	
	
//43. Дано вещественное число B, целое число N и массив из N целых чисел,
//упорядоченных по возрастанию. Вывести элементы массива вместе с числом B,
//сохраняя упорядоченность выводимых чисел.
	
	public static void getOrderedArrayPlusB (double b, int n, int [] arr) {
//		arr = getArray(n);
		
		boolean q = false;
		
		printArray(arr);
		System.out.println();
		
		Arrays.sort(arr);
		
		printArray(arr);
		System.out.println();
		
		for (int i=0; i < arr.length; i++) {
			if (arr[i]<=b) {
				System.out.print(arr[i]+" ");
			} else { 
				if (q == false){
					System.out.print(b+" ");
					q = true;
				} 
				System.out.print(arr[i]+" ");
			}
		}
		if (q == false){
			System.out.print(b);
		} 
	}

	//44. Дано целое число N и массив из N целых чисел, упорядоченный по
	//возрастанию. Данный набор может содержать одинаковые элементы. Вывести в
	//том же порядке все различные элементы данного массива.
	
	
	public static void printAllDiffElements(int n, int [] arr){
		printArray(arr);
		System.out.println();
		
		Arrays.sort(arr);
		
		printArray(arr);
		System.out.println();
		
		System.out.print(arr[0]+ " ");
		for (int i=1; i < arr.length; i++) {
			
			if (arr[i]!=arr[i-1]){
				System.out.print(arr[i] + " ");
			}
		}
	}
}
