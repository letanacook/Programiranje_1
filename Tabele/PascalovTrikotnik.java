import java.util.Scanner; 

public class PascalovTrikotnik{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		
		int stevilo = sc.nextInt();
		int[][] stevke = new int[stevilo + 2][stevilo + 2];
		
		if(stevilo > 1){
			stevke[1][1] = 1; 
			stevke[2][1] = 1; 
			stevke[2][2] = 1;
		}
		 
		for(int i = 1; i <= stevilo + 1; i++){
			for(int j = 1; j <= i; j++){
				if(stevke[i][j] > 1){
					System.out.print(stevke[i][j] + " ");
				}else if(j == i){
					stevke[i][j] = 1; 
					System.out.print("1");
				}else{
					stevke[i][j] = (stevke[i-1][j-1] + stevke[i-1][j]);
					System.out.print(stevke[i][j] + " ");
				}
			}
			System.out.println(); 
			
		}
	}
	
}