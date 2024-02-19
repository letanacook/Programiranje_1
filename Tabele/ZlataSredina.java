import java.util.Scanner; 

public class ZlataSredina{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		int stStevil = sc.nextInt(); 
		int stevilo = 2*stStevil + 1; 
		int[][] stevila = new int[stevilo][3];
		
		for(int i = 0; i < stevilo; i++){
			stevila[i][0] = sc.nextInt(); 
		}
		
		for(int i = 0; i < stevilo; i++){
			for(int j = 0; j < stevilo; j++){
				if(stevila[i][0] > stevila[j][0]){
					stevila[i][1]++;
				}else if(stevila[i][0] < stevila[j][0]){
					stevila[i][2]++;
				}
			} 
		}
		int ustreznoStevilo = 0; 
		for(int i = 0; i < stevilo; i++){
			if(stevila[i][1] == stStevil && stevila[i][2] == stStevil)
				ustreznoStevilo = stevila[i][0];
		}
		
		System.out.println(ustreznoStevilo);
	}
}