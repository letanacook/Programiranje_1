import java.util.Scanner; 
import java.util.Random;

public class VsiRazlicniII{
	public static void main(String[] args){
		
		int MAKS_STEVILO = 10000;
		Scanner sc = new Scanner(System.in); 
		
		int seme = sc.nextInt(); 
		Random random = new Random(seme);
		int stStevil = sc.nextInt(); 
		boolean razlicno = true;  
		
		int[][] zaporedje = new int[stStevil][2]; 
		
		for(int i = 0; i < stStevil; i++){
			zaporedje[i][0] = random.nextInt(2 * MAKS_STEVILO + 1) - MAKS_STEVILO;			
		}
		
		for(int i = 0; i < stStevil; i++){
			for(int j = 0; j < stStevil; j++){
				if(i != j && zaporedje[i][0] == zaporedje[j][0]){
					razlicno = false;
					zaporedje[i][1]++; 
				}
			} 
		}
		
		int najPonovitev = 1;
		int najIndeks = 0;
		
		if(razlicno){
			System.out.println("RAZLICNI");
		}else{
			for(int i = 0; i < stStevil; i++){
				if(zaporedje[i][1] > najPonovitev){
					najPonovitev = zaporedje[i][1];
					najIndeks = i; 
				}else if(zaporedje[i][1] == najPonovitev && zaporedje[i][0] < zaporedje[najIndeks][0]){
					najPonovitev = zaporedje[i][1];
					najIndeks = i; 
				}	
			}
			System.out.println(zaporedje[najIndeks][0]); 
		}
	}
}