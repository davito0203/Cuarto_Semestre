
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el número: ");
		int c = sc.nextInt();
		if(c%2==0)
			System.out.println(c + " es par");
		else
			System.out.println(c + " no es par");
		}
}