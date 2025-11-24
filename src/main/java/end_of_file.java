import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class end_of_file {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String myString = sc.next();

        int serialNum = 1;

        while(sc.hasNext()){
            System.out.println(serialNum + " " + sc);
        }
    }
}