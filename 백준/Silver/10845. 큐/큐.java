import java.io.*;
import java.util.*;

public class Main {
    static Queue queue = new LinkedList<>();
    static int count = 0;
    static int lastNum = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());

        for(int i =0; i < n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String s = st.nextToken();
            if(s.equals("push")){
                push(Integer.parseInt(st.nextToken()));
            }
            else if(s.equals("pop")){
                if(!queue.isEmpty()){
                    sb.append(queue.poll()).append('\n');
                    count--;
                }else{
                    sb.append(-1).append('\n');
                }
            }
            else if(s.equals("size")){
                sb.append(count).append('\n');
            }
            else if(s.equals("front")){
                if(!queue.isEmpty()){
                    sb.append(queue.peek()).append('\n');
                } else{
                    sb.append(-1).append('\n');
                }
            }
            else if(s.equals("empty")){
                if(!queue.isEmpty()){
                    sb.append(0).append('\n');
                }else{
                    sb.append(1).append('\n');
                }
            }else if(s.equals("back")){
                if(!queue.isEmpty()){
                    sb.append(lastNum).append('\n');
                }else{
                    sb.append(-1).append('\n');
                }
            }
        }

        System.out.println(sb);
    }

    private static void push(int m){
        queue.add(m);
        count++;
        lastNum = m;
    }
}
