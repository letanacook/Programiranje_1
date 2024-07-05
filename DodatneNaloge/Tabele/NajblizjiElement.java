import java.util.Scanner; 

public class NajblizjiElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cilj = sc.nextInt();
        int stElementov = sc.nextInt();
        int razlika = Integer.MAX_VALUE;
        int minRazlika = 0;

        int tabela[] = new int[stElementov];

        for(int i = 0; i < stElementov; i++){
            tabela[i] = sc.nextInt();
            if(Math.abs(tabela[i] - cilj) < razlika){
                razlika = Math.abs(tabela[i] - cilj);
                minRazlika = i;
            }
        }

        System.out.println(minRazlika);
    }
}