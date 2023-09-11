import java.util.*;
public class Main {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int i=0; i<n; i++){
            System.out.println(solution(sc.next()));
        }

    }

    public static String solution(String s){
       Stack<Character> stack = new Stack<>();
        String answer = "YES";
        //System.out.println("s :" + s);
       for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
           //System.out.println("x :" + x);
               if(x == '('){
                    stack.push(x);
               }
               else{
                   if(!stack.isEmpty()){
                       stack.pop();
                   }
                   else{
                       return "NO";
                   }
               }
       }
        if(!stack.isEmpty()){
            answer = "NO";
        }
       return answer;
    }
}
