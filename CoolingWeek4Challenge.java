package parts1and2; 

import java.util.Arrays;
//This code is all by Charles Cooling for the Promineo Tech Backend Software week 4 coding project
public class CoolingWeek4Challenge {
    public static void main(String args[]) {
      int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
      // We need to subtract the last value from the first.  Because arrays start at 0,
      // subtracting the 1 from the length is a good way to get the last element, and
      // the first element is, as stated prior, indexed at 0.
      int result = ages[ages.length-1] - ages[0];
      System.out.println(result); //prints 90
      
      // Now we declare a new array that will be 9 units large
      // and we'll make sure its nine units large.
      int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 100};
      System.out.println(ages2.length); //prints 9
      
      //We now subtract the last value from the first, like we did with the ages array
      int result2 = ages2[ages2.length-1] - ages2[0];
      System.out.println(result2);  // prints 97
      
      // Notice that the process used to subtract the last value from the first one is 
      // the same in both, despite having different lengths.  No matter how long 
      // the array is, index[0] will always be the first one and length-1 will
      // always be the last one, either array can change and it will still work.
      
      //Now we use a loop to find the average age
      // First, we create a value to hold the numbers going through the loop
      int count = 0;
      for (int i = 0; i < ages2.length; i++) {
    	  count += ages2[i];
      }
      // Then we can use an equation for the system to
      // derive the average.
     System.out.println(count/ages2.length); //returns 36
     
     /* Create an array of String called names that contains the 
      * following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”. */
      
     /* Use a loop to iterate through the array and calculate the average 
      * number of letters per name. Print the result to the console.*/
      String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
      //Next few variables will be Double to get a more accurate answer.
      double letters = 0; //finds the total amount of letters
      double nameCount = 0; //counts each name, each element of the array 
      for (int i = 0; i < names.length; i++) {
    	  letters += names[i].length();
    	  nameCount++;
      }
      double averageOfName = letters/nameCount;
      System.out.println(averageOfName);
      
      /* Use a loop to iterate through the array again and concatenate all the names together, 
       * separated by spaces, and print the result to the console. */
      String concatenatedNames = " "; // We will add the names to this as it goes through the array
      for (int i = 0; i < names.length; i++) {
    	  concatenatedNames += names[i] + " ";
      }
      System.out.println(concatenatedNames.trim()); //There is whitespace at the beginning, .trim() removes it
     
      // 3. How do you find the last element of an array?
      //    You can use the .length method
      System.out.println(ages[ages.length - 1]);
      
      // 4. How can you find the first element of any array?
      //    All arrays have an index that is can be printed.  
      //   Arrays always start with 0, so calling the for the "zeroeth"
      //   one will get the first of any array.
      		System.out.println(ages[0]); //returns 3
      		System.out.println(ages2[0]); //returns 3
      		
      // 5.    Create a new array of int called nameLengths. Write a loop to 
      		// iterate over the previously created names array and add the 
      		// length of each name to the nameLengths array.	
      		
      		//This makes the array 6 values without specifying what goes into it at first
      		int[] nameLengths = new int[names.length];
      		for (int i = 0; i < names.length; i++) {
      			nameLengths[i] = names[i].length();
      		}
      		// This returns gibberish if simply nameLengths is printed, 
      		// so on the internet I found a method called toString that 
      		// forces Java to return the strings instead of the hashcode
      		// 
      		System.out.println(Arrays.toString(nameLengths)); //Arrays.ToString forces Java to print the string
      		
      //6. Write a loop to iterate over the nameLengths array and
      //calculate the sum of all the elements in the array. Print the result to the console.
      
      // As we did earlier, we declare a variable at zero for the loop to count through
      		int sumCount = 0;
      		for (int i = 0; i < nameLengths.length; i++) {
      			sumCount += nameLengths[i]; // each element is being added to SumCount
      		}
      	// as SumCount was declared outside the loop, it can be called outside of it.  
      	// calling it outside of the loop ensures just the last part is printed.
  			System.out.println(sumCount); // returns 23
  			
  			
  			
  		/*  7. Write a method that takes a String, word, 
  			and an int, n, as arguments and returns the word 
  			concatenated to itself n number of times. (i.e. if I pass in 
  			“Hello” and 3, I expect the method to return “HelloHelloHello”).*/
  			System.out.println(stringRepeat("hello", 3));
  			System.out.println(stringRepeat("goodbye", 5));
  			
  			
  			// 8. Write a method that takes two Strings, firstName and lastName, 
  			// and returns a full name (the full name should be the first and the last 
  			// name as a String separated by a space).
  			System.out.println(fullName("Charley", "Cooling"));
  			 
  			// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
  			 // if (sum > 100) {
  			 // return true;
  			 int[] ages3 = {64, 2};
  			 System.out.println(overHundred(ages3));
  			 
  			 //10. Write a method that takes an array of double and 
  			 //    returns the average of all the elements in the array.
  			 double[] sweets = {8.22, 7.12, 6.12, 5.12};
  			System.out.println(doubleArrayAverage(sweets));
  			 
  			/*11. Write a method that takes two arrays of double and 
  			 * returns true if the average of the elements in the first 
  			 * array is greater than the average of the elements in the second array.*/
  			 double[] costs1 = {19.99, 29.99, 39.99, 49.99};
  			 double[] costs2 = {19.95, 29.95, 39.95, 49.95};
  			 double[] costs2B = {19.95, 29.95, 39.95, 49.95, 200};
  			System.out.println(arrayComparison(costs1,costs2B));
  			 /*
  			  * 12. Write a method called willBuyDrink that takes a boolean 
  			  * isHotOutside, and a double moneyInPocket, and returns true 
  			  * if it is hot outside and if moneyInPocket is greater than 10.50. 
  			  */
  			 	boolean isHotOutside = true;
  			 	double moneyInPocket = 10.1;
  			 	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
  			 	
  			 	
  			 /* 13. Create a method of your own that 
  			  * solves a problem. In comments, write what 
  			  * the method does and why you created it.
  			  */
  			 	System.out.println(shouldYouDrive(.40));
}
  			 
    	
    /*  7. Write a method that takes a String, word, 
		and an int, n, as arguments and returns the word 
		concatenated to itself n number of times. (i.e. if I pass in 
		“Hello” and 3, I expect the method to return “HelloHelloHello”).*/
		
		 public static String stringRepeat(String word, int num) {
			StringBuilder result = new StringBuilder(); //StringBuilder helps the console change Strings more easily
			 for (int i = 0; i < num; i++) {
				result.append(word); //literally glues the next string into the previous one
			 }
			return result.toString(); //.toString works it into StringBuilder
		}
		 
		 //8
		 public static String fullName(String firstName, String lastName) {
				return firstName + " " + lastName; //empty string in between is the space
				 }
		 
		 //9
		 public static boolean overHundred(int array[]) {
			 	int count3 = 0;
				for (int i = 0; i < array.length; i++) {
					count3 += array[i];
				}
				if (count3 > 100) { 
					return true;
				} else {
					return false;
				}
				 }
		 
		 //10 
		 public static double doubleArrayAverage(double[] array) {
			 double count2 = 0; //counters to run through the array; similar methods to previously
			 for (int i = 0; i < array.length; i++) {
		    	  count2 += array[i];
		      }
		      double doubleAverage = count2/array.length;
		      return doubleAverage;
		 }
		 
		 //11
		 public static boolean arrayComparison(double[] array, double[] array2) {
			 double count4 = 0; //counters to run through the array; similar methods to previously
			 double count5 = 0;
		      for (int i = 0; i < array.length; i++) {
		    	  count4 += array[i];
		      }
		      double firstAverage = count4/array.length;
		      
		      for (int i = 0; i < array2.length; i++) {
		    	  count5 += array2[i];
		      }
		      double secondAverage = count5/array2.length;
		      
		      if (firstAverage > secondAverage) { //Checks if the first average is larger than the second
		    	  return true;
		      } else {
		    	  return false;
		      }
		 }
		 
		 //12
		 public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			 return isHotOutside && moneyInPocket > 10.50;  // Because the method is a Boolean, Java implicitly
		 }													// knows that it would be False if this condition isn't met
		 
		 //13
		 public static String shouldYouDrive(double phonePercentage) {
			 	if (phonePercentage >= .33) { // Boolean to check percentage
			 		return "You can drive";
			 	} else {
			 		return "Wait until it's at 33% to drive";
			 	}
		 }
}

	
