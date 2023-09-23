package com.simplilearn.java.hello;

public class Day_Of_Week {
	private String Days[] = {
		"Sunday",
		"Monday",
		"Tuesday",
		"Wednesday",
		"Thursday",
		"Friday",
		"Saturday"
	};
	private enum Days_enum{
		Sunday,
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturday
	}
	public String convertToString(int d_int)
	{
		if(d_int <= 0 || d_int>7)
		{
			return "Invalid Input";
		}
		return Days[d_int-1];
	}
	public String convertToStringEnum(int d_int)
}
