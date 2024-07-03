import java.util.Scanner;

public class Evrosop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enEvro = 0;
        int dvaEvra = 0; 
        int trenutni = 0; 
        boolean bankrot = false;
        
        while(sc.hasNextInt()){
            trenutni = sc.nextInt();
            if (trenutni == 1) {
                enEvro++;
            }else{
                if(enEvro >= 1) {
                    enEvro--;
                    dvaEvra++;
                }else{
                    bankrot = true; 
                }
            }
        }
        if(bankrot){
            System.out.println("BANKROT");
        }else{
            System.out.println(enEvro);
            System.out.println(dvaEvra);
        }

    }
}
