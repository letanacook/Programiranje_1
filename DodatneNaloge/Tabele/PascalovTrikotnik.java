import java.util.Scanner; 

public class PascalovTrikotnik{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int pascal[][] = new int[n+2][n+2];
        pascal[1][1] = 1;
        
        for(int i = 1; i <= n + 1; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1){
                    System.out.print("1");
                    pascal[i][j] = 1;
                }else if(j == i) {
                    System.out.print(" 1");
                    pascal[i][j] = 1;
                }else{
                    System.out.printf(" %d", (pascal[i-1][j-1] + pascal[i-1][j]));
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
            }
            System.out.println();
        }
    }
}