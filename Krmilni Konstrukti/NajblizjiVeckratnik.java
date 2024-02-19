import java.util.Scanner;

public class NajblizjiVeckratnik{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		
		int stevilo = sc.nextInt ();
		int meja = sc.nextInt ();
		int najVeckratnik = stevilo - 1;
		
		if (meja%stevilo == 0){
			System.out.print(meja);
		}else{
			for (int i = meja - stevilo/2; i <= meja + stevilo/2; i++ ){
				if (i%stevilo == 0){
					if (meja - i < najVeckratnik || i - meja < najVeckratnik){
						najVeckratnik = i;
					}else if (meja - najVeckratnik <= stevilo/2){
							break;
					}
				}
			}
			System.out.print(najVeckratnik);
		}
	}
}