import java.util.Scanner;

public class Quatro {
	
	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in); 
		double somaNotas = 0;
		
		for (int i = 1; i <= 6; i++) {
			System.out.println("Digite um numero: ");
			double nota = ref.nextDouble(); 
			somaNotas += nota; 
		}
		
		double mediaAluno = nota / 6; 
		
		System.out.println("Média: " + mediaAluno);
		
	}
}
