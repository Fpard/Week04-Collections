package Week4CollectionsCodingProject;


import java.text.DecimalFormat;

public class Week4CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//I. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93 };
		
		//a. Programmatically subtract the value of the first element in the array from the value in the last 
		//element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
		System.out.println("Question #1a.\n");
		
		for (int i=0; i < ages.length; i++) {
			
			if (i < ages.length - 1)
				System.out.print(ages[i] + ",");
			else
				System.out.println(ages[i]);
		}
		System.out.println("Array ages has length of: " + ages.length);
		System.out.println();
		System.out.println("Subtract the value of the first element in the array from the value in the last element of the array names ages = " + (ages [ages.length-1] - ages[0]));
		System.out.println();
		
		//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
		System.out.println("\n Question #1b.\n");
		
		int[] ages2 = {5, 15, 7, 23, 30, 55, 110, 77, 33};
		
        for (int i=0; i < ages2.length; i++) {
			
			if (i < ages2.length - 1)
				System.out.print(ages2[i] + ",");
			else
				System.out.println(ages2[i]);
		}
        // i. Make sure that there are 9 elements of type int in this new array. 
		System.out.println("Array ages2 has length of: " + ages2.length);
		System.out.println();
		
		//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in
		//the new array ages2 from the last element of ages2).
		System.out.println("Subtract the value of the first element in the array from the value in the last element of the array names ages2 = " + (ages2 [ages2.length-1] - ages2[0]));
		
		//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		
		// See the two for loops above.
		
		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		System.out.println("\n Question #1c.\n");
		int sum = 0;
				
		for (int i = 0; i < ages2.length-1; i++) {
			
			sum += ages2[i];
			
		}
				
		System.out.println("Average = " + sum/ages2.length);
		
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		
		String [] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		System.out.println("\n Question #2a.\n");
		
		int averageNumLettersPerName = 0;
		int sumOfLettersPerName = 0;
		
		for(String i: names) {
			
			sumOfLettersPerName += i.length();
			System.out.println(i);
		}
		averageNumLettersPerName = sumOfLettersPerName/names.length;
		
		System.out.println("Total number of letters in array names: " + sumOfLettersPerName);
		System.out.println("Average number of letters per name in array names: " + averageNumLettersPerName);
		
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		System.out.println("\n Question #2b.\n Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.");
		
		StringBuilder allElements = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			
			if (i < names.length-1)
			 allElements.append(names[i] + " ");
			else 
				allElements.append(names[i]);
		}
		System.out.println(allElements);
		
		//3. How do you access the last element of any array?
		System.out.println("\n Question #3.\n How do you access the last element of any array?");
		
		//String lastElement = names[names.length - 1];
		
		System.out.println("You access the last element of any array by accessing the index that is equaled to the legnth of the array minus one.");
		
		//4. How do you access the first element of any array?
		System.out.println("\n Question #4.\n How do you access the first element of any array?");
		
		//String firstElement = names[0];
		System.out.println("You access the first element of any array by accessing index 0.");
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array
		//   and add the length of each name to the nameLengths array.
		System.out.println("\n Question #5.\n Create a new array of int called nameLengths. Write a loop to iterate over the previously created"
				+ " names array\n and add the length of each name to the nameLengths array.");
		
		
		int [] nameLengths = new int [names.length];
		
		for (int i = 0; i < names.length; i++) {
			
			nameLengths[i] = names[i].length();
			
		}
		int count = 0;
		System.out.print(" Array nameLengths: [");
		for (int i: nameLengths){
			if (count < nameLengths.length-1)
			  System.out.print( i + ", ");
			else
				System.out.print(i + " ]");
			
		}
		System.out.println();
		
		
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		System.out.println("\n Question #6.\n");
		
		int sumOfNameLengthsElements = 0;
		for (int i: nameLengths) {
			sumOfNameLengthsElements += i;
			
		}
		
		System.out.println("Sum of all elements in the nameLengths array = " + sumOfNameLengthsElements );
		
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println("\n Question #7.\n");
		
		System.out.println(concatenateWord("Hello", 3));
		
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be
		//the first and the last name as a String separated by a space).
		System.out.println("\n Question #8.\n");
		
		String firstName = "Toussaint";
		String lastName = "L'ouverture";
		
		System.out.println(returnFullName(firstName, lastName));
		
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println("\n Question #9.\n");
		
		int[] anArray1 = {10, 25, 63, 85};
		int[] anArray2 = {10, 25, 33};
		
		for (int i: anArray1) {
		   System.out.print(i + " ");
		}
		
		System.out.println();
		
		if(returnTrueIfGreaterThan100(anArray1)) {
			
			System.out.println("The sum of the elements in this array is greater than 100.");
		} else {
			
			System.out.println("The sum of the elements in this array is not greater than 100.");
		}
		
		for (int i: anArray2) {
			   System.out.print(i + " ");
			}
		
		System.out.println();
		
			if(returnTrueIfGreaterThan100(anArray2)) {
				
				System.out.println("The sum of the elements in this array is greater than 100.");
			} else {
				
				System.out.println("The sum of the elements in this array is not greater than 100.");
			}
	
	   //10. Write a method that takes an array of double and returns the average of all the elements in the array.
			System.out.println("\n Question #10.\n");
			
			double[] anArrayOfDouble = {10.5, 25.75, 63.0, 85.42, 75.25, 15.23};
			System.out.println("Array of double: ");
			for (double i: anArrayOfDouble) {
				   System.out.print(i + " ");
				}
			System.out.println();
			System.out.println("Average = " + returnAverageOfArrayElements(anArrayOfDouble));
			
		//11. Write a method that takes two arrays of double and returns true if the average of the
		//elements in the first array is greater than the average of the elements in the second array.	
			System.out.println("\n Question #11.\n");
			
			double[] anArray1OfDouble = {10.5, 25.75, 63.0, 85.482, 75.25, 15.23};	
			double[] anArray2OfDouble = {10.5, 25.75, 63.0, 85.42, 75.25, 15.23};	
			
			if (returnIfAverageIsGreater(anArray1OfDouble, anArray2OfDouble )) {
				
				System.out.println("Average of the elements in the first array is greater than the average of the elements in the second array ");
			}
			else {
				
				System.out.println("Average of the elements in the first array is not greater than the average of the elements in the second array ");
			}
		
			//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
			//   and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			System.out.println("\n Question #12.\n");
			
			boolean isHotOutSide = false;
			double moneyInPocket = 45;
			
			if (willBuyDrink(isHotOutSide, moneyInPocket)) {
				
				System.out.println("Yes, will buy drink.");
			} else {
				
				System.out.println("No, will not buy drink.");
			}

			//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			System.out.println("\n Question #13.\n");
			
			
			double grossIncome = 150089.00;
			double incomeTaxRate = .28;
			double groceries = 120.00;
			double salesTaxRate = .06;
			DecimalFormat df = new DecimalFormat("#,###.##"); 
			
			System.out.println("Your income tax amount is $" + df.format(applyRates(grossIncome,incomeTaxRate)));
			
			
			System.out.println("Your total sales tax is $" + df.format(applyRates(groceries, salesTaxRate)));
			
			
	}// END MAIN
	
	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			
	
	public static StringBuilder concatenateWord(String word , int n) { 
		
		StringBuilder newWord = new StringBuilder();
		
		for(int i = 1; i <= n; i++) {
			
			newWord = newWord.append(word);
			
		}
		
		 return newWord;
	}
	
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be
	//the first and the last name as a String separated by a space).
	
	
	
	
	public static String returnFullName(String firstName, String lastName) {
		 
		String fullName = firstName + " " + lastName;
		
		
		return fullName;
	}
	
	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean returnTrueIfGreaterThan100(int[] anArray) {
		int sum = 0;
		boolean greaterThan100 = false;
		for (int i: anArray) {
			
			sum += i;
		}
		if (sum > 100) {
			
			greaterThan100 = true;
		}
		
		return greaterThan100;
	}
	
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double returnAverageOfArrayElements(double [] anArray){
		double sum = 0;
				
		for (int i = 0; i < anArray.length-1; i++) {
			
			sum += anArray[i];
			
		}
		return sum/anArray.length;
		
		
	}
	
	//11. Write a method that takes two arrays of double and returns true if the average of the
	//elements in the first array is greater than the average of the elements in the second array.	
	
	public static boolean returnIfAverageIsGreater(double[] array1, double[] array2) {
		
		
		double array1Ave, array2Ave, sum1, sum2;
		array1Ave = 0; 
		array2Ave = 0;
		sum1 = 0;
		sum2 = 0;
		
		
		for (double i: array1) {
			
			sum1 += i;
		}
		
		array1Ave = sum1 / array1.length;
		
		for (double i: array2) {
			
			sum2 += i;
		}
		
		array2Ave = sum2 / array2.length;
		
		
		
		return (array1Ave > array2Ave);
	}
	
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
	//   and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
	public static boolean willBuyDrink(boolean isHotOutSide, double moneyInPocket) {
		
		
		return(isHotOutSide && moneyInPocket > 10.5);
	}
	
	//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	// This method applies a rate to any value passed to it with the rate to be applied.
	public static double applyRates(double value, double rate) {
		
		return value * rate;
	}
	

}//End Class
