package com.simplilearn.java.hello;

public class QuizQuestion {
	private String m_question;
	private String[] m_options;
	private int m_correctAnswer;
	
	QuizQuestion(String question, String[] options, int correctAnswer)
	{
		m_question = question;
		m_options = options;
		m_correctAnswer = correctAnswer;
	}
	public void setQuestion(String question, String[] options, int correctAnswer)
	{
		m_question = question;
		m_options = options;
		m_correctAnswer = correctAnswer;
	}
	public void printQuestion(int questionID)
	{
		System.out.println("Q" + questionID + ") " + m_question);
		for(int i=1;i<=m_options.length; i++)
		{
			System.out.println("	" + i + ") " + m_options[i-1]);
		}
	}
	public boolean checkSolution(int answer)
	{
		if(answer - 1 == m_correctAnswer)
		{
			System.out.println("Correct!");
			return true;
		}
		else
		{
			System.out.println("Wrong! The correct answer is " + (m_correctAnswer + 1));
			return false;
		}
	}
}
