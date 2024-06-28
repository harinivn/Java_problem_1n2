//1 ) Write a Java program to read two strings append them together and return the result. If the strings are different lengths, 
//remove characters from the beginning of the longer string and make them equal lengths.

import java.util.Scanner;

public class Substring {
    
    public String concat(String st1, String st2) {
        if (st1.length() == st2.length())
            return st1 + st2; 
        
        if (st1.length() > st2.length()) {
            int diff = st1.length() - st2.length();
            return st1.substring(diff, st1.length()) + st2; 
        } else {
            int diff = st2.length() - st1.length(); 
            return st1 + st2.substring(diff, st2.length());
        }
    }

    public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        Substring obj= new Substring(); 

        System.out.print("Enter First String : ");
	    
        String str1 = sc.nextLine();
		 
		System.out.print("Enter Second String : ");
		String str2=sc.nextLine();
		
        // String str1 = "Developer"; 
        // String str2 = "code";   
        
        System.out.println("The given strings are: " + str1 + " and " + str2);
        System.out.println("The new string is: " + obj.concat(str1, str2));
    }
}
