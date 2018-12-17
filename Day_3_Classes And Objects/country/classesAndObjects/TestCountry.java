/* Test class for testing largest area, largest population, largest population density */

package country.classesAndObjects;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestCountry {
	private Country []countries=new Country[4];
	
	@Before
	public void setUp(){
			countries[0]= new Country("India",460000, 65420.00);
			countries[1]= new Country("USA",400000, 2654200.00);
			countries[2]= new Country("china",3500000, 32520.00);
			countries[3]= new Country("Pakistan",450, 632420.00);
	}

	@Test
	public void TestLargestPopulation() {			//test case for largest population.
	long largestPopulation =0;
		for(int count=0; count< countries.length; count++){
			if(largestPopulation < countries[count].getPopulation()){
				largestPopulation= countries[count].getPopulation();
			}
		}
		assertEquals(3500000,largestPopulation);
	}
	
	@Test
	public void TestLargestArea() {			//test case for largest area.
	double largestArea = countries[0].getArea();
		for(int count=0; count< countries.length; count++){
			if(largestArea < countries[count].getArea()){
				largestArea= countries[count].getArea();
			}
		}
	assertEquals(2654200.0,largestArea,0.02);
	}
	
	@Test
	public void TestLargestPopulationDensity() {				//test case for largest population density.
	double largestPopulationDensity = 0;
	for(int count=0; count< countries.length; count++){
			if(largestPopulationDensity <countries[count].getPopulation()/countries[count].getArea()){
				largestPopulationDensity = countries[count].getPopulation()/countries[count].getArea();
			}
		}
	assertEquals(107.62,largestPopulationDensity,0.02);
	}
}