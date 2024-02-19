import java.util.Scanner;

public class PostevankaIII{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int prvoSt = sc.nextInt();
		int drugoSt = sc.nextInt();
		int zmnozek = 0;
		
		for (int i = 1; i <= drugoSt/prvoSt ; i++){
			zmnozek = prvoSt * i;
			System.out.printf("%d * %d = %d%n", prvoSt, i, zmnozek);
		}
	}
}