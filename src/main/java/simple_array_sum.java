import java.util.Scanner;

public class simple_array_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] myArr = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();
            sum+=myArr[i];
        }
        System.out.println(sum);




    }
}
