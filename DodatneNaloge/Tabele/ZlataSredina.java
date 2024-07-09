import java.util.Scanner;

//dela za prvih 8...the long way
public class ZlataSredina{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int stevila[] = new int[2*k+1];

        

        for(int i = 0; i < 2*k+1; i++){
            stevila[i] = sc.nextInt();
        }

        int iskano = stevila[0];

        for(int i = 0; i < 2*k+1; i++){
            int stVecjih = 0; 
            int stManjsih = 0;
            for(int j = 0; j < 2*k+1; j++){
                if (stevila[j] < stevila[i]) {
                    stManjsih++;
                }else if (stevila[j] > stevila[i]){
                    stVecjih++;
                }
                if (stManjsih > k || stVecjih > k) {
                    break;
                }
            }
            if(stManjsih == stVecjih){
                iskano = stevila[i];
                break;
            }
        }

        System.out.println(iskano);
    }
}

//dela za vseh 10...short and easy way

/*
public class ZlataSredina{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int stevila[] = new int[2*k+1];

        

        for(int i = 0; i < 2*k+1; i++){
            stevila[i] = sc.nextInt();
        }

        int iskano = stevila[0];

        Arrays.sort(stevila);


        if(k > 0){
            iskano = stevila[k];
        }

        System.out.println(iskano);
    }
}

*/
 