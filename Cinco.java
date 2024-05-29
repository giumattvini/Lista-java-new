import java.util.Scanner;

public class Cinco {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in); 
	
		System.out.println("insira um número:");
		int numUm = ref.nextInt();
	
		if (numUm % 4 == 0) {
			System.out.println("O ano é bissexto");
		} else {
			System.out.println("O ano não é bissexto");
		}
	}
}
