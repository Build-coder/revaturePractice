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
         
         // build a copy of the string but in reverse
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
         Integer.valueOf(n); // convert n back to an int
         System.out.println();
         
         
         /**
          * output the factorial of a given number
          * 
        */
        n = 5;
        i = 1;
        int f = 1;
        
        while(i<=n){
            f *= i; // same as f = f * i
            i++;        
        }
        
        System.out.println(f);
        
        
        /**
         * remove duplicates from an array
         * best way i've seen is to use a LinkedHashSet
         * a Set does not allow duplicates
         * a LinkedList maintains the order of insertion
        */
        int a[] = {5,2,6,8,6,7,5,2,8};
        
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        
        for(i=0; i<a.length; i++) { set.add(a[i]); }
        
        System.out.println(set);
        
        
        /**
         * check if two given strings are anagrams
         * (an anagram is a word that's letters can be rearranged
         * to create another word)
         * 
        */
        str = "SpaceJAm";
        newStr = "jaMspaCe";
        
        // standardize data by making it all lowercase
        str = str.toLowerCase();
        newStr = newStr.toLowerCase();
        
        // create an array of chars that's a copy of string
        char tempArray1[] = str.toCharArray();
        char tempArray2[] = newStr.toCharArray();
        
        // sort array of chars
        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);
       
        // convert array back to string
        str = Arrays.toString(tempArray1);
        newStr = Arrays.toString(tempArray2);
        
        // use .equals() on string to test if it holds the same value as another string
        if(str.equals(newStr)) System.out.println("They are anagrams");
        else System.out.println("They are not anagrams");
        System.out.println();
       
      }
}
