import java.util.Scanner;

public class diagonal_difference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] myMatrix = new int[n][n];



        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                myMatrix[i][j] = sc.nextInt();
            }
        }

        int diagonalLeftToRightSum = 0;
        int diagonalRightToLeftSum = 0;

        for (int i = 0; i < n; i++){
            diagonalLeftToRightSum += myMatrix[i][i];
            diagonalRightToLeftSum += myMatrix[i][n-1-i];
        }

        int absDifference = Math.abs(diagonalRightToLeftSum-diagonalLeftToRightSum);

        System.out.println(absDifference);
    }
}
