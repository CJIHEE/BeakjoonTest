import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < n; i++){
            map.put(Integer.parseInt(st.nextToken()), i);
        }

        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        for( int i=0; i < m; i++){
            System.out.println(solution(Integer.parseInt(st.nextToken()), map));
        }

    }
    private static int solution(int m, HashMap map){
        int answer = 0;
        if(map.containsKey(m)) answer =1;

        return answer;
    }
}
