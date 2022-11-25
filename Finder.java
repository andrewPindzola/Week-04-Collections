package open;

public class Finder {
	
	//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	static String method1(String word, int n) {
		String superWord = "";
		for (int i = 0; i < n; i++) {
			superWord += word;
		}
		return superWord;
	}
	//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	static String method2(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	static boolean method3(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		if (sum > 100) {
			return true;
		} else {	
			return false;
		}
	}
	//Write a method that takes an array of double and returns the average of all the elements in the array.
	static double method4(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double avg = sum / array.length;
		return avg;
	}
	//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	static boolean method5(double[] array1, double[] array2) {
		double sum1 = 0;
		for (int i = 0; i < array1.length; i++) {
			sum1 += array1[i];
		}
		double avg1 = sum1 / array1.length;
		double sum2 = 0;
		for (int i = 0; i < array2.length; i++) {
			sum2 += array2[i];
		}
		double avg2 = sum2 / array2.length;
		if (avg1 > avg2) {
			return true;
		} else {
			return false;
		}
	}
	//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true || moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	//this method finds the slope of the linear regression line of two arrays of numbers.
	static double slopeRegression(int[] arrayX, int[] arrayY) {
		if (arrayX.length != arrayY.length) {
			return 0.0;
		}
	int sumX = 0;
	int sumY = 0;
	int sumP = 0;
	int sumX2 = 0;
	int sumY2 = 0;
	for (int i = 0; i < arrayX.length; i++) {
		sumX += arrayX[i];
		sumY += arrayY[i];
		int product = arrayX[i] * arrayY[i];
		int squaredX = arrayX[i] * arrayX[i];
		int squaredY = arrayY[i] * arrayY[i];
		sumP += product;
		sumX2 += squaredX;
		sumY2 += squaredY;
	}	
	double slope = ((arrayX.length * sumP) - (sumX * sumY)) / ((arrayX.length * sumX2) - (sumX * sumX));	
		return slope;
	}
	
	
	
	public static void main(String[] args) {
		int[] height = {1,3,5,3,7,4,8,3,7,8};
		int[] ages = {3,9,23,64,2,8,28,93,13,34};
		
		System.out.println(slopeRegression(ages, height));
			int firstAge = 0;
			int lastAge = 0;
			
		for (int i = 0 ; i < ages.length; i++) {
			if (i == 0) {
				firstAge = ages[i];
			} if (i == ages.length - 1) {
				lastAge = ages[i];
			}
		}
		int diffAge = lastAge - firstAge;
		
		System.out.println("The difference in first age and last age is: " + diffAge);
		//next we calculate the average of the ages in the array
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		double avg = sum / (ages.length);
		System.out.println("The average is: " + avg);
		//Create an array of Strings
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		int sum1 = 0;
		for (String nam : names) {
			sum1 += nam.length();
		}
		
		int x = 0;
		for (int i = 0; i < names.length; i++) {
			String namy = names[i];
			x += namy.length();
		}
		System.out.println(x + " test");//test
		double averageChar = sum1 / names.length;
		System.out.println("Average number of characters in the String array: " + averageChar);
		
		String counter = "";
		for (int i = 0; i < names.length; i++) {
			counter += names[i];
		}
		System.out.println(counter);
		//How do you access the last element of any array?
		int lastElement = ages[ages.length - 1];
		System.out.println(lastElement + " will be the last element in the array");
		//How do you access the first element of any array?
		int firstElement = ages[0];
		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[6];
		
		for (int i = 0; i < names.length; i++) {
			String namePlace = names[i];
			int nameLength = namePlace.length();
			nameLengths[i] = nameLength;
		}
		for (int thing : nameLengths) {
			System.out.println(thing);
		}
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sum2 = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum2 += nameLengths[i];
		}
		System.out.println(sum2 + " is the sum of the nameLengths array elements");
		//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		/* see above */
		//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		/* see above */
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		/* see above */
		//Write a method that takes an array of double and returns the average of all the elements in the array.
		/* see above */
		//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		/* see above */
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		/* see above */
		//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		/* see above */
	}
}
