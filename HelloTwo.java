// 2. Modify the example program so that it uses many command line arguments and prints greeting for every name



class HelloTwo {
	public static void main (String[]args){
	for (String s: args)  
 		System.out.println("Hello "+s);
 }
}