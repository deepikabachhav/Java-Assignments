/* Class date for implementing various test cases */

package dateAssignment.classesAndObject;
public class Date {
	private int day, month, year;   	// data members to store the day, month and year of a date.
	public Date(int day, int month, int year)   	//constructor to initialize Date objects
	{
		this.day=day;					//initialize day, month, year of the current object using the d, m, y parameters.
		this.month=month;
		this.year=year;
	}
	
	public String toString()		// method to get the value of a Date object printed
	{
		return ("Date : " +day + "/" + month + "/" +year);		//return the value of a Date object as a String in d/m/y format.
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
		return difference ;
	}
}
