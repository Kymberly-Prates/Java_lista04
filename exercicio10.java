package lista04;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float total = 0;
		
		System.out.println("Qual � o seu sal�rio em horas:");
		float SalHoras = sc.nextFloat();
		System.out.println("Quantas horas foram trabalhadas no m�s");
		int horasTrab = sc.nextInt();
		
		int horasAdc = horasTrab - 160;
		float acrescimo = ((SalHoras * 50) / 100) * horasAdc;
		
		if (horasTrab>160) {
			total = (SalHoras * horasTrab) + acrescimo;
		} else {
			total = SalHoras * horasTrab;
		}
		System.out.println("O sal�rio total � de: " + total + " R$");
	}


}
