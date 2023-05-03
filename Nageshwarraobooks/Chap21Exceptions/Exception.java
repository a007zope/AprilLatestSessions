package Chap21Exceptions;

public class Exception {
	
	public static void main(String[] args) {
		
		//opens the file 
		System.out.println("opens the file");
		
		// do some processing 
		
		int n = args.length;
		System.out.println("n ="+n);
		int a =45/n;
		
		System.out.println("a="+a);
		
		//close the files 
		
		System.out.println("close the files");
		
		/*
		 * out put is
		 * 
		 * opens the file
n =0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Chap21Exceptions.Exception.main(Exception.java:14)

		 */
		
	
		
	}

}
