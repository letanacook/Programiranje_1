import java.util.Scanner;

public class StevilskaZaporedja{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		int apotem = a;
	
	if ((k != 0) && ((a < b) && (k > 0)) || (k != 0) && ((a > b) && (k < 0))){
			if (a <= b){
				int i = 0;
				do{
					System.out.println(a + i);
					apotem = a + i; 
					i += k;
				} while (apotem <= b);
			}else{
				int j = 0;
				do{
					System.out.println(a + j);
					apotem = a + j;
					j += k;
				} while (apotem >= b);
			}
		}else{
			System.out.print("NAPAKA");
		}
	}
}