import java.util.Scanner;

public class DS_Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] myArr = new int[N];
        for(int i = 0; i < N; i++){
            myArr[i] = sc.nextInt();
        }

        for(int i = N-1; i >= 0; i--){
            System.out.print(myArr[i] + " ");
        }

    }
}
