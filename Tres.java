import java.util.Scanner;

public class Tres {
	
	public static void main(String[] args) {
		
			Scanner ref = new Scanner(System.in); 
		
			System.out.println("insira um número:");
			int numUm = ref.nextInt();
		
			long fat = 1;
			
			for (int i = 1; i <= numUm; i++) {
				fat *= i;
			}
			
			System.out.println("fat de: " + numUm + "é" + fat);
	}
	
}
