import java.util.Arrays;
import java.util.Scanner;

public class MaksimumiPoStolpcihII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int visina = sc.nextInt();
        int matrika[][] = new int[visina][];
        int maxSirina = 0; 

        for(int i = 0; i < visina; i++){
            int sirina = sc.nextInt();
            if (sirina > maxSirina) {
                maxSirina = sirina;
            }
            matrika[i] = new int[sirina+1];
            matrika[i][0] = sirina;
            for(int j = 1; j < sirina+1; j++){
                matrika[i][j] = sc.nextInt();
            }
        }

        int maxVrednost[] = new int[maxSirina];
        for(int i = 0; i < maxSirina; i++){
            maxVrednost[i] = Integer.MIN_VALUE;
        }

        for(int i = 0; i < visina; i++){
            for(int j = 1; j < matrika[i][0]+1; j++){
                if (matrika[i][j] > maxVrednost[j-1]) {
                    maxVrednost[j-1] = matrika[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(maxVrednost));
    }
}
