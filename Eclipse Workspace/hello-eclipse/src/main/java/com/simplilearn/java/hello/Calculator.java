package com.simplilearn.java.hello;

public class Calculator {

	public static void main(String[] args)
	{
		System.out.println("Add: " + add(3,5));
		System.out.println("Subtract: " + subtract(9,5));
		System.out.println("Multiple: " + multiple(3,5));
		System.out.println("Divide: " + divide(14,5));
		System.out.println("116 is Odd: " + isOdd(116));
		System.out.println("116 is Even: " + isEven(116));
		System.out.println("True XNOR False: " +xNOR(true, false));
	}
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int subtract(int a, int b)
	{
		return a-b;
	}
	public static int multiple(int a, int b)
	{
		return a*b;
		/*
		int result = 0;
		for(int i = 0; i<a; i++)
		{
			result += b;
		}
		return result;
		*/
	}
	public static double divide(int a, int b)
	{
		return a/(double)b;
	}
	public static int round(double a)
	{
		return (int)Math.round(a);
	}
	public static boolean isEven(int a)
	{
		return a%2 == 0;
	}
	public static boolean isOdd(int a)
	{
		return (a & 1)!=0;
	}
	public static boolean xNOR(boolean x, boolean y)
	{
		return (x&&y)||(!x && !y);
	}
	public static int addThreeNumber(int a, int b, int c)
	{
		return a+b+c;
	}
	public static boolean lessThan(int a, int b)
	{
		return a<b;
	}
}
