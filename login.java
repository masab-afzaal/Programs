public import java.util.*;

class login{
	public static void main(String[] args){
		int flag = 0,password_yes = 0,i,email_yes = 0;
		char choice = 'n';
		String checker_e,checker_p, limit = "12345678",email,password;        
		
		String[][] userinfo = { {"a@gmail.com","01234567"},
								{"b@gmail.com","12345678"},
								{"c@gmail.com","135791113"},
								{"d@gmail.com","24681012"},
								{"e@gmail.com","12442169"}
		};
		Scanner sc = new Scanner(System.in);
		do{

			System.out.println("Enter Your Email Address: ");
			System.out.print("");
			email = sc.nextLine();
			
			while(true){
				System.out.println("Enter Your Password: ");
				password = sc.nextLine();
				if(password.length() >= limit.length()){
					break;
				}
				else if(password.length() <= limit.length()){
					System.out.println("Password Must Be Atleast 8 characters! ");
					continue;
				}
			}
			
            for(i=0;i<5;i++){
                checker_e = userinfo[i][0];
				if(checker_e.equalsIgnoreCase(email)){
                    email_yes = 1;
                }             
            }
            if(email_yes != 1){
                System.out.println("Wrong Email Entered!");
            }
            
			for(i=0;i<5;i++){
				checker_e = userinfo[i][0];
                checker_p = userinfo[i][1];
                if(email_yes != 1){
					password_yes = 1;
                    break;
                }
                else if((checker_e.equalsIgnoreCase(email)) && (checker_p.equals(password))){
                    choice = 'n';
                   System.out.println("Welcome To Your Profile!");
                   flag = 1;
                   password_yes = 1;
                   break; 
                }
                if(!checker_p.equals(password)){
                    password_yes = 0;
                }                   
			}
			
            if(password_yes == 0){
                System.out.println("Wrong Password Entered! Please Try Again.");
            }
            if(flag == 0){
            System.out.println("Would You Like To Try Again?  (y/n)");
			choice = sc.next().charAt(0);
			sc.nextLine();
            }
		}
		while(choice == 'y' || choice == 'Y');
	}
}
