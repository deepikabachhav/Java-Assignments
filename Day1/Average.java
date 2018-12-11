/* Write a program to find total marks and average of the students */

import java.util.Scanner;
class Average{
	static int studentsTotal=0;

	static int totalMarks(int subjectOne, int subjectTwo,int subjectThree){
	int totalMark= (subjectOne+ subjectTwo+subjectThree);
	return totalMark;
	}
		
	static float averageMark(int totalMark){
	float average= (totalMark/3);
	return average;
	}
	public static void main(String[] args){
		int subjectOne=0,subjectTwo=0, subjectThree=0,student;
		Scanner input= new Scanner(System.in);
		for(student=1; student<=3; student++){
			System.out.println("Enter the mark of subject one :");
			subjectOne= input.nextInt();
		
			System.out.println("Enter the mark of subject two :");
			subjectTwo= input.nextInt();

			System.out.println("Enter the mark of subject three :");
			subjectThree= input.nextInt();

			int totalMark= totalMarks(subjectOne, subjectTwo, subjectThree);
			System.out.println("Total Marks of all subjects" +totalMark);	

			float average= averageMark(totalMark);
			System.out.println("Average of all subjects :" + average);
			studentsTotal+=totalMark;
		}
		System.out.println("Total marks of all students :" +studentsTotal);
		System.out.println("Average marks of all students :" +(studentsTotal/9));
	}
		
	
}
