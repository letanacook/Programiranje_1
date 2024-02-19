import java.util.Scanner;

public class PostevankaII{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int prvoSt = sc.nextInt();
		int drugoSt = sc.nextInt();
		
		for (int i = 1; i <= drugoSt; i++){
			int zmnozek = prvoSt * i;
			System.out.printf("%d * %d = %d%n", prvoSt, i, zmnozek);
		}
	}
}