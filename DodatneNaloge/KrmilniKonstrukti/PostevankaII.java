import java.util.Scanner;

public class PostevankaII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();
        int stevec = sc.nextInt();

        for(int i = 1; i <= stevec; i++){
            System.out.printf("%d * %d = %d%n", stevilo, i, stevilo*i);
        }
    }
}
