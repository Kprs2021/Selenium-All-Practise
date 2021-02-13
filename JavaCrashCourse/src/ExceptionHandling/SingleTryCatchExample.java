package ExceptionHandling;

public class SingleTryCatchExample {

	public static void main(String[] args) {

		try {

			int number1 = 2;
			int number2 = 3;
			int result = number2/number1;
			System.out.println(result);

		} catch (ArithmeticException e) {

			System.out.println("Dont divide a number by zero as you will get infinite.");

		} catch (NullPointerException e) {
			e.printStackTrace();

			System.out.println("Take a break");

		} catch (Exception e) {
			e.printStackTrace();

			System.out.println("Take a break");

		}

	}

}
