import java.util.Scanner;

public class IgorjeviBloki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prvo = sc.nextInt();
        int drugo = sc.nextInt();
        int tretje = sc.nextInt();

        int max = Math.max(prvo, Math.max(drugo, tretje));

        for (int i = 0; i < max; i++) {
            if (i < prvo) {
                for (int j = 0; j < prvo; j++) {
                    System.out.print(prvo);
                }
				if(prvo != max || i < drugo || i < tretje){
					System.out.print(" ");
				}
			}else {
                for (int j = 0; j < prvo; j++) {
                    System.out.print(" ");
                }
				System.out.print(" ");
            }

            if (i < drugo) {
                for (int j = 0; j < drugo; j++) {
                    System.out.print(drugo);
                }
				System.out.print(" "); 
            }else if(drugo > tretje && i >= tretje){
				break;
			}else{
                for (int j = 0; j < drugo; j++) {
                    System.out.print(" ");
                }
				System.out.print(" "); 
            }

            if (i < tretje) {
                for (int j = 0; j < tretje; j++) {
                    System.out.print(tretje);
                }
            }

            System.out.println();
        }
    }
}