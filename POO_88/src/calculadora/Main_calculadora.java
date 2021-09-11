package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_calculadora {
	public static void main(String arg[]) throws IOException {
		
		Calculadora numero = new Calculadora();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		
		int opcion;


		do {
			do {
				System.out.println("\nCALCULADORA DE COMPLEJOS\n ");
				System.out.println("\t1.- Suma");
				System.out.println("\t2.- Resta");
				System.out.println("\t3.- Multiplicación");
				System.out.println("\t4.- División");
				System.out.println("\t5.- Norma");
				System.out.println("\t6.- Conjugacion");
				System.out.println("\t7.- Salir");
				

				System.out.print("\nIngrese opción : ");
				opcion = Integer.parseInt(in.readLine());
				System.out.println();
			} while (opcion > 7 || opcion < 1);

			switch (opcion) {
			case 1:
				
				do {


					
					System.out.println("--Complejo 1--");
					
					System.out.print("Ingrese el número real: ");
					numero.real = Integer.parseInt(in.readLine());
					System.out.print("Ingrese el número imaginario: ");
					numero.imaginario = Integer.parseInt(in.readLine());
					
					System.out.println("--Complejo 2--");
					
					System.out.print("Ingrese el número real: ");
					numero.real2 = Integer.parseInt(in.readLine());
					System.out.print("Ingrese el número imaginario: ");
					numero.imaginario2 = Integer.parseInt(in.readLine());
					
					System.out.println("\nEl resultado de la suma es: ");
					numero.Suma();

					System.out.print("\ndesea volver a hacer una suma?\n ");
					System.out.println("\t1.- si");
					System.out.println("\t0.- no");
					System.out.print("\nIngrese opcion : ");
					opcion = Integer.parseInt(in.readLine());
					System.out.println();
				} while (opcion == 1);

				
				break;

			case 2:
				
				do {


					
					System.out.println("--Complejo 1--");
					
					System.out.print("Ingrese el número real: ");
					numero.real = Integer.parseInt(in.readLine());
					System.out.print("Ingrese el número imaginario: ");
					numero.imaginario = Integer.parseInt(in.readLine());
					
					System.out.println("--Complejo 2--");
					
					System.out.print("Ingrese el número real: ");
					numero.real2 = Integer.parseInt(in.readLine());
					System.out.print("Ingrese el número imaginario: ");
					numero.imaginario2 = Integer.parseInt(in.readLine());
					
					System.out.println("\nEl resultado de la resta es: ");
					numero.Resta();

					System.out.print("desea volver a hacer una resta?\n ");
					System.out.println("\t1.- si");
					System.out.println("\t0.- no");
					System.out.print("\nIngrese opcion : ");
					opcion = Integer.parseInt(in.readLine());
					System.out.println();
				} while (opcion == 1);

				
				break;
				
			case 3:
				
				do {

					
					System.out.println("--Complejo 1--");
					
					System.out.print("Ingrese el número real: ");
					numero.real = Integer.parseInt(in.readLine());
					System.out.print("Ingrese el número imaginario: ");
					numero.imaginario = Integer.parseInt(in.readLine());
					
					System.out.println("--Complejo 2--");
					
					System.out.print("Ingrese el número real: ");
					numero.real2 = Integer.parseInt(in.readLine());
					System.out.print("Ingrese el número imaginario: ");
					numero.imaginario2 = Integer.parseInt(in.readLine());
					
					System.out.println("\nEl resultado de la multiplicacion es: ");
					numero.Multiplicacion();

					System.out.print("desea volver a hacer una multiplicacion?\n ");
					System.out.println("\t1.- si");
					System.out.println("\t0.- no");
					System.out.print("\nIngrese opcion : ");
					opcion = Integer.parseInt(in.readLine());
					System.out.println();
				} while (opcion == 1);

				
				break;

			case 4:
				
				do {

					System.out.println("--Complejo 1--");
					
					System.out.print("Ingrese el número real: ");
					numero.real = Integer.parseInt(in.readLine());
					System.out.print("Ingrese el número imaginario: ");
					numero.imaginario = Integer.parseInt(in.readLine());
					
					System.out.println("--Complejo 2--");
					
					System.out.print("Ingrese el número real: ");
					numero.real2 = Integer.parseInt(in.readLine());
					System.out.print("Ingrese el número imaginario: ");
					numero.imaginario2 = Integer.parseInt(in.readLine());
					
					System.out.println("\nEl resultado de la division es: ");
					numero.Division();

					System.out.print("desea volver a hacer una division?\n ");
					System.out.println("\t1.- si");
					System.out.println("\t0.- no");
					System.out.print("\nIngrese opcion : ");
					opcion = Integer.parseInt(in.readLine());
					System.out.println();
				} while (opcion == 1);

				
				break;
				
			case 5:
				
				do {

					
					System.out.print("Ingrese el número real: ");
					numero.real = Integer.parseInt(in.readLine());
					
					System.out.print("Ingrese el número imaginario: ");
					numero.imaginario = Integer.parseInt(in.readLine());
					
					System.out.println("\nEl resultado de la norma es: ");
					numero.Norma();

					System.out.print("desea volver a calcular una norma?\n ");
					System.out.println("\t1.- si");
					System.out.println("\t0.- no");
					System.out.print("\nIngrese opcion : ");
					opcion = Integer.parseInt(in.readLine());
					System.out.println();
				} while (opcion == 1);

				
				break;	
			
			case 6:
				
				do {


					
					System.out.print("Ingrese el número real: ");
					numero.real = Integer.parseInt(in.readLine());
					
					System.out.print("Ingrese el número imaginario: ");
					numero.imaginario = Integer.parseInt(in.readLine());
					
					System.out.println("\nEl conjugado es: ");
					numero.Conjugado();

					System.out.print("desea volver a hacer una congujacion?\n ");
					System.out.println("\t1.- si");
					System.out.println("\t0.- no");
					System.out.print("\nIngrese opcion : ");
					opcion = Integer.parseInt(in.readLine());
					System.out.println();
				} while (opcion == 1);

				
				break;
				
			case 7:
				System.out.print("Gracias por utilizar este programa ");
				break;
				
		}	
		} while (opcion > 7 || opcion < 1);
		}
}
