/* Write the definition for a class called Time that has hours and minutes as integer. The class has the following behaviours/services/methods:
void setTime(int, int) to set the specified value in object
void showTime() to display time object
time sum(time) to sum two time object & return time */

package time.objects;
import distance.objects.Distance;
public class Time {
	private int hours;
	private  int minutes;
	 
	public void setTime(int hours,int minutes){
		this.hours=hours;
		this.minutes=minutes;
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public void showTime(){
		System.out.println(hours +":" +minutes );
	}

	public Time sum(Time objectOne, Time objectTwo){
		Time object=new Time();
		object.hours =objectOne.hours+ objectTwo.hours;
		object.minutes =objectOne.minutes + objectTwo.minutes;
		if(object.minutes >=60){
			object.minutes -=60;
			object.hours++;
		}
		object.showTime();
		return object;
	}
}
