import  java.util.Scanner;

public class MedianaTrojice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prvo = sc.nextInt(); 
        int drugo = sc.nextInt();
        int tretje = sc.nextInt();

        if (prvo <= drugo && drugo <= tretje) {
            System.out.println(drugo);
        }else if (drugo <= prvo && prvo <= tretje) {
            System.out.println(prvo);
        }else if (prvo <= tretje && tretje <= drugo) {
            System.out.println(tretje);
        }else if (drugo <= tretje && tretje <= prvo) {
            System.out.println(tretje);
        }else if (tretje <= prvo && prvo <= drugo) {
            System.out.println(prvo);
        }else{
            System.out.println(drugo);
        }
    }
}
