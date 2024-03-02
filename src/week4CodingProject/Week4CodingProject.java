package week4CodingProject;

public class Week4CodingProject {
	    public static void main(String[] args) {
	        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	        // Step 1.a
	        // Subtract first element with the last one & printed results
	        int result = ages[ages.length - 1] - ages[0];
	        System.out.println("Result" + result);
	        
	        // Step 1.b
	        // Create a new array ages2 with 9 elements
	        int[] ages2 = new int[9];

	        // Step 1.b.ii
	        // Subtract the first element from the last one in ages2 & printed	  results
	        int result2 = ages2[ages2.length - 1] - ages2[0]; 
	        System.out.println("Result" + result2);

	        // Step 1.c
	        // Calculated the sum of all elements in the array
	        int sum = 0;
	        for (int age : ages) {
	            sum = sum + age;
	        }
	        // Calculated the average age	
	        double average = sum / ages.length;
	        System.out.println("Average age" + average);

	        // Step 2
	        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

	        // Step 2.a
	        // Calculated the letters of every name
	        int totalLetters = 0;
	        for (String name : names) {
	           totalLetters = totalLetters + name.length();
	        }
	        // calculated the average of letters
	        double avgLetters = totalLetters / names.length;
	        System.out.println("Average" + avgLetters);

	        // Step 2.b
	        // Concatenate all names together
	        String concatenatedNames = "";
	        for (String name : names) {
	        	concatenatedNames = concatenatedNames + " " + name;
	        }
	        System.out.println("Concatenated names" + concatenatedNames);

	        // Step 3
	        // Access the last element of any array
	        int lastElement = ages[ages.length - 1];
	        System.out.println("Last element of ages array" + lastElement);

	        // Step 4
	        // Access the first element of any array
	        int firstElement = ages[0];
	        System.out.println("First element of ages array" + firstElement);

	        // Step 5
	        // Create a new array of int called nameLengths containing the length of each name in names
	        int[] nameLengths = new int[names.length];
	        for (int i = 0; i < names.length; i++) {
	            nameLengths[i] = names[i].length();
	        }

	        // Step 6
	        // Calculate the sum of all elements in nameLengths array
	        int sumNameLengths = 0;
	        for (int length : nameLengths) {
	            sumNameLengths = sumNameLengths + length;
	        }
	        System.out.println("Sum" + sumNameLengths);
	    }

	    // Step 7
        // Method repeats a word n times
	    private static String repeatWord(String word, int n) {
	        String result = "";
	        for (int i = 0; i < n; i++) {
	            result = result + word;
	        }
	        return result;
	    }

	    // Step 8
        // Method creates a full name
	    private static String createFullName(String firstName, String lastName) {
	        return firstName + " " + lastName;
	    }

	    // Step 9
        // Method checks  if the sum is greater than 100
	    private static boolean isSumGreaterThan100(int[] array) {
	        int sum = 0;
	        for (int num : array) {
	            sum = sum + num;
	        }
	        return sum > 100;
	    }

	    // Step 10
        // Method calculates the average of double array
	    private static double calculateAverage(double[] array) {
	        double sum = 0 ;
	        for (double num : array) {
	            sum = sum + num; 
	        }
	        return sum / array.length;
	    }

	    // Step 11
        // Method checks if the average of the first array is greater than the second array
	    private static boolean isAverageGreaterThan(double[] firstArray, double[] secondArray) {
	        return calculateAverage(firstArray) > calculateAverage(secondArray);
	    }

	    // Step 12
        // Method checks if will buy a drink
	    private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	        return isHotOutside && moneyInPocket > 10.50;
	    }

	    // Step 13 
        // Method checks if age is greater than or equal to 21
	    
	    private static boolean canDrink(int age) {
	    	return age >= 21;
	        
	    }
	}


