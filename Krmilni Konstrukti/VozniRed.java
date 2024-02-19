import java.util.Scanner;

public class VozniRed{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int zacetnaUra = sc.nextInt();
		int zacetneMinute = sc.nextInt(); 
		int koncnaUra = sc.nextInt();
		int koncneMinute = sc.nextInt(); 
		int minutniInterval = sc.nextInt(); 
		
		int zacetneMin = zacetnaUra * 60 + zacetneMinute; 
		int koncneMin = koncnaUra * 60 + koncneMinute; 
		
		int trenutniCas = zacetneMin; 
		
		System.out.printf("%02d:%02d%n", zacetnaUra, zacetneMinute);
		
		while(trenutniCas + minutniInterval <= koncneMin && trenutniCas < 1440){
			trenutniCas += minutniInterval; 
			int trnutnaUra = trenutniCas/60; 
			int trnutneMin = trenutniCas%60; 
			System.out.printf("%02d:%02d%n", trnutnaUra, trnutneMin);
		}
		
	}
}