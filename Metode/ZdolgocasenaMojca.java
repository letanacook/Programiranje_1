import java.util.Scanner; 
import java.util.Random; 

public class ZdolgocasenaMojca{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		long seme = sc.nextInt();
		int stKock = sc.nextInt();
		int stDni = sc.nextInt(); 
		Random rand = new Random(seme);
		int tekociDan = 1; 
		
		int vsota = 0; 
		
		while(tekociDan <= stDni){
			System.out.printf("%d. dan:%n", tekociDan);
			int tekociMet = 1;			
			do{
				System.out.printf("    %d. met: ",tekociMet);
				vsota = vsota(stKock, seme, rand);
				System.out.printf("| vsota = %d%n", vsota);
				tekociMet++; 
			}while(niPrastevilo(vsota)); 
			tekociDan++; 
		}
			
	}
	public static int vsota(int stKock, long seme, Random rand){
		int vsota = 0; 
		int stKocke = 0; 
		for(int i = 1; i <= stKock; i++){
			stKocke = rand.nextInt(6) + 1; 
			System.out.print(stKocke + " "); 
			vsota += stKocke; 
		}
		return vsota; 
	}
	
	public static boolean niPrastevilo(int vsota){
		if(vsota == 1)
			return true; 
		for(int i = 2; i <= vsota/2; i++){
			if(vsota % i == 0)
				return true; 
		}
		return false; 
	}
}