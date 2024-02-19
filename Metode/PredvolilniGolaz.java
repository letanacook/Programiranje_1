import java.util.Scanner; 

public class PredvolilniGolaz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int denar = sc.nextInt();
		
		zanka:
		while(sc.hasNextInt() && denar > 0){
			int cenaKosila = sc.nextInt();
			int stKosil = sc.nextInt();
			int vino = sc.nextInt();
			
			int cenaPogostitve = pogostitev(cenaKosila, stKosil, vino);
			
			if(denar - cenaPogostitve >= 0){
				System.out.printf("%d %d%n", cenaPogostitve, denar - cenaPogostitve);
				denar -= cenaPogostitve; 
			}else{
				System.out.printf("%d -%n", cenaPogostitve);
				break zanka; 
			}
		}
		
	}
	
	public static int pogostitev(int cenaKosila, int stKosil, int vino){
			
		int cenaPogostitve = cenaKosila * stKosil; 
			
		if(vino == 1 && cenaPogostitve % 2 > 0){
			cenaPogostitve += cenaPogostitve/2 + 1; 
		}else if(vino == 1){
			cenaPogostitve += cenaPogostitve/2;
		}
			
		return cenaPogostitve; 
	}
		
}