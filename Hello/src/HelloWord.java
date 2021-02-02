import java.util.Scanner;

public class HelloWord {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		a = teclado.nextInt();
		System.out.println("Primeiro pgm no Eclipse");
		System.out.println("voce digitou " + a);
		teclado.close();
	}
}
