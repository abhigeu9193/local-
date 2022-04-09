import java.io.*;
import java.util.Scanner;
public class powerOfTwo{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 0;           
        int power = 1;     
        while (i <= n) {
            System.out.println(i + " " + power);  
            power = 2 * power;                
            i = i + 1;
        }

    }
}