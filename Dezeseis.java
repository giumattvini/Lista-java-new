import java.util.Scanner;

public class Dezeseis {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in); 
		
		System.out.println("insira um número:");
		int numUm = ref.nextInt();
		
		if (numUm % 2 == 0 && numUm >= 1) {
			System.out.println("Não é primo");
		} else {
			System.out.println("é primo!");
		}
	}
}
