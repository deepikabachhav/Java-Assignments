/*Write a class called Triangle that can be used to represent a triangle. It should include the following methods that return boolean values indicating if the particular property holds:
isRight (a right triangle)
isScalene (no two sides are the same length)
isIsosceles (exactly two sides are the same length)
isEquilateral (all three sides are the same length)
Write a simple tester program that creates a few triangles and asks them about their type. */

package triangle.classesAndObjects;
public class Triangle {
	private double sideOne;
	private double sideTwo;
	private double sideThree;
	
	Triangle(double sideOne, double sideTwo, double sideThree){
		this.sideOne=sideOne;
		this.sideTwo=sideTwo;
		this.sideThree=sideThree;
	}

	public boolean isRight(){			//method to check is it right angle triangle or not.
		double largestSide=0;
		if(sideOne > sideTwo && sideOne >sideThree){
			largestSide=sideOne;
			return(largestSide*largestSide==sideTwo*sideTwo + sideThree*sideThree)?  true: false;
		}
		else if(sideTwo > sideThree && sideTwo >sideOne){
			largestSide=sideTwo;
			return(largestSide*largestSide==sideOne*sideOne + sideThree*sideThree)?  true: false;
		}
		else if(sideThree > sideTwo && sideThree >sideOne){
			largestSide=sideThree;
		return(largestSide*largestSide==sideOne*sideOne + sideTwo*sideTwo)?  true: false;
		}
		return (Boolean) null;
	}
	
	public boolean isScalene (){				// method to check triangle is scelene or not.
		if(sideOne!=sideTwo && sideTwo!=sideThree && sideOne!=sideThree){
			return true;
		}
		else
			return false;
	}
	
	public boolean isIsosceles (){			//method to check triangle is isoceles or not.
		if(sideOne==sideTwo || sideTwo==sideThree || sideThree==sideOne){
			return true;
		}
		else
		return false;
	}
	

	public boolean isEquilateral (){				//method to check triangle is equilateral or not.
		if(sideOne==sideTwo && sideTwo==sideThree && sideOne==sideThree ){
			return true;
		}
		else
		return false;
	}
}
