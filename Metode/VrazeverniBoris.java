import java.util.Scanner;
import java.util.Random;

public class VrazeverniBoris{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		
		long seme = sc.nextInt();
		int n = sc.nextInt();
		Random rand = new Random(seme);
	
		int stDni = 1; 
		
		while(stDni <= n){
			if(stDni % 7 == 0){
				System.out.printf("%4d (N): ", stDni);
				int stMetov = stLihih(stDni, rand);
				System.out.printf("[%d]%n", stMetov);
				stDni++; 
			}else{
				System.out.printf("%4d (D): ", stDni);
				int stMetov = stLihih(stDni, rand);
				System.out.printf("[%d]%n", stMetov);
				stDni++; 
			}
		}
	}
	
	public static int stLihih(int stDni, Random rand){
		int stMetov = 0; 
		int stLihih = 0; 
		int vrednost = 0; 
		
		if(stDni % 7 == 0){
			while(stLihih < 5){
				vrednost = rand.nextInt(6) + 1;
				if(jeLiho(vrednost)){
					stMetov++;
					stLihih++; 
					System.out.print(vrednost + " "); 					
				}else{
					stMetov++; 
					System.out.print(vrednost + " "); 
				}
			}
		}else{
			while(stLihih < 3){
				vrednost = rand.nextInt(6) + 1;
				if(jeLiho(vrednost)){
					stMetov++;
					stLihih++; 
					System.out.print(vrednost + " "); 
				}else{
					stMetov++;
					System.out.print(vrednost + " "); 
				}
			}
		}
		
		return stMetov; 
	}
	
	public static boolean jeLiho(int vrednost){
		if(vrednost % 2 == 0){
			return false; 
		}else{
			return true; 
		}
	}
}