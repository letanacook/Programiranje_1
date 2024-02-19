import java.util.Scanner; 

public class MedianaTrojiceII{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int prvoSt = sc.nextInt(); 
		int drugoSt = sc.nextInt(); 
		int tretjeSt = sc.nextInt(); 
		
		/*
		if(min(min(prvoSt, drugoSt), tretjeSt) != prvoSt && maks(maks(drugoSt, tretjeSt), prvoSt) != prvoSt){
			System.out.println(prvoSt); 
		}else if(min(min(prvoSt, drugoSt), tretjeSt) != drugoSt && maks(maks(drugoSt, tretjeSt), prvoSt) != drugoSt){
			System.out.println(drugoSt);
		}else{
			System.out.println(tretjeSt);
		}
		*/
		
		if(maks(prvoSt,drugoSt) == min(prvoSt,tretjeSt) ||
			min(prvoSt,drugoSt) == maks(prvoSt, tretjeSt)){
			System.out.println(prvoSt); 
		}else if(maks(prvoSt, drugoSt) == min(drugoSt, tretjeSt) ||
				min(prvoSt,drugoSt) == maks(drugoSt, tretjeSt)){
			System.out.print(drugoSt); 
		}else{
			System.out.print(tretjeSt);
		}
	}
	
	public static int maks(int prvoSt, int drugoSt){
		if(prvoSt >= drugoSt){
			return prvoSt; 
		}else{
			return drugoSt; 
		}
	}
	
	public static int min(int prvoSt, int drugoSt){
		if(prvoSt <= drugoSt){
			return prvoSt; 
		}else{
			return drugoSt; 
		}
	}
}