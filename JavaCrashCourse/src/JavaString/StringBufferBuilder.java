package JavaString;

public class StringBufferBuilder {

	public static void main(String[] args) {

		/*
		 * To Demonstrate the string buffer is mutable.
		 */

		System.out.println("String is IMMUTABLE");
		String name = "Karthik";
		System.out.println("Appending a name to original :" + name.concat("eyan"));
		System.out.println("original name :" + name);
		System.out.println("**********************");

		System.out.println("StringBuffer is MUTABLE");
		StringBuffer name1 = new StringBuffer("Karthik");
		System.out.println("Appending a name to original :" + name1.append("Natarajan"));
		System.out.println("original name :" + name1);

		// String buffer Methods
		// Reverse
		System.out.println("Reversed String name :" + name1.reverse());
		// replace
		StringBuffer replaceThiStringBuffer = new StringBuffer("Karthikeyan");
		System.out.println("Replaced String name :" + replaceThiStringBuffer.replace(0, 3, "rithy"));
		// delete
		StringBuffer delete = new StringBuffer("Karthikeyan");
		System.out.println("Deleted String name :" + delete.delete(0, 1));
		// insert
		StringBuffer insert = new StringBuffer("natty");
		System.out.println("insert String name :" + insert.insert(4, "sha"));
		// Capacity
		System.out.println("insert String name :" + insert.capacity());
		// Like string we have chaAt,Substring, length methods as well..

		// Stringbuilder Methods
		// Reverse
		System.out.println("Reversed String name :" + name1.reverse());
		// replace
		StringBuilder replaceThiStringBuilder = new StringBuilder("Karthikeyan");
		System.out.println("Replaced String name :" + replaceThiStringBuilder.replace(0, 3, "rithy"));
		// delete
		StringBuilder delete1 = new StringBuilder("Karthikeyan");
		System.out.println("Deleted String name :" + delete1.delete(0, 1));
		// insert
		StringBuilder insert1 = new StringBuilder("natty");
		System.out.println("insert String name :" + insert1.insert(4, "sha"));
		// Capacity
		System.out.println("insert String name :" + insert1.capacity());
		// Like string we have chaAt,Substring, length methods as well..

	}

}
