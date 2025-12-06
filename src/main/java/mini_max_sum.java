import java.util.Arrays;
import java.util.Scanner;

public class mini_max_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long[] myArr = new long[5];

        for (int i = 0; i < 5; i++){
            myArr[i] = sc.nextInt();
        }
        Arrays.sort(myArr);
        long sum = Arrays.stream(myArr).sum();

        //System.out.println(sum);

        //System.out.println(myArr[4]);

        long minSum = sum - myArr[4];
        long maxSum = sum - myArr[0];

        System.out.println(minSum + " "+ maxSum);


    }
}
