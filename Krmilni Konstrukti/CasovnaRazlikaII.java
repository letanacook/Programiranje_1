import java.util.Scanner;

public class CasovnaRazlikaII{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		
		int prvaUra = sc.nextInt ();
		int prveMin = sc.nextInt ();
		int drugaUra = sc.nextInt ();
		int drugeMin = sc.nextInt ();
		
		int minuteEna = prvaUra * 60 + prveMin;
		int minuteDve = drugaUra * 60 + drugeMin;
		
		int razlika = minuteDve - minuteEna;
		int ure = razlika/60;
		int minute = razlika%60;
		
		System.out.printf("%d:%02d%n", ure, minute);
		
	}
}