import java.util.Scanner; 

public class TelefonskiImenik{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		
		int stLjudi = sc.nextInt(); 
		
		String[][] imenik = new String[stLjudi][2];
		Boolean obstaja = false; 
		
		for(int i = 0; i < stLjudi; i++){
			imenik[i][0] = sc.next(); 
			imenik[i][1] = sc.next(); 
		}
		
		int stImen = sc.nextInt(); 
		
		for(int i = 0; i < stImen; i++){
			String ime = sc.next(); 
			String stevilka = "0";
			for(int j = 0; j < stLjudi; j++){
				if(imenik[j][0].equals(ime)){
					stevilka = imenik[j][1]; 
					obstaja = true; 
				}
			}
			if(obstaja == false){
				System.out.println("NEZNANA");
			}else{
				System.out.println(stevilka);
			}
				obstaja = false;
		}
	}
	
}