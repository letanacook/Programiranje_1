import  java.util.Scanner;

public class PostevankaI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();
        int stevec = sc.nextInt();

        for(int i = 1; i <= stevec; i++){
            System.out.println(stevilo*i);
        }
    }
}
