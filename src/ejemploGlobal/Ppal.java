package ejemploGlobal;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre, apellido, anio, mascota, segundoApe;
		int op=0;
		GestionDeDatos ges = new GestionDeDatos();
		System.out.println("/////////////////////////////////////////////////////");
		System.out.println("Bienvenido a Amix su aplicacion de confianza");
		System.out.println("/////////////////////////////////////////////////////");
		System.out.println("Digame su nombre");
		nombre=Leer.dato();
		System.out.println("Digame su primer apellido");
		apellido=Leer.dato();
		System.out.println("Digame su segundo apellido");
		segundoApe=Leer.dato();
		System.out.println("Digame su año de nacimiento");
		anio=Leer.dato();
		System.out.println("Digame si tiene una mascota cual es su nombre");
		mascota=Leer.dato();
		
		do {
			System.out.println("/////////////////////////////////////////////////");
			System.out.println("1.- Ver correo electrónico");
			System.out.println("2.- Ver nombre de usuario");
			System.out.println("3.- Ver contraseña");
			System.out.println("0.- Salir del programa");
			System.out.println("/////////////////////////////////////////////////");
			op=Leer.datoInt();
			switch(op) {
				case 1:
					System.out.println("Su correo electrónico es:");
					ges.generarCorreo(nombre, apellido, anio);
					break;
				case 2:
					System.out.println("Su nombre de usuario es:");
					ges.generarUsr(nombre, apellido, segundoApe);
					break;
				case 3:
					System.out.println("Su contraseña es:");
					ges.generarContra(nombre, apellido, mascota);
					break;
				case 0:
					System.out.println("************************");
					System.out.println("Saliendo...");
					System.out.println("************************");
					break;
				default:
					System.out.println("Opción no disponible");
					break;
			}
		}while(op!=0);
		System.out.println("/////////////////////////////////////////////////////");
		System.out.println("Gracias por usar Amix su aplicacion de confianza");
		System.out.println("/////////////////////////////////////////////////////");
		
	}

}
