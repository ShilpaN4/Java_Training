package day7;

import java.util.regex.*;
import java.util.*;
public class Password {

	public static boolean
    isValidPassword(String password)
    {
  
        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }

        Matcher m = p.matcher(password);
        return m.matches();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter a string: "); 
		String str1= sc.nextLine(); 
		
		 if(isValidPassword(str1))
		 {
			 System.out.println("Valid Password");
		 }
		 else
			 System.out.println("Invalid password");
	}
}

