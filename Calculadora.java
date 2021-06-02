//import java.io.BufferedReader;
//import java.io.InputStreamReader; //Strins

import java.util.Scanner;   
import java.io.IOException;
import java.lang.Math;

public class Calculadora{

	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);	
		int numero1;
		int numero2;
		int opcion;
		double resultado;

		System.out.println("Bienvenido a Calculadora Shugar");

		System.out.println("Introduce tu primer numero");

		numero1 = sc.nextInt();

		System.out.println("Introduce tu segundo numero");
	
		numero2 = sc.nextInt();

		System.out.println("Opciones de la Calculadora");
		System.out.println("1.-Suma");
		System.out.println("2.-Resta");
		System.out.println("3.-Multiplicacion");
		System.out.println("4.-division"); 
		System.out.println("5.-Potencia");//


		opcion = sc.nextInt();

		if(opcion == 1){
			resultado = numero1 + numero2;
			System.out.println("La suma de los numeros es: " + resultado);
		}else if(opcion == 2){
			resultado = numero1 - numero2;
			System.out.println("La resta de los numeros es: " + resultado);
		}else if(opcion == 3){
			resultado = numero1 * numero2;
			System.out.println("La multiplicacion de los numeros es: " + resultado);
		}else if(opcion == 4){

			try{
				resultado = numero1 / numero2;
				System.out.println("La division de los numeros es: " + resultado);
			}catch(Exception e){
				System.out.println("No se puede dividir entre cero ");
				e.printStackTrace();
			}

			
		}else if (opcion == 5){
			resultado = Math.pow(numero1,numero2);
			System.out.println("La potencia del primer numero con el segundo es: " + resultado);


		}else{
			System.out.println("Debes legir una opción" );
		}
	}
}