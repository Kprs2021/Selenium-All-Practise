package JavaString;

public class StringMethods {

	public static void main(String[] args) {

		/*
		 * Here we will use list of string methods and string concepts
		 */

		String name = "Karthikeyan";// String Literal
		int number = 5;

		// return character value for the particular index
		System.out.println(name.charAt(1));

		// return string length
		System.out.println(name.length());

		// checks the equality of string with the given object
		System.out.println(name.equals("Karthi"));

		// checks the equality of string with the given string without case sensitivity
		System.out.println(name.equalsIgnoreCase("karthikeyan"));

		// check if string is empty or not
		System.out.println(name.isEmpty());

		// return true or false based on the given value is present or not
		System.out.println(name.contains("K"));

		// take a prticular portion of the string
		System.out.println(name.substring(1));

		// take a prticular portion of the string begin and end index
		System.out.println(name.substring(2, 8));

		// append/add the string to the given string.
		System.out.println(name.concat("Natrajan"));

		// replace the exicting char with given char
		System.out.println(name.replace("keyan", "Kayan"));
		System.out.println(name.replace("ar", "er"));
		System.out.println(name.replaceAll("keyan", "kayan"));

		// find the position of a character in a string
		System.out.println(name.indexOf("a"));

		// find the character specified from the index position
		System.out.println(name.indexOf("a", 5));

		// find the character specified from the index position
		System.out.println(name.indexOf("a", 1));
		System.out.println(name.indexOf("yan", 1));

		// Trim will remove the white space before and after
		System.out.println(name.trim());

		// Convert the given data type to string
		System.out.println(name.valueOf(number));

		// Convert upper case to lowercase
		String upperCase = "KARTHIKEYAN";
		System.out.println(upperCase.toLowerCase());

		// Convert upper case to lowercase
		String lowerCase = "karthikeyan";
		System.out.println(lowerCase.toUpperCase());
		
		//Returns a joined string with given delimiter
		System.out.println(String.join(",", "Learn","Automation","Online"));
		System.out.println(String.join("/", "30","05","1990"));
		
		//Split
		
		String split = "Am,I,Teaching,good";
		String [] splittedWords=split.split(",");
		for(String string:splittedWords) {
			System.out.println(string);
		}
		
		
		
		
		

	}

}
