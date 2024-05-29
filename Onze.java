import java.util.Scanner;

public class Onze {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in); 
		
		System.out.println("insira um número:");
		int numUm = ref.nextInt();
		
		int a = 0, b = 1;
		
		System.out.println(a);
		
		for (int i = 1; i < numUm; i++) {
			System.out.println(b);
			
			int proxSoma = a + b;
			 a = b;
			 
			 b = proxSoma;
		}
	}
}
