package com.lao.javalearning;

public class WhosTheHero {
	
	
		String myheroName = "Super Man";
		
		
	public void superHeroGuesser() {
		
		//equals- define exactly equal values only equals will accept.
		//it consider space also.so the equals should be exactequal.
		//equalsIgnoreCase - if we no need consideration of case sensitivity
		//then we need to use equalsIgnoreCase.
		
		if(myheroName.equalsIgnoreCase("Iron Man")) {
			
			System.out.println("your Thought About IronMan");
			
		}else if(myheroName.equals("Super Man")){
			
			System.out.println("your Thought About SuperMan");
			
		}else if(myheroName.equals("Thor")) {
			
			System.out.println("your Thought About SuperMan");
			
		}else {
			
			System.out.println("Sorry I am Unable to Guess!!");
		}
		
	}
				

	public static void main(String[] args) {
		
		
		WhosTheHero hero = new WhosTheHero();
		hero.superHeroGuesser();
	}

}
