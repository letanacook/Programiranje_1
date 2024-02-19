import java.util.Scanner; 

public class PiramidaStevil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		int visina = sc.nextInt(); 
		int zacetnoSt = 1; 
		
		for(int i = 1; i <= visina; i++){
			for(int j = visina - i - 1; j >= 0; j--){
				System.out.print(" ");
			}

			int sirina = i; 
			if(i > 9){
				sirina %= 10; 
			}
			
			for(int k = 1; k <= (2*i - 1); k++){
				System.out.print(sirina); 
				if(sirina < 9){
					sirina++; 
				}else{
					sirina = 0; 
				} 
			}
			System.out.println(); 
		}
	}
}