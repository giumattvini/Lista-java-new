import java.util.Scanner;

public class Dois {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in); 
		
			System.out.println("insira um número:");
			int numUm = ref.nextInt();
		    
			if (numUm % 2 == 0) {
				System.out.println("o numero é par");
			} else {
				System.out.println("o numero é impar");
			}
	}
}
