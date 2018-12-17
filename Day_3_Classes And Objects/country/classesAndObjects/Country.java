/* Define a class Country that stores the name of the country, its population, and its area. Using that class, write a test program that creates a few countries and stores them in an array and then prints
The country with the largest area
The country with the largest population
The country with the largest population density (people per square mile)*/

package country.classesAndObjects;
public class Country {
	private  String nameOfCountry;
	private  double area;
	private  long population;
	
	 Country (String nameOfCountry, long population, double area){
		 this.nameOfCountry=nameOfCountry;
		 this.area=area;
		 this.population=population;
	}
	 
	 public String getNameOfCountry(){
		 return this.nameOfCountry=nameOfCountry;
	 }
	 
	 public  long getPopulation(){
		 return this.population=population;
	 } 
	 
	 public double getArea(){
		 return this.area=area;
	 }
}
