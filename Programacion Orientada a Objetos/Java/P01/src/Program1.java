
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite los números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("La suma es: " + (a + b));
		System.out.println("La resta es: " + (a - b));
		System.out.println("La multiplicación es: " + (a * b));
		}
}