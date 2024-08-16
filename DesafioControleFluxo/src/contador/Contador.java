package contador;
import java.util.Scanner;


public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("Digite dois parâmetros, para saber sua contagem!, o primeiro número tem que ser menor que o segundo ");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		
		try {
			
			contar(parametroUm,parametroDois);
			
		}catch(ParametrosInvalidosException e) {
			 System.out.println("Segundo parâmetro deve ser maior que o primeiro!");
		}
		
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if(parametroUm > parametroDois)
			throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		
		for(int numero = parametroUm; numero <= parametroDois; numero ++) {
			System.out.println("Imprimindo "+ numero);
		}
		System.out.println("Foi realizado " +contagem+ " contagens");
		
	}
	
}