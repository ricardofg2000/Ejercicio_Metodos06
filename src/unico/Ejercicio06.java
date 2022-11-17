package unico;

public class Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * Implementar un método que nos diga si un número es primo.
		 */

		final String SPRIMO = " es primo";
		final String NPRIMO = " no es primo";
		int num;
		boolean respuesta;
		String mensaje;

		num = Util.leerInt("Introduzca un número: ");

		mensaje = "" + num;
		respuesta = esPrimo(num);
		mensaje += respuesta ? SPRIMO : NPRIMO;

		Util.escribir(mensaje);

	}

	public static boolean esPrimo(int num) {
		boolean primo = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				primo = false;
			}
		}
		return primo;
	}

}
