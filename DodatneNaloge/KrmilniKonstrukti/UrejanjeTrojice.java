import java.util.Scanner;

public class UrejanjeTrojice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prvo = sc.nextInt(); 
        int drugo = sc.nextInt();
        int tretje = sc.nextInt();

        if (prvo <= drugo && drugo <= tretje) {
            System.out.printf("%d %d %d%n", prvo, drugo, tretje);
        }else if (drugo <= prvo && prvo <= tretje) {
            System.out.printf("%d %d %d%n", drugo, prvo, tretje);
        }else if (prvo <= tretje && tretje <= drugo) {
            System.out.printf("%d %d %d%n", prvo, tretje, drugo);
        }else if (drugo <= tretje && tretje <= prvo) {
            System.out.printf("%d %d %d%n", drugo, tretje, prvo);
        }else if (tretje <= prvo && prvo <= drugo) {
            System.out.printf("%d %d %d%n", tretje, prvo, drugo);
        }else{
            System.out.printf("%d %d %d%n", tretje, drugo, prvo);
        }
    }
}
