import java.util.Scanner;

public class Potenca{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int potenca = (int) Math.pow( a, b);
		System.out.print(potenca);
	}
}