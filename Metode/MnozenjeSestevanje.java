import java.util.Scanner; 

public class MnozenjeSestevanje{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int prvoSt = sc.nextInt();
		int drugoSt = sc.nextInt();
		
		System.out.print(vsota(prvoSt, drugoSt));
	}
	
	public static int vsota(int prvoSt, int drugoSt){
		int vsota = 0; 
		
		for(int i = 1; i <= drugoSt; i++){
			vsota += prvoSt; 
		}
		
		return vsota; 
	}
}