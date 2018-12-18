/* person class for checking age difference */

package person.classesandobjects;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;

public class Person {			//class Person and initialise data members.
	private String name;
	private Date dob;
	private int day;
	private int month;
	private int year;
	
	public Person(String name,int day,int month,int year){			//constructor of class person
		this.name= name;
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public void display(Period diff){			//display method for name, DOB and age.
		System.out.println("Name :"+ name);
		System.out.println("Date Of Birth :"+ day+ "/" +month + "/" +year);
		System.out.println("Age :"+ diff.getYears()+" years "+diff.getMonths()+ " months "+diff.getDays()+ " days ");
	}
	
	public String olderOne(Person persons) 		//method to identify older one.
	{	if(persons.year< year){
		return this.name;
		}
		else if(persons.year == year){
			if(persons.month < month)
				return this.name;
		}
		else if(persons.month == month)
		{
			if(persons.day < day)
				return this.name;
		}
		return persons.getName();
	}

	public int[] difference(Person persons) {	 //for calculate age difference.
			int[] difference =new int[3]; 
		  difference[0] = (persons.day < day) ? (day - persons.day) :(persons.day- day);
		  difference[1] = (persons.month < month) ? (month - persons.month) :(persons.month- month);
		  difference[2]= (persons.year < year) ? (year - persons.year) :( persons.year- year);
		  System.out.println (persons.olderOne(persons)  +" is older than " +this.name + " by " +difference[2]+ "  years " +difference[1]+ " months and "+ difference[0]+ " days"); 
		  return difference ;
	}
	
	public String getName() {		//getName() method for accessing name of person who is older.
		return name;
	}
}

	

