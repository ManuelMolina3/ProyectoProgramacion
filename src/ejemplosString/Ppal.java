package ejemplosString;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "Paco", b="Huguito", c="paco";
		String d="Pedro,Antonio,Ángel,Luismi";
		char u=  'b';
		String [] t;
		System.out.println(a.charAt(0));
		System.out.println(b.charAt(0));
		/*variable tipo String.charAT(posición de el acracter que quieres ver) este metodo de la clase String
		 * te devuelve el caracter el cual esta en la posición que le has pedido */
		System.out.println(a.equals(b));
		/*variable tipo String.equals(otra variable tipo String) este método devuelve un booleano el cual determinara
		 * si la cadena de caracteres es igual que la otra lo cual devolveria true y si la cadena de caracteres no es igual
		 * te devolvera false*/
		System.out.println(a.equalsIgnoreCase(c));
		/*variable TipoString.equalsIgnoreCase(variable TipoString) este metodo comprara dos cadenas de caracteres y no tiene encenta si 
		 * la cadena tiene minusculas o mayusculas es decir si son iguales aunque algunas se escriban en mayusculas devolvera true esa es 
		 * la unica diferencia con el otro equals*/
		System.out.println(a.length());
		System.out.println(b.length());
		/*variable tipo String.length() este metodo comprueba el número de caracteres el cual tiene la cadena y te devuelve con una
		 * variable int el número de caracteres que tiene la variable tipo String*/
		System.out.println(a.substring(1));
		/*variable tipo String.subString(número de caracter por el cual quieres que empiexe a imprimir) este metodo tiene tres variantes
		 * la primera es que solo se le pasa un parametro por el cual es donde empieza a imprimir si tu le metes en el prametro el número 
		 * 1 empezara a imprimir por el segundo caracter que haya en la variable es decir en a empezara a imprimir por la letra a*/
		System.out.println(b.substring(0, 2));
		/*variable tipo String.substring(la posicion de la cadena de caracteres por la cual quiere que empieze a imprimir "," la posición de 
		 * la cadena de caracteres por la cual quiere que acabe de imprimir)*/
		System.out.println(a.replace("P", "X"));
		/*variableTipoString.replace("carater que quieres cambiar" "," "caracter nuevo que quieres meter") este metodo te permite cambiar de una variable algun caracter
		 * por otro que tu quieras*/
		t=d.split(",");
		for (int i = 0; i < t.length; i++) 
			System.out.println(t[i]);
		/*ArrayTipoString= varibleTipoString.split(expresion por la cual quieres que separe la cadena de caracteres) este metodoç
		 * separa la cadena de caracteres segun el parametro que le metas y devuelve un array con todas las cadenas de caracteres que haya en esa cadena de caracteres*/
		System.out.println(a.concat(d)); 
		/*variableTipoString.concat(varible que quieres concatenar a otra variable) Este metodo lo que hace es concatenar dos variables tipo String 
		 * y te devuelve un String*/
		System.out.println(a.codePointAt(2));
		/*variableTipoString.codePointAt(posicion del cual quieres sacar el codigo) este metodo te devuelve el numero correspondiente al carter en codigoi ASCII*/
		char miarray[] = {'A','V','I','L','A'};
		System.out.println(String.valueOf(miarray));
		System.out.println(String.valueOf(u));
		/*String.valueOf(cualquierTipoDeVariable que quieras convertir) este metodo lo que hace es convertir cualquier tipo de variable en una cadena de caracteres*/
	}

}
