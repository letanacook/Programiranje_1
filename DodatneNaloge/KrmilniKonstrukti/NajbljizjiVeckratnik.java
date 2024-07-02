import java.util.Scanner;

public class NajbljizjiVeckratnik {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();
        int cilj = sc.nextInt();

        int množenje = stevilo; 
        int minRazlika = 100000000;
        int stevec = 2; 
        int najblizje = stevilo; 

        while(množenje <= (cilj + stevilo)){
            int razlika = Math.abs(cilj-množenje);
            if (razlika < minRazlika) {
                minRazlika = razlika;
                najblizje = množenje;
            }
            množenje = stevilo*stevec;
            stevec++; 
        }

        System.out.println(najblizje);
    }
}
