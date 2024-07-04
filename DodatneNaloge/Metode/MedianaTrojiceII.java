import java.util.Scanner; 

public class MedianaTrojiceII {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int prvo = sc.nextInt();
       int drugo = sc.nextInt();
       int tretje = sc.nextInt();

       if(max(prvo, drugo) == max(prvo,tretje)) {
           System.out.println(max(drugo,tretje));
       }else{
           if (max(prvo, drugo) == max(drugo, tretje)) {
               System.out.println(max(prvo,tretje));
           }else{
                System.out.println(max(prvo, drugo));
           }
       }

   } 
   public static int min(int ena, int dva){
        return (ena < dva) ? ena : dva;
   }
   public static int max(int ena, int dva){
        return (ena > dva) ? ena : dva;
   }
}
