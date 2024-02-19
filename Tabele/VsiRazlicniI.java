import java.util.Scanner; 

public class VsiRazlicniI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		int stStevil = sc.nextInt(); 
		boolean razlicno = true; 
		int najmanjseSt = 1000; 
		
		int[] zaporedje = new int[stStevil]; 
		
		for(int i = 0; i < stStevil; i++){
			zaporedje[i] = sc.nextInt(); 
		}
		
		for(int i = 0; i < stStevil; i++){
			for(int j = 0; j < stStevil; j++){
				if(i != j && zaporedje[i] == zaporedje[j]){
					razlicno = false; 
					if(zaporedje[i] < najmanjseSt)
						najmanjseSt = zaporedje[i];
				}
			}
		}
		
		if(razlicno){
			System.out.println("RAZLICNI");
		}else{
			System.out.println(najmanjseSt); 
		}
	}
}