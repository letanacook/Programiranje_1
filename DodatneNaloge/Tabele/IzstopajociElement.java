import java.util.Scanner; 

public class IzstopajociElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int st = sc.nextInt();
        int stevila[] = new int[st];

        for(int i = 0; i < st; i++){
            stevila[i] = sc.nextInt();
        }

        boolean nic = true;
        for(int i = 0; i < st; i++){
            int gcdBrezI = najvecjiSkupniDelitelj(stevila, st, i);
            if(gcdBrezI > 1 && stevila[i]%gcdBrezI != 0){
                System.out.println(stevila[i]);
                nic = false;
            }
        }
        if(nic){
            System.out.println("NIC");
        }
    }
    public static int gcd(int ena, int dva) {
        while(dva != 0){
            int temp = dva; 
            dva = ena % dva;
            ena = temp;
        }
        return ena;
    }
    public static int najvecjiSkupniDelitelj(int stevila[], int st, int trenutno){
        int gcd = -1;
        for(int i = 0; i < st; i++){
            if(i != trenutno){
                if(gcd == -1){
                    gcd = stevila[i];
                }else{
                    gcd = gcd(gcd, stevila[i]);
                }
                if(gcd == 1){
                    return 1;
                }
            }
        }
        return gcd;
    }
}
 