
import java.util.Scanner;

public class Program6 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Escriba la cantidad de números: ");
		 double suma = 0; /* Le puse double porque no se sabe
		 si el resultado es un entero o tiene decimales */
		 double n = in.nextInt();
		 if(999 < n){
			 System.out.print("no se puede hacer ");
		 }
		 else{
			   for(int i = 0; i < n; i++){
				   suma = suma + in.nextInt();
			   }
		System.out.print("La media es ");
		System.out.println(suma/n);
		 }
	}
}