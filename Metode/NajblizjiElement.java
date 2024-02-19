import java.utilScanner; 

public class NajblizjiElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		
		int k = sc.nextInt(); 
		int n = sc.nextInt(); 
		
		int[] tabela = new int[n]; 
		
		for(int i = 0; i < n; i++){
			tabela[i] = sc.nextInt(); 
		}
		
		int min = 100; 
		int minIndeks = 0; 
		
		for(int i = 0; i < n; i++){
			if(Math.abs(tabela[i] - k) < min){
				min = Math.abs(tabela[i] - k);
				minIndeks = i; 
			}
		}
		
		System.out.println(minIndeks);
	}
}