import java.util.*;
public class Main {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(solution(1000-n));

    }

    public static int solution(int n){
        //제일 큰수로 나누기
        //나머지 코인 으로 계속 나누기
        int[] coinTypes = {500, 100, 50, 10, 5, 1};
        int count =0;

        for(int i=0; i<coinTypes.length; i++){
            count += n/coinTypes[i]; //몫
            n= n%coinTypes[i]; //나머지
        }
        return count;
    }

}
