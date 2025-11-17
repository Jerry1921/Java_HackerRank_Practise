import java.util.Scanner;

public class java_loops_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        for(int i = 0; i < q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

           // if (i>0) System.out.println();

            //System.out.println();

            int c = a + b;
            System.out.print(c);

            for(int j = 1; j < n; j++){
                c = c + ((int)Math.pow(2,j) * b);
                System.out.print(" " + c);
            }
            System.out.println();

        }
    }
}
