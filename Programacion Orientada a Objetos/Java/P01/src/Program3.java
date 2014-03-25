
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite los números: ");
		int d = sc.nextInt();
		int e = sc.nextInt();
		if(d%e==0)
			System.out.println(d + " es múltiplo de " + e);
		else
			System.out.println(d + " no es múltiplo de " + e);
	}
}