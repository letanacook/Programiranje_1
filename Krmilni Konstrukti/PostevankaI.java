import java.util.Scanner;

public class PostevankaI{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int prvoSt = sc.nextInt();
		int drugoSt = sc.nextInt();
		
		for (int i = 1; i <= drugoSt; i++){
			System.out.println(prvoSt*i);
		}
	}
}