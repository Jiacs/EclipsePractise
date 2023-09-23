package com.simplilearn.java.hello;
import java.util.Scanner;

public class Programming_by_Doing {
	public static void main(String[] args)
	{
		System.out.println("The Sum is " + addingValues(5) + ".");
		
		littleQuiz();  
	}
	private static int addingValues(int n)
	{
		int result = 0;
		String debugMessage = "";
		for(int i = 1; i<=n; i++)
		{
			debugMessage += i+" ";
			result += i;
		}
		System.out.println(debugMessage);
		return result;
	}
	
	private static void littleQuiz()
	{
		QuizQuestion[] quizQuestions = new QuizQuestion[3];
		quizQuestions[0] = new QuizQuestion("What is the capital of Alaska?", 
				new String[]{"Melbourne","Anchorage","Juneau"}, 
				2);
		quizQuestions[1]= new QuizQuestion("Can you store the value \"cat\" in a variable of type int?", 
				new String[]{"yes","no"}, 
				1);
		quizQuestions[2]= new QuizQuestion("What is the result of 9+6/3?", 
				new String[]{"5","11","15/3"}, 
				1);
		
		int score = 0;
		int input;
		
		Scanner in = new Scanner(System.in);
		for(int  i = 0; i<quizQuestions.length; i++)
		{
			quizQuestions[i].printQuestion(i);
			input = in.nextInt();
			if(quizQuestions[i].checkSolution(input))
			{
				score += 1;
			}
		}
		System.out.println("You final score is: " + score);
	}
}