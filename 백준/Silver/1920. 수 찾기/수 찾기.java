import java.io.*;
import java.util.*;
public class Main {
    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());


        for(int i =0; i<n; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<m; i++){
            System.out.println(solution(Integer.parseInt(st.nextToken())));
        }
    }

    private static int solution(int num){
        int answer =0 ;
        if(set.contains(num)) answer = 1;

        return answer;
    }

}
