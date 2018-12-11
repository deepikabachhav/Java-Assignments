/* 7)	Consider a CUI based application, where you are asking a user to enter his Login name and password, after entering the valid user-id and password it will print the message “Welcome” along with user name. As per the validation is concerned, the program should keep a track of login attempts. After three attempts a message should be flashed saying “Contact Admin” and the program should terminate. */

import java.util.Scanner;
class UserId_password{
	public static void main(String[] args){
		String userId;
		String password;
		String correctPassword="Deepika3007";
		int attempt=3;
		Scanner input= new Scanner(System.in);
		while( attempt != 0){
			System.out.println("Enter UserId :");
			userId= input.next();
			System.out.println("Enter Password :");
			password= input.next();
			if(password.equals(correctPassword)){
				System.out.println("Welcome" + userId);
			}
			else{
				System.out.println("Wrong Password");
				attempt--;
			}
		}
		if(attempt == 0)
			System.out.println("Contact Admin");
			
	}
}