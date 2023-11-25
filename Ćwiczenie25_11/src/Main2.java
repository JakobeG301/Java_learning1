import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj kod: ");
		int kod = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Podany kod to " + kod);

		System.out.println("Podaj hasło: ");
		String haslo = scanner.nextLine();
		

		
		System.out.println("Kod: " + kod);
		System.out.println("Hasło: " + haslo);
		
		
		
	}

}
