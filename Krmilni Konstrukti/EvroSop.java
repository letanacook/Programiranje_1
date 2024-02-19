import java.util.Scanner;

public class EvroSop{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int blagajna = 0;
		int dvaEvra = 0; 
		int enEvro = 0;  
		
		while(sc.hasNextInt()){
			int kovanec = sc.nextInt();
			if(kovanec == 2){
				dvaEvra++; 
				enEvro--; 
			}
			
			if(kovanec == 1){
				enEvro++; 
				blagajna++; 
			}
			
		}
		
		if(enEvro >= 0 && dvaEvra >= 0){
			System.out.println(enEvro);
			System.out.println(dvaEvra); 
		}else{
			System.out.println("BANKROT"); 
		}
	}
}