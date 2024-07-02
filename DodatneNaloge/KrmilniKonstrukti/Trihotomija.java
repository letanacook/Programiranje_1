import java.util.Scanner;

public class Trihotomija{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int st1 = sc.nextInt();
		int st2 = sc.nextInt();

		if(st1 < st2) {
			System.out.println("-1");
		}else if (st1 > st2) {
			System.out.println("1");
		}else{
			System.out.println("0");
		}
	}
}