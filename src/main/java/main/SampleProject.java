package main;
//import java.util.*;
public class SampleProject {
	//print  Hello world! in the console
	public static String printHello() {
		//print Hello world! in the console!
		String c = "Hello World!";
		return c;
	}
	
	public static int add(int a,int b) {
		int c = a+b;
		return c;
	}
	public static void main(String args[]) {
		System.out.println(printHello());
		//Scanner sc =new Scanner(System.in);
		//int aa =sc.nextInt();
		//int bb =sc.nextInt();
		System.out.println(add(46,3));
		//sc.close();
	}
	
}