
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un número de 5 digitos: \n" );
		int n = sc.nextInt();
		int a, b, c, d, e;
		if(n > 99999){
			System.out.print("Son solo 5 dígitos");
		}
		else {
			e = n%10;
			n = n/10;
			d = n%10;
			n = n/10;
			c = n%10;
			n = n/10;
			b = n%10;
			n = n/10;
			a = n%10;
			System.out.printf("Los números separados son: ");
			System.out.printf("%d  %d  %d  %d  %d  \n", a, b, c, d, e);
		}
	}
}