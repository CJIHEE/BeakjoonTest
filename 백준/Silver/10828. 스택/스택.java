import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        Stack stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < n ; i++){
            String[] a = bf.readLine().split(" ");
            if(a[0].equals("push")){
                stack.push(a[1]);
            }
            else if(a[0].equals("top")){
                if(!stack.isEmpty()){
                    sb.append(stack.peek()).append('\n');
                }
                else{
                    sb.append(-1).append('\n');
                }
            }
            else if(a[0].equals("size")){
                sb.append(stack.size()).append('\n');
            }
            else if(a[0].equals("empty")){
                if(!stack.isEmpty()){
                    sb.append(0).append('\n');
                }else{
                    sb.append(1).append('\n');
                }
            }
            else if(a[0].equals("pop")){
                if(!stack.isEmpty()){
                    sb.append(stack.pop()).append('\n');
                }else{
                    sb.append(-1).append('\n');
                }
            }
        }
        System.out.println(sb);

    }
}