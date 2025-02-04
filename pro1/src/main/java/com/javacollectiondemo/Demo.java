package com.javacollectiondemo;

import java.util.stream.IntStream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1st way to call recursive function means print 1  to 100 numbers without using any loop
		IntStream.range(1, 100).forEach(e-> System.out.println(e));
		
		//2nd way to call recursive function means print 1 to 100 numbers without using any loop
		printNumber(1);
		public static void  printNumber(int n)
		{
			if(n<=100)
				System.out.println(n);
			n++;
			printNumber(n);
		}
	}

}
