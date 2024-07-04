import java.util.Scanner;

public class MnozenjeSSestevanjem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int prvo = sc.nextInt();
        int drugo = sc.nextInt();

        System.out.println(mnozenje(prvo, drugo));
    }

    public static int mnozenje(int prvi, int drugi){
        int rezultat = 0; 
        for(int i = 0; i < prvi; i++){
            rezultat += drugi;
        }
        return  rezultat;
    }
}