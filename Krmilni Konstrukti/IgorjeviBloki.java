import java.util.Scanner; 

public class IgorjeviBloki{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int prvoSt = sc.nextInt(); 
		int drugoSt = sc.nextInt(); 
		int tretjeSt = sc.nextInt(); 
		
		int najvecje = prvoSt > (drugoSt > tretjeSt ? drugoSt : tretjeSt) ? prvoSt : ((drugoSt > tretjeSt) ? drugoSt : tretjeSt);
		
		for (int i = 0; i < najvecje; i++) {
			if (i < prvoSt){
				for(int j = 0; j < prvoSt; j++){
					System.out.print(prvoSt);
				}
			}else{
				for(int j = 0; j < prvoSt; j++){
					System.out.print(" ");
				}
			}
			if(i < drugoSt){
				System.out.print(" ");
				for(int k = 0; k < drugoSt; k++){
					System.out.print(drugoSt);
				}
			}else if(drugoSt < tretjeSt){
				for(int k = 0; k <= drugoSt; k++){
					System.out.print(" ");
				}
			}
			if(i < tretjeSt){
				System.out.print(" ");
				for(int g = 0; g < tretjeSt; g++){
					System.out.print(tretjeSt);
				}
			}
            System.out.println();
		}
	}
}