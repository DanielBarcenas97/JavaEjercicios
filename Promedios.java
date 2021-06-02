//import java.io.BufferedReader;
//import java.io.InputStreamReader; //Strins

import java.util.Scanner;   
import java.io.IOException;


public class Promedios{

	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);
        String nombre; 
		float historia;
		float matematicas;
		float ciencias;
		float artes;
        float promedio;
        
        System.out.println("Bienvenido a la plataforma de promedios aprobados");

		System.out.println("Alumno introduce tu nombre");

		nombre = sc.nextLine();

        System.out.println("Alumno ahora introduce tu promedio de Historia");
        
        historia = sc.nextInt();

		System.out.println("Alumno ahora introduce tu promedio de Matematicas");
	
		matematicas = sc.nextInt();

        System.out.println("Alumno ahora introduce tu promedio de ciencias");

		ciencias = sc.nextInt();

		System.out.println("Alumno ahora introduce tu promedio de artes");
	
		artes = sc.nextInt();

        promedio = (historia + matematicas + ciencias + artes) / 4;
		System.out.println("El promedio de tus materias fue de : " + promedio);
		
		if(promedio >= 6  && promedio <= 10){
            System.out.println("Aprobaste el semestre " + nombre + " con " + Math.floor(promedio));
        }else{
            System.out.println("Reprobaste el semestre " + nombre + "con 5");
        }
    }
}




