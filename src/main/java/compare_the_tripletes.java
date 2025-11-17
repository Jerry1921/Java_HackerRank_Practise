import java.util.Scanner;

public class compare_the_tripletes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] aliceArr = new int[3];
        int[] bobArr = new int[3];

        for (int i = 0; i < 3; i++){
            aliceArr[i] = sc.nextInt();
        }

        //System.out.println(aliceArr[0]);

        for (int i = 0; i < 3; i++){
            bobArr[i] = sc.nextInt();
        }
        //System.out.println(bobArr[0]);

        int alicePoint = 0;
        int bobPoint = 0;

        for (int i = 0; i < 3; i++){
            if (aliceArr[i] > bobArr[i]){
                alicePoint++;
            }
            if (aliceArr[i] < bobArr[i]) {
                bobPoint++;
            }
        }

        System.out.print(alicePoint + " "+ bobPoint);
        //System.out.print(bobPoint);



    }
}
