import java.util.Scanner;

public class PostevankaIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();
        int max = sc.nextInt();
        int zmnozek = stevilo;

        if (stevilo == max) {
            System.out.printf("%d * %d = %d%n", stevilo, 1, stevilo);
        }

        for(int i = 1; zmnozek + stevilo <= max; i++){
            System.out.printf("%d * %d = %d%n", stevilo, i, stevilo*i);
            zmnozek = i*stevilo;
        }
    }
}
