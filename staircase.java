import java.util.Scanner;

public class staircase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int symbol = 1; symbol <= n; symbol++){
            //System.out.println(symbol);
            int spaces = n - symbol;
            //System.out.println(symbol + " " + spaces);

            for (int i = 0; i < spaces; i++){
                System.out.print(' ');
            }

            for (int i = 0; i < symbol; i++){
                System.out.print("#");
            }

            System.out.println();
        }

    }
}
