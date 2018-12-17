/* Class date for implementing various test cases */

package dateAssignment.classesAndObject;

import java.util.Arrays;

public class Date {
	private int day, month, year;   	// data members to store the day, month and year of a date.
	public Date(int day, int month, int year)   	//constructor to initialize Date objects
	{
		//this.day=day;					//initialize day, month, year of the current object using the d, m, y parameters.
		//this.month=month;
		this.year=year;
		if((month==1 || month==3 || month==5 || month==7 || month ==8 || month==10 || month==12)&& (day > 32 || day<0) )
		{
				this.day=(Integer) null;
				this.month=month;
		}
		else if((month==4 || month==6 || month==9 || month==11 )&&(day >30 || day <0))
		{
			this.day=(Integer) null;
			this.month=month;
		}
		else if((month==2 && this.year%4==0 && day < 30) || (month==2 && this.year %4!= 0 && day <29))   //for leap year .
		{
			this.day= day;
			this.month=month;
		}
	}
	
	public String toString()		// method to get the value of a Date object printed
	{
		return ("Date : " +day + "/" + month + "/" +year); 			//return the value of a Date object as a String in d/m/y format.
	}
	
	public boolean isSmaller(Date dateTwo)	// method to check whether a date is smaller than the other 
	{
		if(dateTwo.year < year) {
			return true;
		}
			else if(dateTwo.year== year)
			{
				if(dateTwo.month < month)
					return true;
			}
			else if(dateTwo.month == month)
			{
				if(dateTwo.day < day)
					return true;
			}
			return false;
	}
	
	public int[] difference(Date dateTwo) 		//method to find out the difference of days, months and years in two dates.
	{
		int[] difference =new int[3]; 
		  difference[0] = (dateTwo.year < year) ? (year - dateTwo.year) :(dateTwo.year - year);
		  difference[1] = (dateTwo.month < month) ? (month - dateTwo.month) :(dateTwo.month - month);
		  difference[2]= (dateTwo.day < day) ? (day - dateTwo.day) :(dateTwo.day - day);
		  System.out.println(Arrays.toString(difference));
		  return difference ;
		}
}
