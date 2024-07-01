import java.util.Scanner;

public class MiddleSubstringCheck {
    public static boolean isMiddleSubstring(String mainString, String subString){
            int mainLen = mainString.length();
            int subLen = subString.length();

            if(subLen > mainLen){
                return false;
            }

            int start = (mainLen - subLen)/2;
            int end = start + subLen;

            return mainString.substring(start, end).equals(subString)||
                   mainString.substring(start + 1, end +1).equals(subString);
    }

    public static void main(String[] args){
        // String mainString = "abXYabc";
        // String subString = "XY";

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter First String : ");
	    
        String mainString = sc.nextLine();
		 
		System.out.print("Enter Second String : ");
		String subString=sc.nextLine();

        if(isMiddleSubstring(mainString, subString)){
            System.out.println("The substring \"" +subString + "\" appears in the middle of string \"" + mainString+ "\".");
        }else{
            System.out.println("The substring \"" +subString + "\" does not appears in the middle of string \"" + mainString+ "\".");

        }
    }
}
