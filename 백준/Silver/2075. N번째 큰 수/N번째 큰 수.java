import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0; i< n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0; j <n; j++){
                list.add(Integer.parseInt(st.nextToken()));
            }
        }

        System.out.println(soultion(list));

        }

        private static int soultion(ArrayList<Integer> list){
            int answer;
            Collections.sort(list, Collections.reverseOrder());
            answer = list.get(n-1);
            return answer;
        }
}
