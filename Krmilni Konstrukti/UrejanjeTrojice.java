import java.util.Scanner;

public class UrejanjeTrojice{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		
		int prvo = sc.nextInt ();
		int drugo = sc.nextInt ();
		int tretje = sc.nextInt ();
	
		if (prvo <= drugo && prvo <= tretje){
				if (drugo <= tretje){
					System.out.printf("%d %d %d", prvo, drugo, tretje);
				}else{
					System.out.printf("%d %d %d", prvo, tretje, drugo);
				}
		}else if (drugo <= prvo && drugo <= tretje){	
				if (prvo <= tretje){
					System.out.printf("%d %d %d", drugo, prvo, tretje);
				}else{
					System.out.printf("%d %d %d", drugo, tretje, prvo);
				}
		}else if (tretje <= prvo && tretje <= drugo){
				if (prvo <= drugo){
					System.out.printf("%d %d %d", tretje, prvo, drugo);
				}else{
					System.out.printf("%d %d %d", tretje, drugo, prvo);
				}
			}
	}
}