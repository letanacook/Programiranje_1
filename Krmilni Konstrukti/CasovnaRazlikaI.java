import java.util.Scanner;

public class CasovnaRazlikaI{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		
		int prvaUra = sc.nextInt ();
		int prveMin = sc.nextInt ();
		int drugaUra = sc.nextInt ();
		int drugeMin = sc.nextInt ();
		
		int minuteEna = prvaUra * 60 + prveMin;
		int minuteDve = drugaUra * 60 + drugeMin;
		
		int razlika = minuteDve - minuteEna;
		
		System.out.print(razlika);
		
	}
}