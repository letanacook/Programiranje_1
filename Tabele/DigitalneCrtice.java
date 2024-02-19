import java.util.Scanner; 

public class DigitalneCrtice{
	public static void main(String[] args){
		
		Scanner sc = new Scanner (System.in);
		
		int[] crtice = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		int stStevil = sc.nextInt(); 
		
		int maksStevke = 0; 
		int maksStevilo = 0;  
		
		while(sc.hasNextInt()){
			int stevke = 0; 
			int stevilo = sc.nextInt(); 
			int pomoznoStevilo = stevilo; 
			
			while(pomoznoStevilo > 0){
				int ostanek = pomoznoStevilo%10; 
				stevke += crtice[ostanek];
				pomoznoStevilo = pomoznoStevilo/10; 
			}
			
			if(stevke > maksStevke){
				maksStevke = stevke; 
				maksStevilo = stevilo; 
			}
		}
		
		
		System.out.println(maksStevilo); 
	}
}