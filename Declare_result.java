import java.util.Scanner;
class Declare_result {
	public static void main(String[] args) {
		int subject1Marks, subject2Marks, subject3Marks, result;
		Scanner student = new Scanner(System.in);
		System.out.println("Enter the marks of subject 1 : ");
		subject1Marks= student.nextInt();
		System.out.println("Enter the marks of subject 2 : ");
		subject2Marks= student.nextInt();
		System.out.println("Enter the marks of subject 3 : ");
		subject3Marks= student.nextInt();
		if(subject1Marks > 60 && subject2Marks > 60 && subject3Marks > 60){
			 System.out.println("Passed");
		}
		else if(((subject1Marks>60) && (subject2Marks> 60)) ||((subject3Marks > 60)&& (subject1Marks > 60)) || ((subject2Marks > 60) &&(subject3Marks >60))){
			 System.out.println("Promoted");
		}
		else if(((subject1Marks >60)||(subject2Marks >60) || (subject3Marks >60)) ||((subject1Marks <60)&&(subject2Marks <60) && (subject3Marks <60))){
			System.out.println("Failed");
		}
	}
}
