import java.util.Scanner;

public class output_formatting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();
        sc.close();*/

        /*int integerOne = Integer.parseInt(first);
        System.out.println(first);

        int integerSecond = Integer.parseInt(first);
        System.out.println(integerSecond);

        int integerThird = Integer.parseInt(first);
        System.out.println(integerThird);*/
        System.out.println("================================");

        /*System.out.print(first.substring(0,4));
        System.out.print("               ");
        System.out.println(first.substring(5));

        System.out.print(second.substring(0,3));
        System.out.print("                "+0);
        System.out.println(second.substring(4));

        System.out.print(third.substring(0,6));
        System.out.print("             "+0);
        System.out.println(third.substring(7));*/

        for (int i = 0; i < 3; i++){
            String str = sc.next();
            int num = sc.nextInt();
            System.out.printf("%-15s%03d%n", str, num);
        }

        System.out.println("================================");
        sc.close();





    }
}
