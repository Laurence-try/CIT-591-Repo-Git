import java.util.*;
public class Main {
   public static String DigitToWord(int digitIn) {
	   String digit = null;
	   if (digitIn == 0) {
		   digit = "zero";
		   return digit;
	   }
	   else if (digitIn == 1) {
		   digit = "one";
		   return digit;
	   }
	   else if (digitIn == 2) {
		   digit = "two";
		   return digit;
	   }
	   else if (digitIn == 3) {
		   digit = "three";
		   return digit;
	   }
	   else if (digitIn == 4) {
		   digit = "four";
		   return digit;
	   }
	   else if (digitIn == 5) {
		   digit = "five";
		   return digit;
	   }
	   else if (digitIn == 6) {
		   digit = "six";
		   return digit;
	   }
	   else if (digitIn == 7) {
		   digit = "seven";
		   return digit;
	   }
	   else if (digitIn == 8) {
		   digit = "eight";
		   return digit;
	   }
	   else if (digitIn == 9){
		   digit = "nine";
		   return digit;
	   }
	   else {
		   System.out.println("Error");
		   return null;
	   }
   } 
   
   public static String TensDigitToWord(int digitIn) { 
      
	   String digit = null;
	   if (digitIn == 2) {
		   digit = "twenty";
		   return digit;
	   }
	   else if (digitIn == 3) {
		   digit = "thirty";
		   return digit;
	   }
	   else if (digitIn == 4) {
		   digit = "forty";
		   return digit;
	   }
	   else if (digitIn == 5) {
		   digit = "fiffty";
		   return digit;
	   }
	   else if (digitIn == 6) {
		   digit = "sixty";
		   return digit;
	   }
	   else if (digitIn == 7) {
		   digit = "seventy";
		   return digit;
	   }
	   else if (digitIn == 8) {
		   digit = "eighty";
		   return digit;
	   }
	   else if (digitIn == 9) {
		   digit = "ninety";
		   return digit;
	   }
	   else {
		   System.out.println("Error");
		   return null;
	   }
      
   } 
   
   public static String TwoDigitNumToWords(int numIn) { 
      int first_digit = numIn % 10;
      int second_digit = numIn / 10;
      String first_digit_str = DigitToWord(first_digit);
      String second_digit_str = TensDigitToWord(second_digit);
      String word_digit = first_digit_str + second_digit_str;
      System.out.println(word_digit);
      return word_digit;
      
   } 
   
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      TwoDigitNumToWords(num);
      
   }
}