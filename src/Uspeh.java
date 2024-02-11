import java.util.Scanner;
public class Uspeh {

	public static void metodUspeh(double bodovi) {
		if(bodovi>=8.5) {
			System.out.print("Odlicen");
		}
		else if(bodovi>=7.5) {
			System.out.print("Mnogu dobar");
		}
		else if(bodovi>=5.5 ) {
			System.out.print("Dobar");
		}
		else if(bodovi>=3.5) {
			System.out.print("Dovolen");
		}
		else {
			System.out.print("Nedovolen");
		}
	
	}
public static void main(String[] args) {
	try (Scanner input = new Scanner(System.in)) {
		System.out.print("Vnesi bodovi od 1-10\n");
		System.out.print("Broj na bodovi: ");
		double bodovi = input.nextDouble();
		System.out.print("Za boj na bodovi " + bodovi + " Uspehot e: ");
		metodUspeh(bodovi);
	}
}
}
