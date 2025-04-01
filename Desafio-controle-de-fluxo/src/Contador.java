import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (parametrosInvalidos exception) {
			System.out.println(exception.getMessage());

		}finally{
			terminal.close();
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws parametrosInvalidos {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois < parametroUm){
			throw new parametrosInvalidos("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int contador = parametroDois - parametroUm;

		 for(int i = 0; i <= contador; i++){
            System.out.println("imprimindo o número: " + i);
        }
	}
}