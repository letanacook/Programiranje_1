import java.util.Scanner;

public class CasovnaRazlika2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ura1 = sc.nextInt();
        int minuta1 = sc.nextInt();
        int ura2 = sc.nextInt();
        int minuta2 = sc.nextInt();

        minuta1 = minuta1 + 60*ura1;
        minuta2 = minuta2 + 60*ura2;

        int razlika = minuta2 - minuta1;

        System.out.printf("%d:%02d%n", (razlika/60), (razlika%60));
    }
}
