/**
  * Interview coding challenges
  */

public class InterviewCC {

     public static void main(String []args){
         
        /**
         * write fibonacci series
         * (last two nums in sequence add to create next num in sequence)
         *
         * 0 1 1 2 3 5 8 13...
        */
        int num1 = 1, num2 = 0,  num3 = 0, i = 0;
        int n = 10;
        
        while(i<10){
            num3 = num1+num2;
            num1 = num2;
            num2 = num3;
            i++;
            System.out.print(num1+" ");
        }
        System.out.println();
     
     
        /**
         * check if number is prime
         * (prime numbers can't be divided without creating a remainder)
         * 
        */
        n = 13; 
        i = 2;
        boolean isPrime = true;
        
        while(i<n){
            if(n%i==0) isPrime = false; 
            i++;
        }
        
        System.out.println("Is prime: "+isPrime);
        System.out.println();
         
         
        /**
         * check if a string is a palindrome
         * (palindrome reads the same in reverse)
         * 
        */
         String str = "racecar", newStr = "";
         
         for(i=str.length()-1; i>=0; i--){
            newStr += str.charAt(i);
         }
         
         if(newStr.equals(str)) System.out.println("String is a palindrome");
         else System.out.println("String is not a palindrome");
         System.out.println();


         /**
          * check if an integer is a palindrome
          * 
         */
         n = 1001;
         str = Integer.toString(n);
         newStr = ""; // new string instance but w/same var name?
         
         for(i=str.length()-1; i>=0; i--){
             newStr += str.charAt(i);
         }
         
         // no longer an integer but it's a moot point if only concerned about
         // correct answer
         if(newStr.equals(str)) System.out.println("'Integer' is a palindrome");
         else System.out.println("'Integer' is not a palindrome");
         System.out.println();
        
     }
}
