
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite los n�meros: ");
		int d = sc.nextInt();
		int e = sc.nextInt();
		if(d%e==0)
			System.out.println(d + " es m�ltiplo de " + e);
		else
			System.out.println(d + " no es m�ltiplo de " + e);
	}
}