import java.util.List;
import java.util.Scanner;

public class Grading_Students {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //int[] myArr = new int[n];
        //int updateGrade = sc.nextInt();

        for (int i = 0; i < n; i++){
            /*myArr[i] = sc.nextInt();
            if (myArr[i] >= 38){
                if ((myArr[i] + 2) % 5 == 0){
                    updateGrade = myArr[i] + 2;
                } else if ((myArr[i]+1) % 5 == 0) {
                    updateGrade = myArr[i] + 1;
                }
            }else {
                updateGrade = myArr[i];
            }
            System.out.println(updateGrade);*/

            int grade = sc.nextInt();

            if (grade >= 38){
                int nextMultiple = ((grade / 5) + 1) * 5;

                if (nextMultiple - grade < 3){
                    grade = nextMultiple;
                }
            }


            System.out.println(grade);
        }

    }
}
