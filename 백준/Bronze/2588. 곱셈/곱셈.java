import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        System.out.println(A*(B%10)+"\n"+A*(B%100/10)+"\n"+A*(B%1000/100)+"\n"+A*B);
        }

    }
