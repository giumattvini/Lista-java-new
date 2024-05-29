import java.util.Scanner;

public class Um {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in); 
	
		System.out.println("insira um número:");
		int numUm = ref.nextInt();
	
		System.out.println("insira um número:");
		int numDois = ref.nextInt();
	    
		int soma = numUm + numDois; 
		
		System.out.println("O resultado é: " + soma); 
	}
}
