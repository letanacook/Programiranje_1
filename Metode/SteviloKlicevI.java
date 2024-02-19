import java.util.Scanner; 

public class SteviloKlicevI{
	public static void main(String[] args){	
	Scanner sc = new Scanner (System.in);
	
	int a = sc.nextInt(); 
	int b = sc.nextInt(); 
	int n = sc.nextInt(); 
	long steviloKlicev = 0L; 
	
	long stKlicev = funkcija(a, b, n, steviloKlicev);
	System.out.print(stKlicev);
	}
	
	public static long funkcija(int a, int b, int n, long steviloKlicev){
		
		if(n == 0){
			steviloKlicev++; 
		}
		if(n != 0){ 
			steviloKlicev++;
			int prviN = n/a; 
			int drugiN = n/b; 
			System.out.println(steviloKlicev); 
			steviloKlicev = (funkcija(a, b, prviN, steviloKlicev) + funkcija(a, b, drugiN, steviloKlicev));
		}
		return steviloKlicev;
	}
}

