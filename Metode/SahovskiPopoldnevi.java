import java.util.Scanner; 
import java.util.Random;

public class SahovskiPopoldnevi{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in); 
		long seme = sc.nextLong();
		Random rand = new Random(seme);
		
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		int stPartij = sc.nextInt(); 
		int stZmag = sc.nextInt(); 
		int stDni = sc.nextInt(); 
		
		
		int trenutniDan = 1; 
		
		do{
			System.out.printf("%d. dan: ", trenutniDan);
			int stIger = stIger(a, b, stZmag, stPartij, rand);
			System.out.printf(" (%d)%n", stIger);
			trenutniDan++; 
		}while(trenutniDan <= stDni); 
		
		
		
	}
	
	public static int stIger(int zmagaAndreja, int zmagaBranka, int stZmag, int stPartij, Random rand){
		int partije = 0; 
		int zmageB = 0; 
		int zmageA = 0; 
		
		while(partije < stPartij && zmageB < stZmag && zmageA < stZmag){
			
			int zmagovalec = rand.nextInt(100); 
			
			if(zmagovalec < zmagaAndreja){
				System.out.print("A"); 
				zmageA++; 
				partije++; 
			}else if(zmagovalec >= zmagaAndreja + zmagaBranka){
				System.out.print("r"); 
				partije++; 
			}else{
				System.out.print("B");
				partije++;
				zmageB++; 
			}
		}
		
		return partije; 
		
		
	}
}