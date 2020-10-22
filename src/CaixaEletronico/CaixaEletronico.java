package CaixaEletronico;

import java.util.Scanner;

public class CaixaEletronico {		
	public static void main(String[] args) {
			 Scanner leitura = new Scanner(System.in);
	         int valor;
	         int notas200 = 0;
	         int notas100 = 0;
	         int notas50 = 0;
	         int notas20 = 0;
	         int notas10 = 0;
	         int notas5 = 0;
	         int notas2 = 0;
	         int notas1 = 0;
	         

	         System.out.println("digite o valor a ser sacado:");
	         valor = leitura.nextInt();

	         while(valor != 0) {

	         if (valor >= 200) {
	             valor = valor -200;
	             notas200 ++;

	         }
	         else if (valor >= 100) {
	             valor = valor -100;
	             notas100 ++;

	         }
	         else if (valor >= 50) {
	             valor = valor -50;
	             notas50 ++;

	         }
	         else if (valor >= 20) {
	             valor = valor -20;
	             notas20 ++;

	         }
	         else if (valor >= 10) {
	             valor = valor -10;
	             notas10 ++;

	         }
	         else if (valor >=5) {
	             valor = valor -2;
	             notas2 ++;

	         }
	         
	         else if (valor >= 5) {
	             valor = valor -5;
	             notas5 ++;

	         }
	         else if (valor >= 2) {
	             valor = valor -2;
	             notas2 ++;

	         }
	         else if (valor >= 1) {
	             valor = valor -1;
	             notas1 ++;

	         }


	        }

	        System.out.println(notas200 + " notas de 200R$");
	        System.out.println(notas100 + " notas de 100R$");
	        System.out.println(notas50 + " notas de 50R$");
	        System.out.println(notas20 + " notas de 20R$");
	        System.out.println(notas10 + " notas de 10R$");
	        System.out.println(notas5 + " notas de 5R$");
	        System.out.println(notas2 + " notas de 2R$");
	        System.out.println(notas1 + " notas de 1R$");

	}}