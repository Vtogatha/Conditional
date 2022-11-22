package secao06;

import java.util.Scanner;

public class ifelse02 {
	public static void main(String[] args) {
		
		//variaveis
		int c;
		float n, e = 0, salario, valor_hora = (float) 10.00;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Digite o codigo: ");
		c = teclado.nextInt();
		
		System.out.println("Digite a quantidade de horas: ");
		n = teclado.nextFloat();
		
		//processamento
		if(n > 50) {
			e = (float) ((n - 50) * 20.00);
			salario = valor_hora * 50 + e;
			System.out.printf("Salario total %.2f\n", salario);
			System.out.printf("Horas extras %.2f\n", e);
			
		}else {
			salario = n * valor_hora;
			System.out.printf("Salario : %.2f\n", salario);
			System.out.printf("Horas extras %.2f\n", e);
		}
		
		teclado.close();
	}

}
