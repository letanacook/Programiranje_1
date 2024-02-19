import java.util.Scanner;

public class MedianaTrojiceI{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		
		int prvo = sc.nextInt ();
		int drugo = sc.nextInt ();
		int tretje = sc.nextInt ();
		
		if ((drugo <= prvo || tretje <= prvo) && (drugo >= prvo || tretje >= prvo)){
			System.out.print(prvo);
		}else if ((prvo <= drugo || tretje <= drugo) && (prvo >= drugo || tretje >= drugo)){
			System.out.print(drugo);
		}else{
			System.out.print(tretje);
		}
	}
}