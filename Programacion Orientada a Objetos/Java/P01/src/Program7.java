
import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite el primer número: ");
        int x = sc.nextInt();
        System.out.print("Digite el segundo número: ");
        int y = sc.nextInt();
        System.out.println("El MCD de " + x + " y " + y + " es " + mcd(x,y));
}
public static int mcd(int a, int b){
	/* Según lo que lei en internet el MCD lo tiene que hacer
	 * otra función que no sea el main */
        int mcd = 0;
        while(a != b){
                if(a > b){
                        a = a - b;
                }
		else{
                        b = b - a;
                }
        }
        mcd = a;
        return mcd;
	}
}
