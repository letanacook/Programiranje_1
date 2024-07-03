import java.util.Scanner;

public class StevilskaZaporedja{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zacetek = sc.nextInt();
        int konec = sc.nextInt();
        int skok = sc.nextInt();

        if (skok == 0 || (skok < 0 && konec > zacetek) || (skok > 0 && konec < zacetek)) {
            System.out.print("NAPAKA");
        }else{
            if (zacetek > konec) {
                while(zacetek >= konec){
                    System.out.println(zacetek);
                    zacetek += skok; 
                }   
            }else if(zacetek < konec){
                while(zacetek <= konec){
                    System.out.println(zacetek);
                    zacetek += skok; 
                }
            }else{
                System.out.println(zacetek);
            }
        }
    }
}