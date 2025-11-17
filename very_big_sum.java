import java.util.Scanner;

public class very_big_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] myArr = new int[n];

        long result = 0;

        for (int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();
            result += myArr[i];
        }
        System.out.println(result);
    }
}
