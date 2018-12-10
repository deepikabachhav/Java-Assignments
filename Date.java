import java.util.Scanner;
class Date{
	public static void main(String[] args){
		int date, month, year;
		String monthname=null;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the date :");
		date=input.nextInt();
		month= input.nextInt();
		year= input.nextInt();
		if (month == 01)
        	 	monthname = "January";
         	if (month == 02)
        		monthname = "February";
                if (month == 03)
        	        monthname = "March";
       	        if (month == 04)
        		 monthname = "April";
       	        if (month == 05)
        	 	monthname = "May";
         	if (month == 06)
        	 	monthname = "June";
         	if (month == 07)
        		 monthname = "July";
         	if (month == 8)
        	 	monthname = "August";
         	if (month == 9)
        	 	monthname = "September";
         	if (month == 10)
        	 	monthname = "October";
         	if (month == 11)
        	 	monthname = "November";
         	if (month == 12)
        	 	monthname = "December";
             	System.out.println("Display date in DD/ month-name/YYYY form is :"+ date+ "/" + monthname+ "/" + year );
         
	}
}