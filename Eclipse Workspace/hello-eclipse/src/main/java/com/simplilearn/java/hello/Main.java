package com.simplilearn.java.hello;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg)
	{
		System.out.println("Please enter a day in integer");
		Scanner s = new Scanner(System.in);
		int d_int = s.nextInt();
		Day_Of_Week dayofWeek = new Day_Of_Week();
		System.out.println(dayofWeek.convertToString(d_int));
	}
}
