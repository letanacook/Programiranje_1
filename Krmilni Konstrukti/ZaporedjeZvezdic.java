import java.util.Scanner;

public class ZaporedjeZvezdic{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int stZvezdic = sc.nextInt();
		
		for (int i = 1; i <= stZvezdic; i++){
			System.out.print("*");
		}
	}
}