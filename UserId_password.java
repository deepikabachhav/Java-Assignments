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