import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 입력이 끝나기 전에 반복문을 통해서 모두 처리
        for (int i = 0; i < n; i++) {
           String input = br.readLine();
           if (input != null) {
               System.out.println(solution(input));
           }
        }
    }

    private static String solution(String a) {
        Stack stack = new Stack<>();

        String answer = "YES";
        for(int i=0; i < a.length(); i++){
            if(a.charAt(i) == '('){
                stack.push('(');
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    return "NO";
                }
            }
        }

        if(!stack.isEmpty()){
           answer ="NO";
        }

        return answer;
    }
}