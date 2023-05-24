import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A < 1000 || B < 1000){
            int firstLine = B%10;
            int secondLine = B%100/10;
            int thirdLine = B%1000/100;

            int resultA= A*firstLine;
            int resultB= A*secondLine;
            int resultC= A*thirdLine;

            System.out.println(resultA);
            System.out.println(resultB);
            System.out.println(resultC);
            System.out.println(resultA+resultB*10+resultC*100);
        }





    }

}