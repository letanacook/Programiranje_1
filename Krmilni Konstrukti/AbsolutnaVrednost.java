import java.util.Scanner;

public class AbsolutnaVrednost{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		
		int Stevilo = sc.nextInt ();
		
		if (Stevilo < 0){
			System.out.print(Stevilo*(-1));
		}else{
			System.out.print(Stevilo);
		}
	}
}