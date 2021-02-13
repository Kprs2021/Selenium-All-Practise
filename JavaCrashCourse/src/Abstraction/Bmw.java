package Abstraction;

public class Bmw extends Car {

	@Override

	public void engineSecret() {

		System.out.println("BMW Engine Secret");

	}

	@Override
	public void companyVault() {

		System.out.println("Bmw Company Vault");

	}

	public static void main(String[] args) {

		Car car = new Bmw();
		car.companyVault();
		car.engineSecret();

	}

}
