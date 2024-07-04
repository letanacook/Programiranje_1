import java.util.Scanner; 


public class StetjeKlicev {
    static int klic = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        if(stKlicev(a,b,n) == 0) {
            System.out.println(klic);
        }
    }
    public static int stKlicev(int a, int b, int n){
        if(n == 0) {
            klic++;
            return 0;
        }else{
            klic++;
            return stKlicev(a, b, n/a) + stKlicev(a, b, n/b);
        } 
    }
}
