import java.util.Scanner;

class FirstLetterPrinter {

public static void main (String[] args) {

 	Scanner in = new Scanner(System.in);
 	String input = in.nextLine();
	System.out.println(firstLetterPrinter(input));
}
static String firstLetterPrinter(String str) {
 // write your code here
 	String temp="";

 String[] wordsOfString=str.split(" ");
 for(int i=0; i<wordsOfString.length;i++){
 		temp+=wordsOfString[i].charAt(0);
 }
 return temp;
 }
}