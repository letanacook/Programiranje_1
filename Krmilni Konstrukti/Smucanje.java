import java.util.Scanner;

public class Smucanje{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int stSmucarjev = sc.nextInt(); 
		int najSmucar = 0; 
		int najCas = 0; 
		int smucar = 0; 
		
		int cas = 0; 
		smucar++; 
		int prviCas = sc.nextInt();
		if(prviCas > 0){
			int drugiCas = sc.nextInt(); 
			cas = prviCas + drugiCas; 
			if(prviCas > 0 && drugiCas > 0){
				najCas = cas; 
				najSmucar = smucar;
			} 
		}else{
			najCas = 2000;  
		}
		
		while(sc.hasNextInt()){
			cas = 0; 
			smucar++; 
			prviCas = sc.nextInt();
			if(prviCas > 0){
				int drugiCas = sc.nextInt(); 
				cas = prviCas + drugiCas; 
				if(prviCas > 0 && drugiCas > 0){
					if (cas < najCas){
						najCas = cas; 
						najSmucar = smucar;
					} 
				}
			}
		}
		if(najCas == 0 || najSmucar == 0){
			System.out.print("NIHCE");
		}else{
			System.out.println(najSmucar);
			System.out.println(najCas);
		}
	}
}