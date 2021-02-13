package polymorphism_overloading;

public class TheWayWeTalk {

	/*
	 * This method is to illustrate method overloading with a practical example..
	 * Method name should be same.
	 */

	public void talk(Parents styleofTalking) {

		System.out.println("Polite, Respectful");

	}

	public void talk(Partner styleofTalking) {

		System.out.println("Love, Care");

	}

	public void talk(Boss styleofTalking) {

		System.out.println("Dedicated");

	}

	public static void main(String[] args) {
		
		TheWayWeTalk wayWeTalk = new TheWayWeTalk();
		
		Parents parents = new Parents();
		wayWeTalk.talk(parents);
		
		Partner partner = new Partner();
		wayWeTalk.talk(partner);
		
		Boss boss = new Boss();
		wayWeTalk.talk(boss);
		
		
		
		
	}

}
