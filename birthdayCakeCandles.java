import java.util.Scanner;

public class birthdayCakeCandles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] myArr = new int[n];

        for (int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();
        }

        //System.out.println(myArr[0]);

        int max = 0;

        for (int i = 0; i < n; i++){
            if (max < myArr[i]){
                max = myArr[i];
            }
        }

        int maxCount = 0;
        for (int i = 0; i < n; i++){
            if (max == myArr[i]){
                maxCount++;
            }
        }
        //System.out.println(max);
        System.out.println(maxCount);
    }
}
