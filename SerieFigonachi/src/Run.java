
public class Run {

	public static void main(String[] args) {
		
		String texto = "Hola a todos hola. Por hola, HOLA 4";
		String nuevo = texto.replace('.', ' ').replace(',', ' ').toLowerCase();
		String array [] = nuevo.split(" ");
		int contador =0;
		for(String palabra: array) {
			if(palabra.contains("hola")) {
				contador++;
			}
		}
		

		
		System.out.println(nuevo);
		System.out.println(contador);
}
}
